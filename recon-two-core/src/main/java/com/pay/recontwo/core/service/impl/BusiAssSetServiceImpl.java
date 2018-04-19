package com.pay.recontwo.core.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.pay.commons.utils.lang.AmountUtils;
import com.pay.idgenerator.api.IDGeneratorInterface;
import com.pay.recontwo.bean.WebResult;
import com.pay.recontwo.core.dao.BusiAssSetDao;
import com.pay.recontwo.core.exception.BusiCheckException;
import com.pay.recontwo.core.exception.BusinessException;
import com.pay.recontwo.core.service.BankOrderService;
import com.pay.recontwo.core.service.BusiAssSetService;
import com.pay.recontwo.core.service.BusiCheckLogService;
import com.pay.recontwo.core.service.BusiCheckResultService;
import com.pay.recontwo.core.service.BusiTransChargeService;
import com.pay.recontwo.core.service.FileParseLogService;
import com.pay.recontwo.core.service.FileParseSetService;
import com.pay.recontwo.core.service.FileTempletSetService;
import com.pay.recontwo.core.service.ParseAggService;
import com.pay.recontwo.core.service.SysOrderService;
import com.pay.recontwo.core.utils.C;
import com.pay.recontwo.core.utils.ErrorCodeUtis;
import com.pay.recontwo.core.utils.FileUtils;
import com.pay.recontwo.core.utils.HostUtils;
import com.pay.recontwo.core.utils.ListUtils;
import com.pay.recontwo.core.utils.SelfDateUtils;
import com.pay.recontwo.core.utils.SelfStringUtils;
import com.pay.recontwo.enums.BusiTypeEnum;
import com.pay.recontwo.enums.CheckResultTypeEnum;
import com.pay.recontwo.enums.DealStatusEnum;
import com.pay.recontwo.enums.ExecModeEnum;
import com.pay.recontwo.enums.ExecStatusEnum;
import com.pay.recontwo.enums.FileSourceDiviEnum;
import com.pay.recontwo.enums.OrganizationEnum;
import com.pay.recontwo.enums.ResultCodeEnum;
import com.pay.recontwo.enums.TimeFreEnum;
import com.pay.recontwo.model.BankOrder;
import com.pay.recontwo.model.BusiAssSet;
import com.pay.recontwo.model.BusiCheckLog;
import com.pay.recontwo.model.BusiCheckResult;
import com.pay.recontwo.model.BusiTransCharge;
import com.pay.recontwo.model.FileParseSet;
import com.pay.recontwo.model.FileTempletSet;
import com.pay.recontwo.model.SysOrder;

/**
 * @Description: 这里用一句话描述这个类的作用
 * @see: BusiAssSetServiceImpl 此处填写需要参考的类
 * @version 2016年10月15日 下午15:49:48
 * @author guangzhi.ji
 */
@Service("busiAssSetService")
public class BusiAssSetServiceImpl extends BusiAssSetDao implements BusiAssSetService {
	private static Logger logMonitor = LoggerFactory.getLogger("monitor");
	@Resource
	private ParseAggService parseAggService;
	@Resource
	private SysOrderService sysOrderService;
	@Resource
	private BankOrderService bankOrderService;
	@Resource
	private BusiTransChargeService busiTransChargeService;
	@Resource
	private BusiCheckResultService busiCheckResultService;
	@Resource
	private BusiAssSetService busiAssSetService;
	@Resource
	private BusiCheckLogService busiCheckLogService;
	@Resource
	private FileParseSetService fileParseSetService;
	@Resource
	private FileParseLogService fileParseLogService;
	@Resource
	private FileTempletSetService fileTempletSetService;
	@Resource
	private FileUtils fileUtils;
	@Resource
	private IDGeneratorInterface idGeneratorInterface;

	@Override
	public void parseBusiFile(String execDate, BusiAssSet busiAssSet, ExecModeEnum execModeEnum, String fileSourceDivi, TimeFreEnum timeFreEnum, String operator) {
		parseAggService.parseBusiFile(execDate, busiAssSet, execModeEnum, fileSourceDivi, timeFreEnum, operator);
	}

	@Override
	public BusiAssSet findByBusiCode(String busiCode) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("busiCode", busiCode);
		List<BusiAssSet> findByMap = super.findByMap(map);
		if (ListUtils.isBlankList(findByMap)) {
			return null;
		}
		return findByMap.get(0);
	}

	@Override
	public List<BusiAssSet> findByInstNo(String instNo) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("instNo", instNo);
		List<BusiAssSet> findByMap = super.findByMap(map);
		if (ListUtils.isBlankList(findByMap)) {
			return null;
		}
		return findByMap;
	}

	@Override
	public void busiCheck(String busiCode, String checkPeriod, ExecModeEnum execMode, TimeFreEnum timeFreEnum, String operator) {
		BusiAssSet busiAssSet = busiAssSetService.findByBusiCode(busiCode);
		String instNo = busiAssSet.getInstNo();
		log.info("##busiCheck Start#,instNo[" + instNo + "],busiCode[" + busiCode + "],checkPeriod[" + checkPeriod + "] #####");
		String busiName = busiAssSet.getBusiName();
		String busiType = busiAssSet.getBusiType();
		String fundSettleAccCode = busiAssSet.getFundSettleAccCode();
		int interruptNum = busiAssSet.getInterruptNum();
		/** 成本或者手续费 差异最大条数 */
		int diffCount = interruptNum;
		BusiCheckResult busiCheckResult = new BusiCheckResult();
		busiCheckResult.setAccessInst(instNo);
		busiCheckResult.setCheckPeriod(checkPeriod);
		busiCheckResult.setOrganization(busiAssSet.getOrganization());
		busiCheckResult.setPayChannelCode(busiAssSet.getDefaultChannel());
		busiCheckResult.setBusiCode(busiCode);
		busiCheckResult.setBusiName(busiName);
		busiCheckResult.setBusiType(busiType);
		/** 双边数量 **/
		int bilateralCount = 0;
		/** 双边银行金额 **/
		double bilateralBankAmt = 0;
		/** 双边系统金额 **/
		double bilateralSysAmt = 0;
		/** 双边银行手续费 **/
		double bilateralBankFee = 0;
		/** 双边系统手续费 **/
		double bilateralSysFee = 0;
		/** 双边银行成本 **/
		double bilateralBankCost = 0;
		/** 双边系统成本 **/
		double bilateralSysCost = 0;
		/** 系统数量 **/
		int sysCount = 0;
		/** 系统金额 **/
		double sysAmount = 0;
		/** 系统手续费 **/
		double sysFee = 0;
		/** 商户手续费 **/
		double sysCustomerFee = 0;
		/** 银行数量 **/
		int bankCount = 0;
		/** 银行金额 **/
		double bankAmount = 0;
		/** 银行成本 **/
		double bankCost = 0;
		/** 银行手续费 **/
		double bankFee = 0;
		/** 系统单边数量 **/
		int sysSideCount = 0;
		/** 系统单边总金额 **/
		double sysSideAmount = 0;
		/** 系统单边总成本 **/
		double sysSideCost = 0;
		/** 系统单边总手续费 **/
		double sysSideFee = 0;
		/** 银行单边数量 **/
		int bankSideCount = 0;
		/** 银行单边总金额 **/
		double bankSideAmount = 0;
		/** 银行单边总成本 **/
		double bankSideCost = 0;
		/** 银行单边总手续费 **/
		double bankSideFee = 0;
		BusiCheckLog busiCheckLog = new BusiCheckLog(checkPeriod, instNo, busiType, busiCode, busiName, execMode.toString(), HostUtils.getHostIp(), new Date(),
				operator);
		/** 检查是否在执行 */
		String execStatus = busiAssSet.getExecStatus();
		if (ExecStatusEnum.PROCESSING.toString().equals(execStatus)) {
			busiCheckLogService.recordBusiCheckLog(busiCheckLog, timeFreEnum, ResultCodeEnum.FAIL.toString(), ErrorCodeUtis.BUSI_CHECK_PROCESSING, "上次执行未完成请等待!");
			throw new BusiCheckException(ErrorCodeUtis.BUSI_CHECK_PROCESSING, "上次执行未完成请等待!");
		}
		try {
			if (ExecModeEnum.TASK.toString().equals(execMode.toString())) {
				BusiCheckResult result = busiCheckResultService.findByBusiCodeAndDate(busiCode, checkPeriod);
				if (result != null) {
					log.info("BusiCheckResult checkPeriod:{},busiCode:{} - isExist", checkPeriod, busiCode);
					return;
				}
			}
			/** 检查并发操作 */
			busiAssSet.setExecStatus(ExecStatusEnum.PROCESSING.toString());
			int updateById = busiAssSetService.updateById(busiAssSet);
			if (updateById <= 0) {
				busiCheckLogService.recordBusiCheckLog(busiCheckLog, timeFreEnum, ResultCodeEnum.FAIL.toString(), ErrorCodeUtis.BUSI_CHECK_RETRY, "并发操作请重试!");
				throw new BusiCheckException(ErrorCodeUtis.BUSI_CHECK_RETRY, "并发操作请重试!");
			}
			List<FileParseSet> listFileParseSetBank = fileParseSetService.findUseByBusiAssIdAndFileType(busiAssSet.getId(), FileSourceDiviEnum.BANK.toString());
			if (!ListUtils.isBlankList(listFileParseSetBank)) {
				for (FileParseSet fileParseSet : listFileParseSetBank) {
					String fileCode = fileParseSet.getFileCode();
					FileTempletSet fileTempletSet = fileTempletSetService.findByFileCode(fileCode);
					String fileRegExp = fileTempletSet.getFileRegExp();
					String fileName = fileUtils.converFileName(fileRegExp, checkPeriod);
					String localPath = fileParseSet.getLocalDir();
					localPath = fileUtils.converFileName(localPath, checkPeriod);
					localPath = fileUtils.chechPath(localPath);
					boolean findParseSuccess = fileParseLogService.findParseSuccess(busiCode, fileName, localPath);
					if (!findParseSuccess) {
						log.warn("File not parse complement!fileName:" + fileName);
						busiCheckLogService.recordBusiCheckLog(busiCheckLog, timeFreEnum, ResultCodeEnum.FAIL.toString(),
								ErrorCodeUtis.BUSI_CHECK_BANKFILE_NO_PARSE, "银行文件未解析完成!");
						throw new BusiCheckException(ErrorCodeUtis.BUSI_CHECK_BANKFILE_NO_PARSE, "File not parse complement!fileName:" + fileName);
					}
				}
			} else {
				busiCheckLogService.recordBusiCheckLog(busiCheckLog, timeFreEnum, ResultCodeEnum.FAIL.toString(), ErrorCodeUtis.BUSI_CHECK_NO_SET_BANKFILE,
						"未配置银行文件!");
				throw new BusiCheckException(ErrorCodeUtis.BUSI_CHECK_NO_SET_BANKFILE, "busicode:[" + busiCode + "], not set bank file");
			}
			List<FileParseSet> listFileParseSetSys = fileParseSetService.findByBusiAssIdAndFileType(busiAssSet.getId(), FileSourceDiviEnum.SYS.toString());
			if (!ListUtils.isBlankList(listFileParseSetSys)) {
				for (FileParseSet fileParseSet : listFileParseSetSys) {
					String isParse = fileParseSet.getIsParse();
					/** 只有设置成解析 才去检查是否完成 */
					if (isParse != null && isParse.equals("Y")) {
						String fileCode = fileParseSet.getFileCode();
						FileTempletSet fileTempletSet = fileTempletSetService.findByFileCode(fileCode);
						String fileRegExp = fileTempletSet.getFileRegExp();
						String fileName = fileUtils.converFileName(fileRegExp, checkPeriod);
						String localPath = fileParseSet.getLocalDir();
						localPath = fileUtils.converFileName(localPath, checkPeriod);
						localPath = fileUtils.chechPath(localPath);
						boolean findParseSuccess = fileParseLogService.findParseSuccess(busiCode, fileName, localPath);
						if (!findParseSuccess) {
							log.warn("File not parse complement!fileName:" + fileName);
							busiCheckLogService.recordBusiCheckLog(busiCheckLog, timeFreEnum, ResultCodeEnum.FAIL.toString(),
									ErrorCodeUtis.BUSI_CHECK_SYSFILE_NO_PARSE, "系统文件未解析完成!");
							throw new BusiCheckException(ErrorCodeUtis.BUSI_CHECK_SYSFILE_NO_PARSE, "File not parse complement!fileName:" + fileName);
						}
					}
				}
			} else {
				busiCheckLogService.recordBusiCheckLog(busiCheckLog, timeFreEnum, ResultCodeEnum.FAIL.toString(), ErrorCodeUtis.BUSI_CHECK_NO_SET_SYSFILE,
						"未配置系统文件!");
				throw new BusiCheckException(ErrorCodeUtis.BUSI_CHECK_NO_SET_SYSFILE, "busicode:[" + busiCode + "], not set sys file");
			}
			if (ExecModeEnum.MANUAL.toString().equals(execMode.toString())) {
				/** 清除对账结果 */
				clearCheckResult(busiCode, checkPeriod);
			}
			List<SysOrder> sysCheckOrderList = sysOrderService.findByBusiCodeAndDate(instNo, busiCode, checkPeriod);
			sysCheckOrderList = sysCheckOrderList == null ? new ArrayList<>() : sysCheckOrderList;
			int sysListSize = sysCheckOrderList.size();
			log.info("sysCount" + sysListSize);
			List<BankOrder> bankCheckOrderList = bankOrderService.findByBusiCodeAndDateValid(instNo, busiCode, checkPeriod);
			bankCheckOrderList = bankCheckOrderList == null ? new ArrayList<>() : bankCheckOrderList;
			if (bankCheckOrderList.isEmpty() && sysCheckOrderList.isEmpty()) {
				log.info("BankOrder and SysOrder - No data");
				busiCheckLogService.recordBusiCheckLog(busiCheckLog, timeFreEnum, ResultCodeEnum.FAIL.toString(), ErrorCodeUtis.BUSI_CHECK_BANK_EMPTY, "银行和系统数据为空!");
				throw new BusiCheckException(ErrorCodeUtis.BUSI_CHECK_BANK_EMPTY, "BankOrder and SysOrder - No data");
			}
			int bankListSize = bankCheckOrderList.size();
			log.info("bankCount" + bankListSize);
			int diff = Math.abs(sysListSize - bankListSize);
			log.info("Abs Diff: " + diff);
			if (diff > interruptNum) {
				log.error("diff-data row more than interruptNum:" + interruptNum + ",not check");
				busiCheckLogService.recordBusiCheckLog(busiCheckLog, timeFreEnum, ResultCodeEnum.FAIL.toString(), ErrorCodeUtis.BUSI_CHECK_BIDIFF_EXCEED,
						"双方记录相差过大,未对账!");
				throw new BusiCheckException(ErrorCodeUtis.BUSI_CHECK_BIDIFF_EXCEED, "diff-data row more than interruptNum:" + interruptNum + ",not check");
			}

			Map<String, SysOrder> sysMap = new HashMap<String, SysOrder>(sysListSize);
			int sRow = 0;
			for (SysOrder sysOrd : sysCheckOrderList) {
				if (!sysMap.containsKey(sysOrd.getCheckId())) {
					sysMap.put(sysOrd.getCheckId(), sysOrd);
				} else {
					/** 第一次打印日志,用于日志监控 */
					if (sRow < C.NOTICE_ONE) {
						String classMethod = Thread.currentThread().getStackTrace()[1].getClassName() + "."
								+ Thread.currentThread().getStackTrace()[1].getMethodName();
						logMonitor.warn(String.format(SelfStringUtils.LOG_FORMAT, classMethod, "sys.repeat.checkId", sysOrd.getCheckId(), "begin", "success", "-",
								"-"));

					}
					sRow++;
				}
			}
			int bRow = 0;
			Map<String, BankOrder> bankMap = new HashMap<String, BankOrder>(bankListSize);
			for (BankOrder bankOrd : bankCheckOrderList) {
				if (!bankMap.containsKey(bankOrd.getCheckId())) {
					bankMap.put(bankOrd.getCheckId(), bankOrd);
				} else {
					/** 第一次打印日志,用于日志监控 */
					if (bRow < C.NOTICE_ONE) {
						String classMethod = Thread.currentThread().getStackTrace()[1].getClassName() + "."
								+ Thread.currentThread().getStackTrace()[1].getMethodName();
						logMonitor.warn(String.format(SelfStringUtils.LOG_FORMAT, classMethod, "bank.repeat.checkId", bankOrd.getCheckId(), "begin", "success", "-",
								"-"));
					}
					bRow++;
				}
			}

			log.info("sysMap:" + sysMap.size());
			log.info("bankMap:" + bankMap.size());
			/** 系统单边 */
			List<BusiTransCharge> sysSideList = new ArrayList<BusiTransCharge>();
			/** 银行单边 */
			List<BusiTransCharge> bankSideList = new ArrayList<BusiTransCharge>();
			/** 金额不等 */
			List<BusiTransCharge> amountNotEqList = new ArrayList<BusiTransCharge>();
			/** 成本不等 */
			List<BusiTransCharge> costNotEqList = new ArrayList<BusiTransCharge>();
			/** 手续费不等 */
			List<BusiTransCharge> feeNotEqList = new ArrayList<BusiTransCharge>();
			/** 从系统交易 往银行对账文件 匹配 */
			for (String checkId : sysMap.keySet()) {
				SysOrder sysOrd = sysMap.get(checkId);
				BankOrder bankOrd = bankMap.get(checkId);

				/** 汇总系统订单记录 */
				sysCount++;
				sysAmount = AmountUtils.add(sysAmount, sysOrd.getTransAmount());
				sysFee = AmountUtils.add(sysFee, sysOrd.getTransCost());
				sysCustomerFee = AmountUtils.add(sysCustomerFee, sysOrd.getTransFee());

				/** 双方成功记录 */
				if (bankOrd != null) {
					bilateralCount++;
					bilateralBankAmt = AmountUtils.add(bilateralBankAmt, bankOrd.getTransAmount());
					bilateralBankCost = AmountUtils.add(bilateralBankCost, bankOrd.getTransCost());
					bilateralSysAmt = AmountUtils.add(bilateralSysAmt, sysOrd.getTransAmount());
					bilateralSysCost = AmountUtils.add(bilateralSysCost, sysOrd.getTransCost());
					bilateralSysFee = AmountUtils.add(bilateralSysFee, sysOrd.getTransFee());
					if (amountNotEqList.size() < diffCount) {
						if (!AmountUtils.eq(bankOrd.getTransAmount(), sysOrd.getTransAmount())) {
							sysOrd = sysOrderService.findSysOrderById(busiCode, checkPeriod, sysOrd.getId());
							bankOrd = bankOrderService.findBankOrderById(busiCode, checkPeriod, bankOrd.getId());
							BusiTransCharge busiTransCharge = new BusiTransCharge(operator);
							busiTransCharge.setAccessInst(instNo);
							busiTransCharge.setCheckPeriod(checkPeriod);
							busiTransCharge.setPan(sysOrd.getPan());
							busiTransCharge.setBusiCode(busiCode);
							busiTransCharge.setBusiName(busiName);
							busiTransCharge.setBusiType(busiType);
							busiTransCharge.setFundSettleAccCode(fundSettleAccCode);
							busiTransCharge.setCheckId(sysOrd.getCheckId());
							busiTransCharge.setOrganization(sysOrd.getOrganization());
							busiTransCharge.setPayChannelCode(sysOrd.getPayChannelCode());

							busiTransCharge.setSysTransTime(sysOrd.getTransTime());
							busiTransCharge.setSysClearDate(sysOrd.getSysClearDate());
							busiTransCharge.setSysAmount(sysOrd.getTransAmount());
							busiTransCharge.setSysCost(sysOrd.getTransCost());
							busiTransCharge.setCustomerNo(sysOrd.getCustomerNo());
							busiTransCharge.setOrderId(sysOrd.getBankExternalId() == null ? sysOrd.getCheckId() : sysOrd.getBankExternalId());
							busiTransCharge.setBankExternalId(sysOrd.getBankExternalId());
							busiTransCharge.setTransType(sysOrd.getTransStatus());

							busiTransCharge.setBankTransTime(bankOrd.getBankTransTime());
							busiTransCharge.setBankClearDate(bankOrd.getBankClearDate());
							busiTransCharge.setBankAmount(bankOrd.getTransAmount());
							busiTransCharge.setBankCost(bankOrd.getTransCost());
							busiTransCharge.setBankCustomerNo(bankOrd.getBankCustomerNo());
							busiTransCharge.setBrandFee(bankOrd.getBrandFee());

							busiTransCharge.setDealStatus(DealStatusEnum.UNTREATED.toString());;
							busiTransCharge.setChargebackType(CheckResultTypeEnum.AMOUNT_DIFFER.toString());
							amountNotEqList.add(busiTransCharge);
						}
					}
					/** 只有收单交易记录成本差明细 因为付款交易系统没有成本 */
					if (BusiTypeEnum.RECEIPT.toString().equals(busiType)) {
						if (costNotEqList.size() < diffCount) {
							if (!AmountUtils.eq(bankOrd.getTransCost(), sysOrd.getTransCost())) {
								sysOrd = sysOrderService.findSysOrderById(busiCode, checkPeriod, sysOrd.getId());
								bankOrd = bankOrderService.findBankOrderById(busiCode, checkPeriod, bankOrd.getId());
								BusiTransCharge busiTransCharge = new BusiTransCharge(operator);
								busiTransCharge.setAccessInst(instNo);
								busiTransCharge.setCheckPeriod(checkPeriod);
								busiTransCharge.setPan(sysOrd.getPan());
								busiTransCharge.setBusiCode(busiCode);
								busiTransCharge.setBusiName(busiName);
								busiTransCharge.setBusiType(busiType);
								busiTransCharge.setFundSettleAccCode(fundSettleAccCode);
								busiTransCharge.setCheckId(sysOrd.getCheckId());
								busiTransCharge.setOrganization(sysOrd.getOrganization());
								busiTransCharge.setPayChannelCode(sysOrd.getPayChannelCode());

								busiTransCharge.setSysTransTime(sysOrd.getTransTime());
								busiTransCharge.setSysClearDate(sysOrd.getSysClearDate());
								busiTransCharge.setSysAmount(sysOrd.getTransAmount());
								busiTransCharge.setSysCost(sysOrd.getTransCost());
								busiTransCharge.setCustomerNo(sysOrd.getCustomerNo());
								busiTransCharge.setOrderId(sysOrd.getBankExternalId() == null ? sysOrd.getCheckId() : sysOrd.getBankExternalId());
								busiTransCharge.setBankExternalId(sysOrd.getBankExternalId());
								busiTransCharge.setTransType(sysOrd.getTransStatus());

								busiTransCharge.setBankTransTime(bankOrd.getBankTransTime());
								busiTransCharge.setBankClearDate(bankOrd.getBankClearDate());
								busiTransCharge.setBankAmount(bankOrd.getTransAmount());
								busiTransCharge.setBankCost(bankOrd.getTransCost());
								busiTransCharge.setBankCustomerNo(bankOrd.getBankCustomerNo());
								busiTransCharge.setBrandFee(bankOrd.getBrandFee());

								busiTransCharge.setDealStatus(DealStatusEnum.UNTREATED.toString());;
								busiTransCharge.setChargebackType(CheckResultTypeEnum.FEE_DIFFER.toString());
								costNotEqList.add(busiTransCharge);
							}
						}
					}
					/** 单边记录 */
				} else {
					sysSideCount++;
					if (sysSideCount > interruptNum) {
						log.error("sysSideCount>interruptNum:" + interruptNum);
						busiCheckLogService.recordBusiCheckLog(busiCheckLog, timeFreEnum, ResultCodeEnum.FAIL.toString(), ErrorCodeUtis.BUSI_CHECK_SYS_SIDE_EXCEED,
								"系统单边大于" + interruptNum);
						throw new BusiCheckException(ErrorCodeUtis.BUSI_CHECK_SYS_SIDE_EXCEED, "sysSideCount>" + interruptNum);
					}
					sysOrd = sysOrderService.findSysOrderById(busiCode, checkPeriod, sysOrd.getId());
					sysSideAmount = AmountUtils.add(sysSideAmount, sysOrd.getTransAmount());
					sysSideCost = AmountUtils.add(sysSideCost, sysOrd.getTransCost());
					sysSideFee = AmountUtils.add(sysSideFee, sysOrd.getTransFee());

					BusiTransCharge busiTransCharge = new BusiTransCharge(operator);
					busiTransCharge.setAccessInst(instNo);
					busiTransCharge.setCheckPeriod(checkPeriod);
					busiTransCharge.setPan(sysOrd.getPan());
					busiTransCharge.setBusiCode(busiCode);
					busiTransCharge.setBusiName(busiName);
					busiTransCharge.setBusiType(busiType);
					busiTransCharge.setFundSettleAccCode(fundSettleAccCode);
					busiTransCharge.setCheckId(sysOrd.getCheckId());
					busiTransCharge.setOrganization(sysOrd.getOrganization());
					busiTransCharge.setPayChannelCode(sysOrd.getPayChannelCode());
					busiTransCharge.setBankExternalId(sysOrd.getBankExternalId());
					busiTransCharge.setSysTransTime(sysOrd.getTransTime());
					busiTransCharge.setSysClearDate(sysOrd.getSysClearDate());
					busiTransCharge.setSysAmount(sysOrd.getTransAmount());
					busiTransCharge.setSysCost(sysOrd.getTransCost());
					busiTransCharge.setCustomerNo(sysOrd.getCustomerNo());
					busiTransCharge.setOrderId(sysOrd.getBankExternalId() == null ? sysOrd.getCheckId() : sysOrd.getBankExternalId());
					busiTransCharge.setTransType(sysOrd.getTransStatus());
					busiTransCharge.setDealStatus(DealStatusEnum.UNTREATED.toString());;
					busiTransCharge.setChargebackType(CheckResultTypeEnum.SYS_SIDE.toString());
					sysSideList.add(busiTransCharge);
				}
			}
			/** 从银行到账文件 向系统交易数据 匹配 */
			for (String sysFlowId : bankMap.keySet()) {
				BankOrder bankOrd = bankMap.get(sysFlowId);
				SysOrder sysOrd = sysMap.get(sysFlowId);

				bankCount++;
				bankAmount = AmountUtils.add(bankAmount, bankOrd.getTransAmount());
				bankCost = AmountUtils.add(bankCost, bankOrd.getTransCost());
				if (sysOrd != null) {

				} else {
					bankSideCount++;
					if (bankSideCount > interruptNum) {
						log.error("bankSideCount>" + interruptNum);
						busiCheckLogService.recordBusiCheckLog(busiCheckLog, timeFreEnum, ResultCodeEnum.FAIL.toString(), ErrorCodeUtis.BUSI_CHECK_BANK_SIDE_EXCEED,
								"银行单边大于" + interruptNum);
						throw new BusiCheckException(ErrorCodeUtis.BUSI_CHECK_BANK_SIDE_EXCEED, "bankSideCount>" + interruptNum);
					}
					bankOrd = bankOrderService.findBankOrderById(busiCode, checkPeriod, bankOrd.getId());
					bankSideAmount = AmountUtils.add(bankSideAmount, bankOrd.getTransAmount());
					bankSideCost = AmountUtils.add(bankSideCost, bankOrd.getTransCost());
					/** 银行单边 */
					BusiTransCharge busiTransCharge = new BusiTransCharge(operator);
					busiTransCharge.setAccessInst(instNo);
					busiTransCharge.setCheckPeriod(checkPeriod);
					busiTransCharge.setPan(bankOrd.getPan());
					busiTransCharge.setBusiCode(busiCode);
					busiTransCharge.setBusiName(busiName);
					busiTransCharge.setBusiType(busiType);
					busiTransCharge.setFundSettleAccCode(fundSettleAccCode);
					busiTransCharge.setCheckId(bankOrd.getCheckId());
					busiTransCharge.setOrganization(bankOrd.getOrganization());
					busiTransCharge.setPayChannelCode(bankOrd.getPayChannelCode());

					busiTransCharge.setBankTransTime(bankOrd.getBankTransTime());
					busiTransCharge.setBankClearDate(bankOrd.getBankClearDate());
					busiTransCharge.setBankAmount(bankOrd.getTransAmount());
					busiTransCharge.setBankCost(bankOrd.getTransCost());
					busiTransCharge.setBankCustomerNo(bankOrd.getBankCustomerNo());
					busiTransCharge.setOrderId(bankOrd.getBankExternalId() == null ? bankOrd.getCheckId() : bankOrd.getBankExternalId());
					busiTransCharge.setBankExternalId(bankOrd.getBankExternalId());
					busiTransCharge.setDealStatus(DealStatusEnum.UNTREATED.toString());;
					busiTransCharge.setChargebackType(CheckResultTypeEnum.BANK_SIDE.toString());
					busiTransCharge.setBrandFee(bankOrd.getBrandFee());
					busiTransCharge.setTransType(bankOrd.getTransStatus());
					bankSideList.add(busiTransCharge);
				}
			}

			busiCheckResult.setBankTransAmount(bankAmount);
			busiCheckResult.setBankTransCount(bankCount);
			busiCheckResult.setBankTransCost(bankCost);
			busiCheckResult.setBankTransFee(bankFee);
			busiCheckResult.setBankSideAmount(bankSideAmount);
			busiCheckResult.setBankSideCount(bankSideCount);
			busiCheckResult.setBankSideCost(bankSideCost);
			busiCheckResult.setNdef2(bankSideFee);
			busiCheckResult.setBilateralBankAmt(bilateralBankAmt);
			busiCheckResult.setBilateralBankCost(bilateralBankCost);
			busiCheckResult.setBilateralBankFee(bilateralBankFee);
			busiCheckResult.setBilateralCount(bilateralCount);
			busiCheckResult.setBilateralSysAmt(bilateralSysAmt);
			busiCheckResult.setBilateralSysCost(bilateralSysCost);
			busiCheckResult.setBilateralSysFee(bilateralSysFee);
			busiCheckResult.setSysTransAmount(sysAmount);
			busiCheckResult.setSysTransCount(sysCount);
			busiCheckResult.setSysTransFee(sysCustomerFee);
			busiCheckResult.setSysTransCost(sysFee);
			busiCheckResult.setSysSideAmount(sysSideAmount);
			busiCheckResult.setSysSideCount(sysSideCount);
			busiCheckResult.setSysSideCost(sysSideCost);
			busiCheckResult.setNdef1(sysSideFee);
			busiCheckResult.setCreateUser(operator);
			log.info("sysSideList:" + sysSideList.size());
			log.info("bankSideList:" + bankSideList.size());
			/** 插入单边数据 */
			busiTransChargeService.batchInsert(sysSideList);
			busiTransChargeService.batchInsert(bankSideList);
			busiTransChargeService.batchInsert(amountNotEqList);
			busiTransChargeService.batchInsert(costNotEqList);
			busiTransChargeService.batchInsert(feeNotEqList);

			List<BusiCheckResult> listBusiCheckResult = new ArrayList<>();
			listBusiCheckResult.add(busiCheckResult);
			/** 插入对账结果汇总 */
			busiCheckResultService.insertList(listBusiCheckResult);
			busiCheckLogService.recordBusiCheckLog(busiCheckLog, timeFreEnum, ResultCodeEnum.SUCCESS.toString(), null, null);
			log.info("##checkChannel Finish# " + busiCode + ",checkPeriod:" + checkPeriod + "]");
			/** 日志监控成本差 额外用于通知 */
			if (BusiTypeEnum.RECEIPT.toString().equals(busiType)) {
				double subtract = Math.abs(AmountUtils.subtract(bilateralBankCost, bilateralSysCost));
				double zeroD = 0D;
				if (!AmountUtils.eq(subtract, zeroD)) {
					// log
					String sysCode = C.getTransSystemByInstNo(instNo, busiCode);
					String splice = SelfStringUtils.getSplice("机构:{},通道:{},清算日期:{},存在成本差,差额:{}", instNo, busiName, checkPeriod, subtract);
					log.info(String.format(SelfStringUtils.LOG_FORMAT, "BusiCheck", "ChannelCostDiff", sysCode, "begin", "success", splice, splice));
					// logMonitor
					BigDecimal bdA = new BigDecimal(bilateralBankCost);
					BigDecimal bdB = new BigDecimal(bilateralSysCost);
					double baseCost = bdA.compareTo(bdB) > 0 ? bilateralBankCost : bilateralSysCost;
					double ratio = AmountUtils.divide(subtract, baseCost);
					String notice = String.format(SelfStringUtils.LOG_FORMAT, "BusiAssSetServiceImpl", "channel.transCost.difference", "busiCode:" + busiCode
							+ ",checkPeriod:" + checkPeriod + ",transCostDiff:" + subtract + ",transCostRatio:" + ratio, "begin", "success", "-", "-");
					logMonitor.warn(notice);

				}
			}
			/** 如果差错处理就标记标记跨日 */
			String isChargeHandle = busiAssSet.getIsChargeHandle();
			if (!StringUtils.isBlank(isChargeHandle) && "Y".equals(isChargeHandle)) {
				transSideToCross(busiCode, checkPeriod);
			}
			/** 日志监控单边 额外用于通知 */
			if (BusiTypeEnum.RECEIPT.toString().equals(busiType)) {
				pringLogT2Side(instNo, busiCode, busiName, checkPeriod);
			}
		} catch (Exception e) {
			if (e instanceof BusiCheckException) {
				throw e;
			} else {
				log.info("##busiCheck ERROR# " + busiCode + ",checkPeriod:" + checkPeriod + "   " + e.getMessage());
				busiCheckLogService.recordBusiCheckLog(busiCheckLog, timeFreEnum, ResultCodeEnum.FAIL.toString(), ErrorCodeUtis.BUSI_CHECK_UNKNOWN_ERROR,
						"##busiCheck ERROR# " + busiCode + ",checkPeriod:" + checkPeriod + "   " + e.getMessage());
				throw new BusiCheckException("##busiCheck ERROR# " + busiCode + ",checkPeriod:" + checkPeriod + "   " + e.getMessage());
			}
		} finally {
			/** 更新成未执行 */
			findAndUpdatesetExecStatusById(busiAssSet.getId(), 0, ExecStatusEnum.NO_START);
		}

	}

	/**
	 * @Description 一句话描述方法用法
	 * @param busiCode
	 * @param checkPeriod
	 * @see 需要参考的类或方法
	 */
	public WebResult sumCrossToCheckResult(String busiCode, String checkPeriod) {
		WebResult webResult = new WebResult();
		try {
			BusiTransCharge bankCorssBusiTransCharge = busiTransChargeService.findByChargeBackTypeAndDealStatusSum(busiCode, checkPeriod,
					CheckResultTypeEnum.BANK_SIDE.toString(), DealStatusEnum.SIDE_CROSS.toString());
			BusiTransCharge sysCorssBusiTransCharge = busiTransChargeService.findByChargeBackTypeAndDealStatusSum(busiCode, checkPeriod,
					CheckResultTypeEnum.SYS_SIDE.toString(), DealStatusEnum.SIDE_CROSS.toString());
			BusiCheckResult findByBusiCodeAndDate = busiCheckResultService.findByBusiCodeAndDate(busiCode, checkPeriod);
			if (findByBusiCodeAndDate != null) {
				if (bankCorssBusiTransCharge != null) {
					findByBusiCodeAndDate.setBankCrossCount(bankCorssBusiTransCharge.getOptimistic());
					findByBusiCodeAndDate.setBankCrossAmount(bankCorssBusiTransCharge.getBankAmount());
					findByBusiCodeAndDate.setBankCrossCost(bankCorssBusiTransCharge.getBankCost());
				}
				if (sysCorssBusiTransCharge != null) {
					findByBusiCodeAndDate.setSysCrossCount(sysCorssBusiTransCharge.getOptimistic());
					findByBusiCodeAndDate.setSysCrossAmount(sysCorssBusiTransCharge.getSysAmount());
					findByBusiCodeAndDate.setSysCrossCost(sysCorssBusiTransCharge.getSysCost());
				}
			}
			busiCheckResultService.updateById(findByBusiCodeAndDate);
		} catch (Exception e) {
			webResult.setResult("FAIL");
			webResult.setErrorMsg(e.getMessage());
		}
		return webResult;
	}

	/**
	 * @Description 单边转款日
	 * @param busiCode
	 * @param checkPeriod
	 * @return
	 * @see 需要参考的类或方法
	 */
	@Override
	public WebResult transSideToCross(String busiCode, String checkPeriod) {
		HashMap<String, String> updateResultDayMap = new HashMap<>();
		updateResultDayMap.put(checkPeriod, checkPeriod);
		/** 银行单边TO跨日处理-前天 */
		log.info("transSideToCross start,busiCode" + busiCode + ",checkPeriod:" + checkPeriod);
		WebResult bankSideToCross = bankSideToCross(busiCode, checkPeriod, updateResultDayMap);
		if (bankSideToCross.getResult().equals("FAILED")) {
			return bankSideToCross;
		}
		/** 系统单边TO跨日处理-前天 */
		WebResult sysSideToCross = sysSideToCross(busiCode, checkPeriod, updateResultDayMap);
		if (sysSideToCross.getResult().equals("FAILED")) {
			return sysSideToCross;
		}

		/** 重新汇总跨日数据 */
		Iterator<String> it = updateResultDayMap.keySet().iterator();
		while (it.hasNext()) {
			String updateDay = it.next();
			/** 汇总跨日数据 */
			WebResult sumCrossToCheckResult = sumCrossToCheckResult(busiCode, updateDay);
			if (sumCrossToCheckResult.getResult().equals("FAILED")) {
				return sumCrossToCheckResult;
			}
		}
		log.info("transSideToCross end,busiCode" + busiCode + ",checkPeriod:" + checkPeriod);
		return sysSideToCross;
	}

	/**
	 * @Description 一句话描述方法用法
	 * @param instNo
	 * @param busiCode
	 * @param busiName
	 * @param checkPeriod
	 * @see 需要参考的类或方法
	 */
	private void pringLogT2Side(String instNo, String busiCode, String busiName, String checkPeriod) {
		String t2Date = SelfDateUtils.getAfterOrBeforDay(checkPeriod, -1);
		String sysCode = C.getTransSystemByInstNo(instNo, busiCode);
		/** 系统单边打印 */
		List<BusiTransCharge> sysSideList = busiTransChargeService.findNoDealByChargeBackType(busiCode, t2Date, t2Date, CheckResultTypeEnum.SYS_SIDE.toString());
		if (!ListUtils.isBlankList(sysSideList)) {
			String splice = SelfStringUtils.getSplice("机构:{},通道:{},清算日期:{},存在系统单边,条数:{}", instNo, busiName, checkPeriod, sysSideList.size());
			log.info(String.format(SelfStringUtils.LOG_FORMAT, "BusiCheck", "SysSide", sysCode, "begin", "success", splice, splice));

			String notice = String.format(SelfStringUtils.LOG_FORMAT, "BusiAssSetServiceImpl", "sys.side", "busiCode:" + busiCode + ",checkPeriod:" + checkPeriod
					+ ",sysside:" + sysSideList.size(), "begin", "success", "-", "-");
			logMonitor.warn(notice);
		}
		/** 银行单边打印 */
		List<BusiTransCharge> bankSideList = busiTransChargeService.findNoDealByChargeBackType(busiCode, t2Date, t2Date, CheckResultTypeEnum.BANK_SIDE.toString());
		if (!ListUtils.isBlankList(bankSideList)) {
			String splice = SelfStringUtils.getSplice("机构:{},通道:{},清算日期:{},存在银行单边,条数:{}", instNo, busiName, checkPeriod, bankSideList.size());
			log.info(String.format(SelfStringUtils.LOG_FORMAT, "BusiCheck", "BankSide", sysCode, "begin", "success", splice, splice));

			String notice = String.format(SelfStringUtils.LOG_FORMAT, "BusiAssSetServiceImpl", "bank.side", "busiCode:" + busiCode + ",checkPeriod:" + checkPeriod
					+ ",bankside:" + bankSideList.size(), "begin", "success", "-", "-");

			logMonitor.warn(notice);
		}
	}

	/**
	 * @Description 系统单边转跨日
	 * @param bankInterfaceCode
	 * @param transDate
	 * @return
	 * @see 需要参考的类或方法
	 */
	private WebResult sysSideToCross(String busiCode, String checkPeriod, HashMap<String, String> updateResultDayMap) {
		log.info("sysSideToCross start,busiCode" + busiCode + ",checkPeriod:" + checkPeriod);
		WebResult webResult = new WebResult();
		try {
			String startDateStr = SelfDateUtils.getAfterOrBeforDay(checkPeriod, -7);
			String endDateStr = SelfDateUtils.getAfterOrBeforDay(checkPeriod, 3);
			List<BusiTransCharge> sysSideList = busiTransChargeService.findByChargeBackType(busiCode, checkPeriod, checkPeriod,
					CheckResultTypeEnum.SYS_SIDE.toString());
			if (!ListUtils.isBlankList(sysSideList)) {
				for (BusiTransCharge tempSysSide : sysSideList) {
					if (DealStatusEnum.UNTREATED.toString().equals(tempSysSide.getDealStatus())) {
						List<BusiTransCharge> queryBankSideList = busiTransChargeService.findByChargeBackTypeAndCheckId(busiCode, startDateStr, endDateStr,
								CheckResultTypeEnum.BANK_SIDE.toString(), tempSysSide.getCheckId());
						if (queryBankSideList != null && queryBankSideList.size() > 0) {
							tempSysSide.setDealStatus(DealStatusEnum.SIDE_CROSS.toString());
							busiTransChargeService.updateById(tempSysSide);
							BusiTransCharge eachBankSide = queryBankSideList.get(0);
							String dealStatus = eachBankSide.getDealStatus();
							if (DealStatusEnum.UNTREATED.toString().equals(dealStatus)) {
								eachBankSide.setDealStatus(DealStatusEnum.SIDE_CROSS.toString());
								busiTransChargeService.updateById(eachBankSide);

								String updateResultDay = eachBankSide.getCheckPeriod();
								if (!updateResultDayMap.containsKey(updateResultDay)) {
									updateResultDayMap.put(updateResultDay, updateResultDay);
								}
							}
						}
					}
				}
			}
		} catch (Exception e) {
			String errorMsg = "sysSideToCross-error:" + e.getMessage();
			log.error(errorMsg);
			webResult.setResult("FAILED");
			webResult.setErrorMsg(errorMsg);
		}
		log.info("sysSideToCross end,busiCode" + busiCode + ",checkPeriod:" + checkPeriod);
		return webResult;
	}

	/**
	 * @Description 银行单边转跨日
	 * @param bankInterfaceCode
	 * @param transDate
	 * @return
	 * @see 需要参考的类或方法
	 */
	private WebResult bankSideToCross(String busiCode, String checkPeriod, HashMap<String, String> updateResultDayMap) {
		log.info("bankSideToCross start,busiCode" + busiCode + ",checkPeriod:" + checkPeriod);
		WebResult webResult = new WebResult();
		try {
			String startDateStr = SelfDateUtils.getAfterOrBeforDay(checkPeriod, -7);
			String endDateStr = SelfDateUtils.getAfterOrBeforDay(checkPeriod, 3);
			List<BusiTransCharge> bankSideList = busiTransChargeService.findByChargeBackType(busiCode, checkPeriod, checkPeriod,
					CheckResultTypeEnum.BANK_SIDE.toString());
			if (!ListUtils.isBlankList(bankSideList)) {
				for (BusiTransCharge tempBankSide : bankSideList) {
					if (DealStatusEnum.UNTREATED.toString().equals(tempBankSide.getDealStatus())) {
						List<BusiTransCharge> querySysSideList = busiTransChargeService.findByChargeBackTypeAndCheckId(busiCode, startDateStr, endDateStr,
								CheckResultTypeEnum.SYS_SIDE.toString(), tempBankSide.getCheckId());
						if (querySysSideList != null && querySysSideList.size() > 0) {
							/** 先更新自己为跨日确认 */
							tempBankSide.setDealStatus(DealStatusEnum.SIDE_CROSS.toString());
							busiTransChargeService.updateById(tempBankSide);

							/** 再更新对方为跨日确认 */
							BusiTransCharge eachSysSide = querySysSideList.get(0);
							String dealStatus = eachSysSide.getDealStatus();
							/** 未处理的 */
							if (DealStatusEnum.UNTREATED.toString().equals(dealStatus)) {
								eachSysSide.setDealStatus(DealStatusEnum.SIDE_CROSS.toString());
								busiTransChargeService.updateById(eachSysSide);

								String updateResultDay = eachSysSide.getCheckPeriod();
								if (!updateResultDayMap.containsKey(updateResultDay)) {
									updateResultDayMap.put(updateResultDay, updateResultDay);
								}
							}
						}
					}
				}
			}
		} catch (Exception e) {
			String errorMsg = "bankSideToCross-error:" + e.getMessage();
			log.error(errorMsg);
			webResult.setResult("FAILED");
			webResult.setErrorMsg(errorMsg);
		}
		log.info("bankSideToCross end,busiCode" + busiCode + ",checkPeriod:" + checkPeriod);
		return webResult;
	}

	@Override
	public void findAndUpdatesetExecStatusById(String id, int execNum, ExecStatusEnum execStatusEnum) {
		BusiAssSet findById = super.findById(id);
		findById.setExecStatus(ExecStatusEnum.NO_START.toString());
		int updateRow = super.updateById(findById);
		execNum++;
		if (updateRow == 0) {
			// 最多执行4次
			if (execNum < 4) {
				findAndUpdatesetExecStatusById(id, execNum, execStatusEnum);
			} else {
				log.error("busiCheck-findAndUpdateById-update-failed,id" + id);
			}
		}
	}

	@Override
	public void clearCheckResult(String busiCode, String checkPeriod) {
		List<BusiTransCharge> listBusiTransCharge = busiTransChargeService.findHadDeal(busiCode, checkPeriod);
		if (!ListUtils.isBlankList(listBusiTransCharge)) {
			log.error("BusiTransCharge had deal,not check");
			throw new BusinessException("BusiTransCharge had deal,not check,checkId:" + listBusiTransCharge.get(0).getCheckId());

		}
		BusiCheckResult result = busiCheckResultService.findByBusiCodeAndDate(busiCode, checkPeriod);
		if (result != null) {
			String isTally = result.getIsTally();
			if ("Y".equals(isTally)) {
				log.error("BusiCheckResult - tally,must't del");
				throw new BusinessException("BusiCheckResult - tally");
			}
		}
		busiTransChargeService.delByCheckPeriodAndBusiCode(checkPeriod, busiCode);
		busiCheckResultService.delByCheckPeriodAndBusiCode(checkPeriod, busiCode);
	}

	@Override
	public BusiAssSet findByPayChannelCodeAndBusiType(String payChannelCode, String dataDivi) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("defaultChannel", payChannelCode);
		map.put("dataDivi", dataDivi);
		List<BusiAssSet> findByMap = super.findByMap(map);
		if (ListUtils.isBlankList(findByMap)) {
			return null;
		}
		return findByMap.get(0);
	}

	@Override
	public List<BusiAssSet> findReceiptInstByAcc(String fundSettleAccCode) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("fundSettleAccCode", fundSettleAccCode);
		map.put("busiType", BusiTypeEnum.RECEIPT.toString());
		map.put("isFundCheck", "Y");
		List<BusiAssSet> findByMap = super.findByMap(map);
		if (ListUtils.isBlankList(findByMap)) {
			return null;
		}
		return findByMap;
	}

	@Override
	public List<BusiAssSet> findAgentBusiAssSets(Map<String, Object> map) {
		map.put("organization", OrganizationEnum.AGENT.toString());
		List<BusiAssSet> findByMap = super.findByMap(map);
		if (ListUtils.isBlankList(findByMap)) {
			return null;
		}
		return findByMap;
	}

	@Override
	public int insert(BusiAssSet t) {
		switch (t.getDataDivi()) {
		case "RECEIPT_TRANS":
			t.setBusiCode(getBusiCode("RECEIPT"));
			break;
		case "PAY_TRANS":
			t.setBusiCode(getBusiCode("PAY"));
			break;
		case "RECOVERY_TRANS":
			t.setBusiCode(getBusiCode("RECOVERY"));
			break;
		case "CHARGEBACK_TRANS":
			t.setBusiCode(getBusiCode("RECOVERY"));
			break;
		case "REFUND_TRANS":
			t.setBusiCode(getBusiCode("RECEIPT"));
			break;
		case "REPORT_DATA":
			t.setBusiCode(getBusiCode("REPORT"));
			break;
		}
		log.info("insert(),busiAssSet={}", t);
		return super.insert(t);
	}

	public String getBusiCode(String suffix) {
		String wantIdRule = C.ID_RULE_HEAD + ".BusiAssSet." + suffix;
		log.info("getBusiCode(),wantIdRule={}", wantIdRule);
		return idGeneratorInterface.getNewID(wantIdRule);
	}
}
