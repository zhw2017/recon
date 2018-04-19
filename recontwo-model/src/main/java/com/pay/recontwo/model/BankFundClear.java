package com.pay.recontwo.model;

//import org.hibernate.validator.constraints.NotBlank;

public class BankFundClear extends BaseMapperVO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4404817719578133919L;
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
	/** 场次号 */
	private String ccNo;
	/** 清算机构 */
//	@NotBlank
	private String clearInstName;
	/** 清算机构代码 */
//	@NotBlank
	private String clearInstCode;
	/** 清算日期 */
//	@NotBlank
	private String checkDate;
	/** 生成日期 */
	private String generDate;
	/** 序号 */
	private String xNo;
	/** 入网机构代码 */
	private String corrInstCode;
	/** 入网机构名称 */
	private String corrInstName;
	/** 资金清算净额-贷 */
	private double funClearCreBal;
	/** 资金清算净额-借 */
	private double funClearDebBal;
	/** 数值类型 */
//	@NotBlank
	private String numberType;
	/** 是否复核 */
//	@NotBlank
	private String isReview;
	/** 是否记账 */
//	@NotBlank
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

	public String getCcNo() {
		return ccNo;
	}

	public void setCcNo(String ccNo) {
		this.ccNo = ccNo;
	}

	public String getClearInstName() {
		return clearInstName;
	}

	public void setClearInstName(String clearInstName) {
		this.clearInstName = clearInstName;
	}

	public String getClearInstCode() {
		return clearInstCode;
	}

	public void setClearInstCode(String clearInstCode) {
		this.clearInstCode = clearInstCode;
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

	public String getxNo() {
		return xNo;
	}

	public void setxNo(String xNo) {
		this.xNo = xNo;
	}

	public String getCorrInstCode() {
		return corrInstCode;
	}

	public void setCorrInstCode(String corrInstCode) {
		this.corrInstCode = corrInstCode;
	}

	public String getCorrInstName() {
		return corrInstName;
	}

	public void setCorrInstName(String corrInstName) {
		this.corrInstName = corrInstName;
	}

	public double getFunClearCreBal() {
		return funClearCreBal;
	}

	public void setFunClearCreBal(double funClearCreBal) {
		this.funClearCreBal = funClearCreBal;
	}

	public double getFunClearDebBal() {
		return funClearDebBal;
	}

	public void setFunClearDebBal(double funClearDebBal) {
		this.funClearDebBal = funClearDebBal;
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
