package com.pay.recontwo.model;

public class BankBusiSettle extends BaseMapperVO {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9035808361415079620L;
	/** 银行结算日期 */
	private String bankSettleDate;
	/** 资金结算账户编码 */
	private String fundSettleAccCode;
	/** 银行对账文件合计 */
	private double bankFileTotalAmt;
	/** 备付金收款金额 */
	private double fundReceiptAmt;
	/** 差异 */
	private double diffAmt;
	/** 是否复核 */
	private String isReview;
	/** 是否记账 */
	private String isTally;

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

	public double getBankFileTotalAmt() {
		return bankFileTotalAmt;
	}

	public void setBankFileTotalAmt(double bankFileTotalAmt) {
		this.bankFileTotalAmt = bankFileTotalAmt;
	}

	public double getFundReceiptAmt() {
		return fundReceiptAmt;
	}

	public void setFundReceiptAmt(double fundReceiptAmt) {
		this.fundReceiptAmt = fundReceiptAmt;
	}

	public double getDiffAmt() {
		return diffAmt;
	}

	public void setDiffAmt(double diffAmt) {
		this.diffAmt = diffAmt;
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

}
