package com.pay.recontwo.model;

//import org.hibernate.validator.constraints.NotBlank;

public class BankTransSum extends BaseMapperVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1075986728527253763L;
	/** 业务编码 */
//	@NotBlank
	private String busiCode;
	/** 业务名称 */
	private String busiName;
	/** 资金结算账户编码 */
//	@NotBlank
	private String fundSettleAccCode;
	/** 资金结算账户名称 */
	private String fundSettleAccName;
	/** 银行结算日期 */
//	@NotBlank
	private String bankSettleDate;
	/** 文件名 */
//	@NotBlank
	private String fileName;
	/** 清算币种 */
	private String clearCurrency;
	/** 清算机构 */
//	@NotBlank
	private String clearInst;
	/** 清算日期 */
//	@NotBlank
	private String checkDate;
	/** 生成日期 */
	private String generDate;
	/** 交易类型 */
	private String transType;
	/** 交易笔数 */
	private int transNum;
	/** 交易金额-借 */
	private double transDebitAmt;
	/** 交易金额-贷 */
	private double transCreditAmt;
	/** 交换费-借 */
	private double swapDebitAmt;
	/** 交换费-贷 */
	private double swapCreditAmt;
	/** 转接清算费-借 */
	private double roveDebitAmt;
	/** 转接清算费-贷 */
	private double roveCreditAmt;
	/** 资金清算差额-借 */
	private double fundClearDebitAmt;
	/** 资金清算差额-贷 */
	private double fundClearCreditAmt;
	/** 数值类型 */
	private String numberType;
	/** 是否复核 */
	private String isReview;
	/** 是否记账 */
	private String isTally;
	/** 创建人 */
	private String createUser;
	/** 创建人 */
	private String modifyUser;
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

	public String getFundSettleAccCode() {
		return fundSettleAccCode;
	}

	public void setFundSettleAccCode(String fundSettleAccCode) {
		this.fundSettleAccCode = fundSettleAccCode;
	}

	public String getFundSettleAccName() {
		return fundSettleAccName;
	}

	public void setFundSettleAccName(String fundSettleAccName) {
		this.fundSettleAccName = fundSettleAccName;
	}

	public String getBankSettleDate() {
		return bankSettleDate;
	}

	public void setBankSettleDate(String bankSettleDate) {
		this.bankSettleDate = bankSettleDate;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getClearCurrency() {
		return clearCurrency;
	}

	public void setClearCurrency(String clearCurrency) {
		this.clearCurrency = clearCurrency;
	}

	public String getClearInst() {
		return clearInst;
	}

	public void setClearInst(String clearInst) {
		this.clearInst = clearInst;
	}

	public String getCheckDate() {
		return checkDate;
	}

	public void setCheckDate(String checkDate) {
		this.checkDate = checkDate;
	}

	public String getGenerDate() {
		return generDate;
	}

	public void setGenerDate(String generDate) {
		this.generDate = generDate;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public int getTransNum() {
		return transNum;
	}

	public void setTransNum(int transNum) {
		this.transNum = transNum;
	}

	public double getTransDebitAmt() {
		return transDebitAmt;
	}

	public void setTransDebitAmt(double transDebitAmt) {
		this.transDebitAmt = transDebitAmt;
	}

	public double getTransCreditAmt() {
		return transCreditAmt;
	}

	public void setTransCreditAmt(double transCreditAmt) {
		this.transCreditAmt = transCreditAmt;
	}

	public double getSwapDebitAmt() {
		return swapDebitAmt;
	}

	public void setSwapDebitAmt(double swapDebitAmt) {
		this.swapDebitAmt = swapDebitAmt;
	}

	public double getSwapCreditAmt() {
		return swapCreditAmt;
	}

	public void setSwapCreditAmt(double swapCreditAmt) {
		this.swapCreditAmt = swapCreditAmt;
	}

	public double getRoveDebitAmt() {
		return roveDebitAmt;
	}

	public void setRoveDebitAmt(double roveDebitAmt) {
		this.roveDebitAmt = roveDebitAmt;
	}

	public double getRoveCreditAmt() {
		return roveCreditAmt;
	}

	public void setRoveCreditAmt(double roveCreditAmt) {
		this.roveCreditAmt = roveCreditAmt;
	}

	public double getFundClearDebitAmt() {
		return fundClearDebitAmt;
	}

	public void setFundClearDebitAmt(double fundClearDebitAmt) {
		this.fundClearDebitAmt = fundClearDebitAmt;
	}

	public double getFundClearCreditAmt() {
		return fundClearCreditAmt;
	}

	public void setFundClearCreditAmt(double fundClearCreditAmt) {
		this.fundClearCreditAmt = fundClearCreditAmt;
	}

	public String getNumberType() {
		return numberType;
	}

	public void setNumberType(String numberType) {
		this.numberType = numberType;
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
}
