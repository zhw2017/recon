package com.pay.recontwo.core.parse.file.base;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pay.recontwo.bean.ReturnResult;
import com.pay.recontwo.enums.TransTypeEnum;
import com.pay.recontwo.model.BankOrder;
import com.pay.recontwo.model.BusiAssSet;
import com.pay.recontwo.model.FileParseLog;
import com.pay.recontwo.model.FileParseSet;
import com.pay.recontwo.model.FileTempletSet;

/**
 * @Description: 天津浦发对账文件解析
 * @see: TianJinPFUnipayAdvanceRemitTransImpl 此处填写需要参考的类
 * @version 2018年2月11日 下午3:36:45
 * @author yukun.cui
 */
@Service("tianJinPFUnipayAdvanceRemitTrans")
public class TianJinPFUnipayAdvanceRemitTransImpl extends GenBankOrderTransBase {

	@Resource
	private BankOrderService bankOrderService;

	@Override
	public boolean isExistTitle() {
		return false;
	}

	@Override
	public String beforeParseLineToBean(String line) {
		line = line.replaceAll("	", " ");
		line = line.replaceAll(" +", " ");
		return line;
	}

	@Override
	public boolean isCheckDown() {
		return false;
	}

	@Override
	public boolean isFilterLineBaseOnBean(BusiAssSet busiAssSet, BankOrder model) {
		// REMIT_SPDB_120001 天津浦发
		if ("310113148164028".equals(model.getTransTypeCode())) {
			return false;
		}
		return true;
	}

	@Override
	public void afterParseLineToBean(BankOrder model) {
		Calendar now = Calendar.getInstance();
		String bankExternalId = model.getBankExternalId();
		// 1330110000000000000000KY2017092700003771
		String checkId = bankExternalId.substring(22);
		model.setCheckId(checkId);
		String def1 = model.getDef1();
		String year = String.valueOf(now.get(Calendar.YEAR));
		Date bankTransTime = DateUtils.parseDate(StringUtils.concatToSB(year, def1).toString(), "yyyyMMddhhmmss");
		model.setBankTransTime(bankTransTime);
		Double transAmount = Double.valueOf(model.getTransAmount());

		model.setTransAmount(AmountUtils.divide(transAmount, 100.00));
		Double transFee = Double.valueOf(String.valueOf(model.getTransferFee()).substring(1));
		model.setTransferFee(AmountUtils.divide(transFee, 100.00));
		model.setTransStatus(TransTypeEnum.DPAY.toString());
		log.info("model={}", model);
	}

	@Override
	public void afterParseFile(ReturnResult<BankOrder> returnResult, List<BankOrder> listModel, BusiAssSet busiAssSet, FileParseSet fileParseSet,
			FileTempletSet fileTempletSet, FileParseLog fileParseLog) {
		if (listModel != null && !listModel.isEmpty()) {
			bankOrderService.insertListByDate(fileParseLog.getFileDate(), listModel);
		}
	}
}