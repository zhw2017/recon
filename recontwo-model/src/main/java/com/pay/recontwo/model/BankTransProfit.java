package com.pay.recontwo.model;

public class BankTransProfit extends BaseMapperVO {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7309089063995313774L;
	/** 对接机构 */
	private String accessInst;
	/** 业务大类 */
	private String busiType;
	/** 业务编码 */
	private String busiCode;
	/** 业务名称 */
	private String busiName;
	/** 清算时间 */
	private String clearDate;
	/** 交易产品 */
	private String transProduct;
	/** 费率类型 */
	private String rateType;
	/** 结算产品 */
	private String settleProduct;
	/** 卡类型 */
	private String cardType;
	/** 交易笔数 */
	private int transCount;
	/** 交易金额 */
	private double transAmount;
	/** 通道成本 */
	private double transCost;
	/** 商户手续费 */
	private double transFee;
	/** 交易分润 */
	private double transProfit;
	/** 自定义项1 */
	private String def1;
	/** 自定义项2 */
	private String def2;
	/** 自定义项3 */
	private String def3;
	/** 数值自定义项1 */
	private double ndef1;
	/** 数值自定义项2 */
	private double ndef2;
	/** 数值自定义项3 */
	private double ndef3;
	/** 是否封顶 */
	private String isCapped;

	public String getAccessInst() {
		return accessInst;
	}

	public void setAccessInst(String accessInst) {
		this.accessInst = accessInst;
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

	public String getClearDate() {
		return clearDate;
	}

	public void setClearDate(String clearDate) {
		this.clearDate = clearDate;
	}

	public String getTransProduct() {
		return transProduct;
	}

	public void setTransProduct(String transProduct) {
		this.transProduct = transProduct;
	}

	public String getRateType() {
		return rateType;
	}

	public void setRateType(String rateType) {
		this.rateType = rateType;
	}

	public String getSettleProduct() {
		return settleProduct;
	}

	public void setSettleProduct(String settleProduct) {
		this.settleProduct = settleProduct;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public int getTransCount() {
		return transCount;
	}

	public void setTransCount(int transCount) {
		this.transCount = transCount;
	}

	public double getTransAmount() {
		return transAmount;
	}

	public void setTransAmount(double transAmount) {
		this.transAmount = transAmount;
	}

	public double getTransCost() {
		return transCost;
	}

	public void setTransCost(double transCost) {
		this.transCost = transCost;
	}

	public double getTransFee() {
		return transFee;
	}

	public void setTransFee(double transFee) {
		this.transFee = transFee;
	}

	public double getTransProfit() {
		return transProfit;
	}

	public void setTransProfit(double transProfit) {
		this.transProfit = transProfit;
	}

	public String getDef1() {
		return def1;
	}

	public void setDef1(String def1) {
		this.def1 = def1;
	}

	public String getDef2() {
		return def2;
	}

	public void setDef2(String def2) {
		this.def2 = def2;
	}

	public String getDef3() {
		return def3;
	}

	public void setDef3(String def3) {
		this.def3 = def3;
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

	public String getIsCapped() {
		return isCapped;
	}

	public void setIsCapped(String isCapped) {
		this.isCapped = isCapped;
	}

}
