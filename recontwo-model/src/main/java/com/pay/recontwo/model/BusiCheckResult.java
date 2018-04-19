package com.pay.recontwo.model;

//import org.hibernate.validator.constraints.NotBlank;

public class BusiCheckResult extends BaseMapperVO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 325936240928385212L;
	/** 对接机构 */
//	@NotBlank
	private String accessInst;
	/** 业务大类 */
//	@NotBlank
	private String busiType;
	/** 业务编码 */
//	@NotBlank
	private String busiCode;
	/** 业务名称 */
	private String busiName;
	/** 主体 */
//	@NotBlank
	private String organization;
	/** 对账期间 */
//	@NotBlank
	private String checkPeriod;
	/** 支付通道编码 */
	private String payChannelCode;
	/** 系统交易笔数 */
	private int sysTransCount;
	/** 系统交易金额 */
	private double sysTransAmount;
	/** 系统交易成本 */
	private double sysTransCost;
	/** 系统交易手续费 */
	private double sysTransFee;
	/** 银行交易笔数 */
	private int bankTransCount;
	/** 银行交易金额 */
	private double bankTransAmount;
	/** 银行交易成本 */
	private double bankTransCost;
	/** 银行交易手续费 */
	private double bankTransFee;
	/** 双边交易笔数 */
	private int bilateralCount;
	/** 双边系统金额 */
	private double bilateralSysAmt;
	/** 双边银行金额 */
	private double bilateralBankAmt;
	/** 双边系统成本 */
	private double bilateralSysCost;
	/** 双边银行成本 */
	private double bilateralBankCost;
	/** 系统单边笔数 */
	private int sysSideCount;
	/** 系统单边金额 */
	private double sysSideAmount;
	/** 系统单边成本 */
	private double sysSideCost;
	/** 银行单边笔数 */
	private int bankSideCount;
	/** 银行单边金额 */
	private double bankSideAmount;
	/** 银行单边成本 */
	private double bankSideCost;
	/** 系统跨日笔数 */
	private int sysCrossCount;
	/** 系统跨日金额 */
	private double sysCrossAmount;
	/** 系统跨日成本 */
	private double sysCrossCost;
	/** 银行跨日笔数 */
	private int bankCrossCount;
	/** 银行跨日金额 */
	private double bankCrossAmount;
	/** 银行跨日成本 */
	private double bankCrossCost;
	/** 双边系统手续费 */
	private double bilateralSysFee;
	/** 双边银行手续费 */
	private double bilateralBankFee;
	/** 是否复核 */
//	@NotBlank
	private String isReview = "N";
	/** 是否记账 */
//	@NotBlank
	private String isTally = "N";
	/** 创建人 */
//	@NotBlank
	private String createUser;
	/** 创建人 */
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

	public double getBankTransFee() {
		return bankTransFee;
	}

	public void setBankTransFee(double bankTransFee) {
		this.bankTransFee = bankTransFee;
	}

	public double getBilateralSysFee() {
		return bilateralSysFee;
	}

	public void setBilateralSysFee(double bilateralSysFee) {
		this.bilateralSysFee = bilateralSysFee;
	}

	public double getBilateralBankFee() {
		return bilateralBankFee;
	}

	public void setBilateralBankFee(double bilateralBankFee) {
		this.bilateralBankFee = bilateralBankFee;
	}

	public String getPayChannelCode() {
		return payChannelCode;
	}

	public void setPayChannelCode(String payChannelCode) {
		this.payChannelCode = payChannelCode;
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

	public int getSysTransCount() {
		return sysTransCount;
	}

	public void setSysTransCount(int sysTransCount) {
		this.sysTransCount = sysTransCount;
	}

	public double getSysTransAmount() {
		return sysTransAmount;
	}

	public void setSysTransAmount(double sysTransAmount) {
		this.sysTransAmount = sysTransAmount;
	}

	public double getSysTransCost() {
		return sysTransCost;
	}

	public void setSysTransCost(double sysTransCost) {
		this.sysTransCost = sysTransCost;
	}

	public double getSysTransFee() {
		return sysTransFee;
	}

	public void setSysTransFee(double sysTransFee) {
		this.sysTransFee = sysTransFee;
	}

	public int getBankTransCount() {
		return bankTransCount;
	}

	public void setBankTransCount(int bankTransCount) {
		this.bankTransCount = bankTransCount;
	}

	public double getBankTransAmount() {
		return bankTransAmount;
	}

	public void setBankTransAmount(double bankTransAmount) {
		this.bankTransAmount = bankTransAmount;
	}

	public double getBankTransCost() {
		return bankTransCost;
	}

	public void setBankTransCost(double bankTransCost) {
		this.bankTransCost = bankTransCost;
	}

	public int getBilateralCount() {
		return bilateralCount;
	}

	public void setBilateralCount(int bilateralCount) {
		this.bilateralCount = bilateralCount;
	}

	public double getBilateralSysAmt() {
		return bilateralSysAmt;
	}

	public void setBilateralSysAmt(double bilateralSysAmt) {
		this.bilateralSysAmt = bilateralSysAmt;
	}

	public double getBilateralBankAmt() {
		return bilateralBankAmt;
	}

	public void setBilateralBankAmt(double bilateralBankAmt) {
		this.bilateralBankAmt = bilateralBankAmt;
	}

	public double getBilateralSysCost() {
		return bilateralSysCost;
	}

	public void setBilateralSysCost(double bilateralSysCost) {
		this.bilateralSysCost = bilateralSysCost;
	}

	public double getBilateralBankCost() {
		return bilateralBankCost;
	}

	public void setBilateralBankCost(double bilateralBankCost) {
		this.bilateralBankCost = bilateralBankCost;
	}

	public int getSysSideCount() {
		return sysSideCount;
	}

	public void setSysSideCount(int sysSideCount) {
		this.sysSideCount = sysSideCount;
	}

	public double getSysSideAmount() {
		return sysSideAmount;
	}

	public void setSysSideAmount(double sysSideAmount) {
		this.sysSideAmount = sysSideAmount;
	}

	public double getSysSideCost() {
		return sysSideCost;
	}

	public void setSysSideCost(double sysSideCost) {
		this.sysSideCost = sysSideCost;
	}

	public int getBankSideCount() {
		return bankSideCount;
	}

	public void setBankSideCount(int bankSideCount) {
		this.bankSideCount = bankSideCount;
	}

	public double getBankSideAmount() {
		return bankSideAmount;
	}

	public void setBankSideAmount(double bankSideAmount) {
		this.bankSideAmount = bankSideAmount;
	}

	public double getBankSideCost() {
		return bankSideCost;
	}

	public void setBankSideCost(double bankSideCost) {
		this.bankSideCost = bankSideCost;
	}

	public int getSysCrossCount() {
		return sysCrossCount;
	}

	public void setSysCrossCount(int sysCrossCount) {
		this.sysCrossCount = sysCrossCount;
	}

	public double getSysCrossAmount() {
		return sysCrossAmount;
	}

	public void setSysCrossAmount(double sysCrossAmount) {
		this.sysCrossAmount = sysCrossAmount;
	}

	public double getSysCrossCost() {
		return sysCrossCost;
	}

	public void setSysCrossCost(double sysCrossCost) {
		this.sysCrossCost = sysCrossCost;
	}

	public int getBankCrossCount() {
		return bankCrossCount;
	}

	public void setBankCrossCount(int bankCrossCount) {
		this.bankCrossCount = bankCrossCount;
	}

	public double getBankCrossAmount() {
		return bankCrossAmount;
	}

	public void setBankCrossAmount(double bankCrossAmount) {
		this.bankCrossAmount = bankCrossAmount;
	}

	public double getBankCrossCost() {
		return bankCrossCost;
	}

	public void setBankCrossCost(double bankCrossCost) {
		this.bankCrossCost = bankCrossCost;
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

	@Override
	public String toString() {
		return "BusiCheckResult [accessInst=" + accessInst + ", busiType=" + busiType + ", busiCode=" + busiCode + ", busiName=" + busiName + ", organization="
				+ organization + ", checkPeriod=" + checkPeriod + ", payChannelCode=" + payChannelCode + ", sysTransCount=" + sysTransCount + ", sysTransAmount="
				+ sysTransAmount + ", sysTransCost=" + sysTransCost + ", sysTransFee=" + sysTransFee + ", bankTransCount=" + bankTransCount + ", bankTransAmount="
				+ bankTransAmount + ", bankTransCost=" + bankTransCost + ", bilateralCount=" + bilateralCount + ", bilateralSysAmt=" + bilateralSysAmt
				+ ", bilateralBankAmt=" + bilateralBankAmt + ", bilateralSysCost=" + bilateralSysCost + ", bilateralBankCost=" + bilateralBankCost
				+ ", sysSideCount=" + sysSideCount + ", sysSideAmount=" + sysSideAmount + ", sysSideCost=" + sysSideCost + ", bankSideCount=" + bankSideCount
				+ ", bankSideAmount=" + bankSideAmount + ", bankSideCost=" + bankSideCost + ", sysCrossCount=" + sysCrossCount + ", sysCrossAmount="
				+ sysCrossAmount + ", sysCrossCost=" + sysCrossCost + ", bankCrossCount=" + bankCrossCount + ", bankCrossAmount=" + bankCrossAmount
				+ ", bankCrossCost=" + bankCrossCost + ", isReview=" + isReview + ", isTally=" + isTally + ", createUser=" + createUser + ", modifyUser="
				+ modifyUser + ", def3=" + def3 + ", def2=" + def2 + ", def1=" + def1 + ", ndef1=" + ndef1 + ", ndef2=" + ndef2 + ", ndef3=" + ndef3 + "]";
	}

}
