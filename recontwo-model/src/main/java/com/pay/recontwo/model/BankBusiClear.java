package com.pay.recontwo.model;

public class BankBusiClear extends BaseMapperVO {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8330636265697973751L;
	/** 主体 */
	private String organization;
	/** 银行清算时间 */
	private String bankClearDate;
	/** 银行结算日期 */
	private String bankSettleDate;
	/** 资金结算账户编码 */
	private String fundSettleAccCode;
	/** 对接机构 */
	private String accessInst;
	/** 收单交易款 */
	private double receiptTrans;
	/** 代付手续费 */
	private double dpayFee;
	/** 差错款项 */
	private double chargebackTotal;
	/** 信用卡还款 */
	private double creditCardRepay;
	/** 圈存受理 */
	private double survival;
	/** 营销分润 */
	private double marketingProfit;
	/** 追偿罚款 */
	private double recoveryFee;
	/** 收付费 */
	private double payReceiptFee;
	/** 其它款项 */
	private double otherFee;
	/** 应收款项合计 */
	private double receivablesTotal;
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

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getBankClearDate() {
		return bankClearDate;
	}

	public void setBankClearDate(String bankClearDate) {
		this.bankClearDate = bankClearDate;
	}

	public String getBankSettleDate() {
		return bankSettleDate;
	}

	public void setBankSettleDate(String bankSettleDate) {
		this.bankSettleDate = bankSettleDate;
	}

	public String getFundSettleAccCode() {
		return fundSettleAccCode;
	}

	public void setFundSettleAccCode(String fundSettleAccCode) {
		this.fundSettleAccCode = fundSettleAccCode;
	}

	public String getAccessInst() {
		return accessInst;
	}

	public void setAccessInst(String accessInst) {
		this.accessInst = accessInst;
	}

	public double getReceiptTrans() {
		return receiptTrans;
	}

	public void setReceiptTrans(double receiptTrans) {
		this.receiptTrans = receiptTrans;
	}

	public double getDpayFee() {
		return dpayFee;
	}

	public void setDpayFee(double dpayFee) {
		this.dpayFee = dpayFee;
	}

	public double getChargebackTotal() {
		return chargebackTotal;
	}

	public void setChargebackTotal(double chargebackTotal) {
		this.chargebackTotal = chargebackTotal;
	}

	public double getCreditCardRepay() {
		return creditCardRepay;
	}

	public void setCreditCardRepay(double creditCardRepay) {
		this.creditCardRepay = creditCardRepay;
	}

	public double getSurvival() {
		return survival;
	}

	public void setSurvival(double survival) {
		this.survival = survival;
	}

	public double getMarketingProfit() {
		return marketingProfit;
	}

	public void setMarketingProfit(double marketingProfit) {
		this.marketingProfit = marketingProfit;
	}

	public double getRecoveryFee() {
		return recoveryFee;
	}

	public void setRecoveryFee(double recoveryFee) {
		this.recoveryFee = recoveryFee;
	}

	public double getPayReceiptFee() {
		return payReceiptFee;
	}

	public void setPayReceiptFee(double payReceiptFee) {
		this.payReceiptFee = payReceiptFee;
	}

	public double getOtherFee() {
		return otherFee;
	}

	public void setOtherFee(double otherFee) {
		this.otherFee = otherFee;
	}

	public double getReceivablesTotal() {
		return receivablesTotal;
	}

	public void setReceivablesTotal(double receivablesTotal) {
		this.receivablesTotal = receivablesTotal;
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
