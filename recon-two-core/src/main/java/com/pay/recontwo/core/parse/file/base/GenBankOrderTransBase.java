package com.pay.recontwo.core.parse.file.bank;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.Resource;

import com.pay.commons.utils.lang.StringUtils;
import com.pay.recontwo.bean.ReturnResult;
import com.pay.recontwo.core.parse.file.base.GenFileTransBase;
import com.pay.recontwo.core.service.BankOrderService;
import com.pay.recontwo.core.service.ChannelTransTypeService;
import com.pay.recontwo.core.utils.ListUtils;
import com.pay.recontwo.model.BankOrder;
import com.pay.recontwo.model.BusiAssSet;
import com.pay.recontwo.model.ChannelTransType;
import com.pay.recontwo.model.FileParseLog;
import com.pay.recontwo.model.FileParseSet;
import com.pay.recontwo.model.FileTempletSet;

/**
 * @Description: 银联流水明细解析-一般文件方式
 * @see: GenBankOrderTransBase 此处填写需要参考的类
 * @version 2017年1月3日 下午3:22:00
 * @author guangzhi.ji
 */
public abstract class GenBankOrderTransBase extends GenFileTransBase<BankOrder, BankOrder> {
	@Resource
	private BankOrderService bankOrderService;
	@Resource
	private ChannelTransTypeService channelTransTypeService;
	private ConcurrentHashMap<String, String> transTypeHashMap = new ConcurrentHashMap<>();

	public GenBankOrderTransBase() {
		super(BankOrder.class);
	}

	@Override
	public void beforeParseFile(ReturnResult<BankOrder> returnResult, List<BankOrder> listModel, BusiAssSet busiAssSet, FileParseSet fileParseSet,
			FileTempletSet fileTempletSet, FileParseLog fileParseLog) {
		/** 初始化交易类型用于过滤 */
		List<ChannelTransType> listChannelTransType = channelTransTypeService.findByBusiAssSetId(busiAssSet.getId());
		if (!ListUtils.isBlankList(listChannelTransType)) {
			for (ChannelTransType channelTransType : listChannelTransType) {
				String key = StringUtils.concatToSB(channelTransType.getBankMessageType(), "|", channelTransType.getBankTransType()).toString();
				transTypeHashMap.put(key, channelTransType.getSysTransType());
			}
		}
	}

	@Override
	public boolean isFilterLineBaseOnBean(BusiAssSet busiAssSet, BankOrder model) {
		/** 如果不配置交易类型就不判断 */
		if (!transTypeHashMap.isEmpty()) {
			String messageType = model.getMessageType();
			String transTypeCode = model.getTransTypeCode();
			String key = StringUtils.concatToSB(messageType, "|", transTypeCode).toString();
			if (transTypeHashMap.containsKey(key)) {
				model.setTransStatus(transTypeHashMap.get(key));
				return false;
			}
		} else {
			return false;
		}
		return super.isFilterLineBaseOnBean(busiAssSet, model);
	}

	@Override
	public void suppleBusiData(String bankInstNo, String clearDate, String settleDate, BankOrder model, BusiAssSet busiAssSet) {
		model.setBusiCode(busiAssSet.getBusiCode());
		model.setBusiName(busiAssSet.getBusiName());
		model.setBusiType(busiAssSet.getBusiType());
		model.setFundSettleAccCode(busiAssSet.getFundSettleAccCode());
		model.setFundSettleAccName(busiAssSet.getFundSettleAccName());
		model.setOrganization(busiAssSet.getOrganization());
		model.setAccessInst(bankInstNo);
		/** 银行清算日期、银行结算日期 优先使用文件模板配置的 */
		if (model.getBankSettleDate() == null) {
			model.setBankSettleDate(settleDate);
		}
		if (model.getBankClearDate() == null) {
			model.setBankClearDate(clearDate);
		}
		model.setCheckPeriod(clearDate);
		model.setPayChannelCode(busiAssSet.getDefaultChannel());
	}

	@Override
	public void afterParseFile(ReturnResult<BankOrder> returnResult, List<BankOrder> listModel, BusiAssSet busiAssSet, FileParseSet fileParseSet,
			FileTempletSet fileTempletSet, FileParseLog fileParseLog) {
		returnResult.setGoObject(listModel);
		if (listModel != null && !listModel.isEmpty()) {
			bankOrderService.insertListByDate(fileParseLog.getFileDate(), listModel);
		}
	}

	@Override
	public void delHistoryData(String instNo, String busiCode, String clearDate, String fileName) {
		bankOrderService.delHistoryData(busiCode, clearDate, fileName);
	}

}
