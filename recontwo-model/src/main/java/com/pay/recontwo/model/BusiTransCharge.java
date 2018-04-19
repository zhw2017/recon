package com.pay.recontwo.model;

import java.util.Date;

//import org.hibernate.validator.constraints.NotBlank;

public class BusiTransCharge extends BaseMapperVO {
	/**
	 *
	 */
	private static final long serialVersionUID = -7502016492408174673L;
	/** 对账期间 */
//	@NotBlank
	private String checkPeriod;
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
	/** 支付通道编码 */
//	@NotBlank
	private String payChannelCode;
	/** 系统清算时间 */
	private String sysClearDate;
	/** 银行清算时间 */
	private String bankClearDate;
	/** 系统交易时间 */
	private Date sysTransTime;
	/** 银行交易时间 */
	private Date bankTransTime;
	/** 主体 */
//	@NotBlank
	private String organization;
	/** 核对流水号 */
//	@NotBlank
	private String checkId;
	/** 差错类型 */
//	@NotBlank
	private String chargebackType;
	/** 系统交易金额 */
	private double sysAmount;
	/** 系统交易成本 */
	private double sysCost;
	/** 系统交易手续费 */
	private double sysFee;
	/** 银行交易金额 */
	private double bankAmount;
	/** 银行交易成本 */
	private double bankCost;
	/** 银行参考号 */
	private String bankExternalId;
	/** 银行商户号 */
	private String bankCustomerNo;
	/** 系统商户号 */
	private String customerNo;
	/** 订单号 */
	private String orderId;
	/** 卡号 */
	private String pan;
	/** 资金结算账户编码 */
	private String fundSettleAccCode;
	/** 品牌服务费 */
	private double brandFee;
	/** 交易类型 */
	private String transType;
	/** 差错处理状态 */
	private String dealStatus = "UNTREATED";
	/** 是否复核 */
	private String isReview = "N";
	/** 是否记账 */
	private String isTally = "N";
	/** 创建人 */
//	@NotBlank
	private String createUser;
	/** 创建人 */
	private String modifyUser;
	/** 自定义项1 */
	private String def1;
	/** 自定义项2 */
	private String def2;
	/** 自定义项3 */
	private String def3;
	/** 数值自定义项1 代理清算的保留银行单边的手续费 */
	private double ndef1;
	/** 数值自定义项2 */
	private double ndef2;
	/** 数值自定义项3 */
	private double ndef3;

	public BusiTransCharge() {}

	public String getFundSettleAccCode() {
		return fundSettleAccCode;
	}

	public void setFundSettleAccCode(String fundSettleAccCode) {
		this.fundSettleAccCode = fundSettleAccCode;
	}

	public double getBrandFee() {
		return brandFee;
	}

	public void setBrandFee(double brandFee) {
		this.brandFee = brandFee;
	}

	public BusiTransCharge(String createUser) {
		super();
		this.createUser = createUser;
	}

	public double getSysFee() {
		return sysFee;
	}

	public void setSysFee(double sysFee) {
		this.sysFee = sysFee;
	}

	public String getCheckPeriod() {
		return checkPeriod;
	}

	public void setCheckPeriod(String checkPeriod) {
		this.checkPeriod = checkPeriod;
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

	public String getPayChannelCode() {
		return payChannelCode;
	}

	public void setPayChannelCode(String payChannelCode) {
		this.payChannelCode = payChannelCode;
	}

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

	public Date getSysTransTime() {
		return sysTransTime;
	}

	public void setSysTransTime(Date sysTransTime) {
		this.sysTransTime = sysTransTime;
	}

	public Date getBankTransTime() {
		return bankTransTime;
	}

	public void setBankTransTime(Date bankTransTime) {
		this.bankTransTime = bankTransTime;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getCheckId() {
		return checkId;
	}

	public void setCheckId(String checkId) {
		this.checkId = checkId;
	}

	public String getChargebackType() {
		return chargebackType;
	}

	public void setChargebackType(String chargebackType) {
		this.chargebackType = chargebackType;
	}

	public double getSysAmount() {
		return sysAmount;
	}

	public void setSysAmount(double sysAmount) {
		this.sysAmount = sysAmount;
	}

	public double getSysCost() {
		return sysCost;
	}

	public void setSysCost(double sysCost) {
		this.sysCost = sysCost;
	}

	public double getBankAmount() {
		return bankAmount;
	}

	public void setBankAmount(double bankAmount) {
		this.bankAmount = bankAmount;
	}

	public double getBankCost() {
		return bankCost;
	}

	public void setBankCost(double bankCost) {
		this.bankCost = bankCost;
	}

	public String getBankExternalId() {
		return bankExternalId;
	}

	public void setBankExternalId(String bankExternalId) {
		this.bankExternalId = bankExternalId;
	}

	public String getBankCustomerNo() {
		return bankCustomerNo;
	}

	public void setBankCustomerNo(String bankCustomerNo) {
		this.bankCustomerNo = bankCustomerNo;
	}

	public String getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public String getDealStatus() {
		return dealStatus;
	}

	public void setDealStatus(String dealStatus) {
		this.dealStatus = dealStatus;
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

	@Override
	public String toString() {
		return "BusiTransCharge [checkPeriod=" + checkPeriod + ", accessInst=" + accessInst + ", busiType=" + busiType + ", busiCode=" + busiCode + ", busiName="
				+ busiName + ", payChannelCode=" + payChannelCode + ", sysClearDate=" + sysClearDate + ", bankClearDate=" + bankClearDate + ", sysTransTime="
				+ sysTransTime + ", bankTransTime=" + bankTransTime + ", organization=" + organization + ", checkId=" + checkId + ", chargebackType="
				+ chargebackType + ", sysAmount=" + sysAmount + ", sysCost=" + sysCost + ", sysFee=" + sysFee + ", bankAmount=" + bankAmount + ", bankCost="
				+ bankCost + ", bankExternalId=" + bankExternalId + ", bankCustomerNo=" + bankCustomerNo + ", customerNo=" + customerNo + ", orderId=" + orderId
				+ ", pan=" + pan + ", fundSettleAccCode=" + fundSettleAccCode + ", brandFee=" + brandFee + ", transType=" + transType + ", dealStatus=" + dealStatus
				+ ", isReview=" + isReview + ", isTally=" + isTally + ", createUser=" + createUser + ", modifyUser=" + modifyUser + ", def1=" + def1 + ", def2="
				+ def2 + ", def3=" + def3 + ", ndef1=" + ndef1 + ", ndef2=" + ndef2 + ", ndef3=" + ndef3 + "]";
	}

}
