package com.pay.recontwo.model;

/**
 * @Description: 这里用一句话描述这个类的作用
 * @see: SysBankClearDiff 此处填写需要参考的类
 * @version 2017年8月9日 下午5:39:45
 * @author guangzhi.ji
 */
public class SysBankClearDiff extends BaseMapperVO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7117621484295023556L;
	/** 系统清算日期 */
	private String sysClearDate;
	/** 银行清算日期 */
	private String bankClearDate;
	/** 主体 */
	private String organization;
	/** 对接机构 */
	private String accessInst;
	/** 业务大类 */
	private String busiType;
	/** 业务编码 */
	private String busiCode;
	/** 业务名称 */
	private String busiName;
	/** 交易金额 */
	private double transAmount;
	/** 银行成本 */
	private double transCost;
	/** 商户手续费 */
	private double transFee;
	/** 银行余额 */
	private double bankBal;
	/** 毛利 */
	private double grossProfit;
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

	public String getSysClearDate() {
		return sysClearDate;
	}

	public void setSysClearDate(String sysClearDate) {
		this.sysClearDate = sysClearDate;
	}

	public String getBankClearDate() {
		return bankClearDate;
	}

	public void setBankClearDate(String bankClearDate) {
		this.bankClearDate = bankClearDate;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

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

	public double getBankBal() {
		return bankBal;
	}

	public void setBankBal(double bankBal) {
		this.bankBal = bankBal;
	}

	public double getGrossProfit() {
		return grossProfit;
	}

	public void setGrossProfit(double grossProfit) {
		this.grossProfit = grossProfit;
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

}
