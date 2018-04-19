package com.pay.recontwo.model;

public class BankBusiClearMin extends BaseMapperVO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2999326321842961293L;
	/** 对接机构 */
	private String accessInst;
	/** 机构名称 */
	private String instName;
	/** 业务大类 */
	private String busiType;
	/** 业务编码 */
	private String busiCode;
	/** 业务名称 */
	private String busiName;
	/** 主体 */
	private String organization;
	/** 对账期间 */
	private String checkPeriod;
	/** 系统交易待清算 */
	private double sysTransSum;
	/** 银行交易已清算 */
	private double bankTransSum;
	/** 差异 */
	private double sumDiff;
	/** 跨日清算 */
	private double crossClear;
	/** 差错文件汇总 */
	private double chargebackSum;
	/** 信用卡还款 */
	private double creditCardRepay;
	/** 营销费用 */
	private double marketingProfit;
	/** 手机充值 */
	private double phoneRecharge;
	/** 双边成本差异 */
	private double bilateralCostDiff;
	/** 系统跨日 */
	private double sysCrossDiff;
	/** 银行跨日 */
	private double bankCrossDiff;
	/** 跨日成本差 */
	private double crossCostDiff;
	/** 系统单边 */
	private double sysSideDiff;
	/** 银行单边 */
	private double bankSideDiff;
	/** 冻结及解冻 */
	private double freezThawing;
	/** 退单 */
	private double chargebackAmt;
	/** 退款/补单 */
	private double refundSupple;
	/** 分润 */
	private double shareProfit;
	/** 圈存受理 */
	private double survival;
	/** 批量代付手续费 */
	private double batchDpayFee;
	/** 手续费差异 */
	private double feeDiff;
	/** 未知差异 */
	private double unknownDiff;
	/** 稽核 */
	private double auditingAmt;
	/** 是否复核 */
	private String isReview = "N";
	/** 是否记账 */
	private String isTally = "N";
	/** 创建人 */
	private String createUser;
	/** 修改人 */
	private String modifyUser;
	/** 自定义项3 */
	private String def3;
	/** 自定义项2 */
	private String def2;
	/** 自定义项1 */
	private String def1;
	/** 数值自定义项1 */
	private double ndef1;
	/** 数值自定义项2 */
	private double ndef2;
	/** 数值自定义项3 */
	private double ndef3;
	/** 数值自定义项4 */
	private double ndef4;
	/** 数值自定义项5 */
	private double ndef5;
	/** 数值自定义项6 */
	private double ndef6;

	public String getAccessInst() {
		return accessInst;
	}

	public void setAccessInst(String accessInst) {
		this.accessInst = accessInst;
	}

	public String getInstName() {
		return instName;
	}

	public void setInstName(String instName) {
		this.instName = instName;
	}

	public String getBusiType() {
		return busiType;
	}

	public void setBusiType(String busiType) {
		this.busiType = busiType;
	}

	public String getBusiCode() {
		return busiCode;
	}

	public void setBusiCode(String busiCode) {
		this.busiCode = busiCode;
	}

	public String getBusiName() {
		return busiName;
	}

	public void setBusiName(String busiName) {
		this.busiName = busiName;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getCheckPeriod() {
		return checkPeriod;
	}

	public void setCheckPeriod(String checkPeriod) {
		this.checkPeriod = checkPeriod;
	}

	public double getSysTransSum() {
		return sysTransSum;
	}

	public void setSysTransSum(double sysTransSum) {
		this.sysTransSum = sysTransSum;
	}

	public double getBankTransSum() {
		return bankTransSum;
	}

	public void setBankTransSum(double bankTransSum) {
		this.bankTransSum = bankTransSum;
	}

	public double getSumDiff() {
		return sumDiff;
	}

	public void setSumDiff(double sumDiff) {
		this.sumDiff = sumDiff;
	}

	public double getCrossClear() {
		return crossClear;
	}

	public void setCrossClear(double crossClear) {
		this.crossClear = crossClear;
	}

	public double getChargebackSum() {
		return chargebackSum;
	}

	public void setChargebackSum(double chargebackSum) {
		this.chargebackSum = chargebackSum;
	}

	public double getCreditCardRepay() {
		return creditCardRepay;
	}

	public void setCreditCardRepay(double creditCardRepay) {
		this.creditCardRepay = creditCardRepay;
	}

	public double getMarketingProfit() {
		return marketingProfit;
	}

	public void setMarketingProfit(double marketingProfit) {
		this.marketingProfit = marketingProfit;
	}

	public double getPhoneRecharge() {
		return phoneRecharge;
	}

	public void setPhoneRecharge(double phoneRecharge) {
		this.phoneRecharge = phoneRecharge;
	}

	public double getBilateralCostDiff() {
		return bilateralCostDiff;
	}

	public void setBilateralCostDiff(double bilateralCostDiff) {
		this.bilateralCostDiff = bilateralCostDiff;
	}

	public double getSysCrossDiff() {
		return sysCrossDiff;
	}

	public void setSysCrossDiff(double sysCrossDiff) {
		this.sysCrossDiff = sysCrossDiff;
	}

	public double getBankCrossDiff() {
		return bankCrossDiff;
	}

	public void setBankCrossDiff(double bankCrossDiff) {
		this.bankCrossDiff = bankCrossDiff;
	}

	public double getCrossCostDiff() {
		return crossCostDiff;
	}

	public void setCrossCostDiff(double crossCostDiff) {
		this.crossCostDiff = crossCostDiff;
	}

	public double getSysSideDiff() {
		return sysSideDiff;
	}

	public void setSysSideDiff(double sysSideDiff) {
		this.sysSideDiff = sysSideDiff;
	}

	public double getBankSideDiff() {
		return bankSideDiff;
	}

	public void setBankSideDiff(double bankSideDiff) {
		this.bankSideDiff = bankSideDiff;
	}

	public double getFreezThawing() {
		return freezThawing;
	}

	public void setFreezThawing(double freezThawing) {
		this.freezThawing = freezThawing;
	}

	public double getChargebackAmt() {
		return chargebackAmt;
	}

	public void setChargebackAmt(double chargebackAmt) {
		this.chargebackAmt = chargebackAmt;
	}

	public double getRefundSupple() {
		return refundSupple;
	}

	public void setRefundSupple(double refundSupple) {
		this.refundSupple = refundSupple;
	}

	public double getShareProfit() {
		return shareProfit;
	}

	public void setShareProfit(double shareProfit) {
		this.shareProfit = shareProfit;
	}

	public double getSurvival() {
		return survival;
	}

	public void setSurvival(double survival) {
		this.survival = survival;
	}

	public double getBatchDpayFee() {
		return batchDpayFee;
	}

	public void setBatchDpayFee(double batchDpayFee) {
		this.batchDpayFee = batchDpayFee;
	}

	public double getFeeDiff() {
		return feeDiff;
	}

	public void setFeeDiff(double feeDiff) {
		this.feeDiff = feeDiff;
	}

	public double getUnknownDiff() {
		return unknownDiff;
	}

	public void setUnknownDiff(double unknownDiff) {
		this.unknownDiff = unknownDiff;
	}

	public double getAuditingAmt() {
		return auditingAmt;
	}

	public void setAuditingAmt(double auditingAmt) {
		this.auditingAmt = auditingAmt;
	}

	public String getIsReview() {
		return isReview;
	}

	public void setIsReview(String isReview) {
		this.isReview = isReview;
	}

	public String getIsTally() {
		return isTally;
	}

	public void setIsTally(String isTally) {
		this.isTally = isTally;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getModifyUser() {
		return modifyUser;
	}

	public void setModifyUser(String modifyUser) {
		this.modifyUser = modifyUser;
	}

	public String getDef3() {
		return def3;
	}

	public void setDef3(String def3) {
		this.def3 = def3;
	}

	public String getDef2() {
		return def2;
	}

	public void setDef2(String def2) {
		this.def2 = def2;
	}

	public String getDef1() {
		return def1;
	}

	public void setDef1(String def1) {
		this.def1 = def1;
	}

	public double getNdef1() {
		return ndef1;
	}

	public void setNdef1(double ndef1) {
		this.ndef1 = ndef1;
	}

	public double getNdef2() {
		return ndef2;
	}

	public void setNdef2(double ndef2) {
		this.ndef2 = ndef2;
	}

	public double getNdef3() {
		return ndef3;
	}

	public void setNdef3(double ndef3) {
		this.ndef3 = ndef3;
	}

	public double getNdef4() {
		return ndef4;
	}

	public void setNdef4(double ndef4) {
		this.ndef4 = ndef4;
	}

	public double getNdef5() {
		return ndef5;
	}

	public void setNdef5(double ndef5) {
		this.ndef5 = ndef5;
	}

	public double getNdef6() {
		return ndef6;
	}

	public void setNdef6(double ndef6) {
		this.ndef6 = ndef6;
	}

}
