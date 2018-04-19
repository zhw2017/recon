package com.pay.recontwo.model;

import java.util.Date;

import com.pay.recontwo.enums.DealStatusEnum;

public class BankRecovery extends BaseMapperVO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5651216328062960804L;
	/** 对接机构 */
	private String accessInst;
	/** 业务大类 */
	private String busiType;
	/** 业务编码 */
	private String busiCode;
	/** 业务名称 */
	private String busiName;
	/** 对账期间 */
	private String checkPeriod;
	/** 主体 */
	private String organization;
	/** 资金结算账户编码 */
	private String fundSettleAccCode;
	/** 资金结算账户名称 */
	private String fundSettleAccName;
	/** 支付通道编码 */
	private String payChannelCode;
	/** 文件名 */
	private String fileName;
	/** 核对流水号 */
	private String checkId;
	/** 银行清算时间 */
	private String bankClearDate;
	/** 银行结算日期 */
	private String bankSettleDate;
	/** 代理机构标识码 */
	private String agencyId;
	/** 发送机构标识码 */
	private String sendOrgiCode;
	/** 银行跟踪号 */
	private String bankTrackNo;
	/** 银行交易时间 */
	private Date bankTransTime;
	/** 卡号 */
	private String pan;
	/** 交易金额 */
	private double transAmount;
	/** 报文类型 */
	private String messageType;
	/** 交易类型码 */
	private String transTypeCode;
	/** 商户类型 */
	private String customerType;
	/** 正确的商户类型 */
	private String realCustomerType;
	/** 追偿类型 */
	private String recoveryType;
	/** 银行终端号 */
	private String bankTerminalNo;
	/** 银行商户号 */
	private String bankCustomerNo;
	/** 银行参考号 */
	private String bankExternalId;
	/** 追偿总成本 */
	private double recoveryCost;
	/** 原始跟踪号 */
	private String oriTrackNo;
	/** 交易返回码 */
	private String transReturnCode;
	/** 服务点输入方式 */
	private String inputWay;
	/** 应付追偿手续费 */
	private double recoveryHandlingFee;
	/** 应收追偿手续费 */
	private double recoveryReceiveFee;
	/** 保留使用 */
	private String reservedUse;
	/** 发卡行标识码 */
	private String panBin;
	/** 终端类型 */
	private String terminalType;
	/** 合规特殊计费标识 */
	private String complianSpecialBilling;
	/** 标准化清算II的倍数 */
	private String standardClearMul;
	/** 交易地域 */
	private String tradingArea;
	/** 保留使用2 */
	private String reservedUse2;
	/** 处理状态 */
	private String dealStatus = DealStatusEnum.UNTREATED.toString();
	/** 是否复核 */
	private String isReview = "N";
	/** 是否记账 */
	private String isTally = "N";
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

	public String getCheckPeriod() {
		return checkPeriod;
	}

	public void setCheckPeriod(String checkPeriod) {
		this.checkPeriod = checkPeriod;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
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

	public String getPayChannelCode() {
		return payChannelCode;
	}

	public void setPayChannelCode(String payChannelCode) {
		this.payChannelCode = payChannelCode;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getCheckId() {
		return checkId;
	}

	public void setCheckId(String checkId) {
		this.checkId = checkId;
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

	public String getAgencyId() {
		return agencyId;
	}

	public void setAgencyId(String agencyId) {
		this.agencyId = agencyId;
	}

	public String getSendOrgiCode() {
		return sendOrgiCode;
	}

	public void setSendOrgiCode(String sendOrgiCode) {
		this.sendOrgiCode = sendOrgiCode;
	}

	public String getBankTrackNo() {
		return bankTrackNo;
	}

	public void setBankTrackNo(String bankTrackNo) {
		this.bankTrackNo = bankTrackNo;
	}

	public Date getBankTransTime() {
		return bankTransTime;
	}

	public void setBankTransTime(Date bankTransTime) {
		this.bankTransTime = bankTransTime;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public double getTransAmount() {
		return transAmount;
	}

	public void setTransAmount(double transAmount) {
		this.transAmount = transAmount;
	}

	public String getMessageType() {
		return messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public String getTransTypeCode() {
		return transTypeCode;
	}

	public void setTransTypeCode(String transTypeCode) {
		this.transTypeCode = transTypeCode;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getRealCustomerType() {
		return realCustomerType;
	}

	public void setRealCustomerType(String realCustomerType) {
		this.realCustomerType = realCustomerType;
	}

	public String getRecoveryType() {
		return recoveryType;
	}

	public void setRecoveryType(String recoveryType) {
		this.recoveryType = recoveryType;
	}

	public String getBankTerminalNo() {
		return bankTerminalNo;
	}

	public void setBankTerminalNo(String bankTerminalNo) {
		this.bankTerminalNo = bankTerminalNo;
	}

	public String getBankCustomerNo() {
		return bankCustomerNo;
	}

	public void setBankCustomerNo(String bankCustomerNo) {
		this.bankCustomerNo = bankCustomerNo;
	}

	public String getBankExternalId() {
		return bankExternalId;
	}

	public void setBankExternalId(String bankExternalId) {
		this.bankExternalId = bankExternalId;
	}

	public double getRecoveryCost() {
		return recoveryCost;
	}

	public void setRecoveryCost(double recoveryCost) {
		this.recoveryCost = recoveryCost;
	}

	public String getOriTrackNo() {
		return oriTrackNo;
	}

	public void setOriTrackNo(String oriTrackNo) {
		this.oriTrackNo = oriTrackNo;
	}

	public String getTransReturnCode() {
		return transReturnCode;
	}

	public void setTransReturnCode(String transReturnCode) {
		this.transReturnCode = transReturnCode;
	}

	public String getInputWay() {
		return inputWay;
	}

	public void setInputWay(String inputWay) {
		this.inputWay = inputWay;
	}

	public double getRecoveryHandlingFee() {
		return recoveryHandlingFee;
	}

	public void setRecoveryHandlingFee(double recoveryHandlingFee) {
		this.recoveryHandlingFee = recoveryHandlingFee;
	}

	public double getRecoveryReceiveFee() {
		return recoveryReceiveFee;
	}

	public void setRecoveryReceiveFee(double recoveryReceiveFee) {
		this.recoveryReceiveFee = recoveryReceiveFee;
	}

	public String getReservedUse() {
		return reservedUse;
	}

	public void setReservedUse(String reservedUse) {
		this.reservedUse = reservedUse;
	}

	public String getPanBin() {
		return panBin;
	}

	public void setPanBin(String panBin) {
		this.panBin = panBin;
	}

	public String getTerminalType() {
		return terminalType;
	}

	public void setTerminalType(String terminalType) {
		this.terminalType = terminalType;
	}

	public String getComplianSpecialBilling() {
		return complianSpecialBilling;
	}

	public void setComplianSpecialBilling(String complianSpecialBilling) {
		this.complianSpecialBilling = complianSpecialBilling;
	}

	public String getStandardClearMul() {
		return standardClearMul;
	}

	public void setStandardClearMul(String standardClearMul) {
		this.standardClearMul = standardClearMul;
	}

	public String getTradingArea() {
		return tradingArea;
	}

	public void setTradingArea(String tradingArea) {
		this.tradingArea = tradingArea;
	}

	public String getReservedUse2() {
		return reservedUse2;
	}

	public void setReservedUse2(String reservedUse2) {
		this.reservedUse2 = reservedUse2;
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
		return "BankRecovery [accessInst=" + accessInst + ", busiType=" + busiType + ", busiCode=" + busiCode + ", busiName=" + busiName + ", checkPeriod="
				+ checkPeriod + ", organization=" + organization + ", fundSettleAccCode=" + fundSettleAccCode + ", fundSettleAccName=" + fundSettleAccName
				+ ", payChannelCode=" + payChannelCode + ", fileName=" + fileName + ", checkId=" + checkId + ", bankClearDate=" + bankClearDate
				+ ", bankSettleDate=" + bankSettleDate + ", agencyId=" + agencyId + ", sendOrgiCode=" + sendOrgiCode + ", bankTrackNo=" + bankTrackNo
				+ ", bankTransTime=" + bankTransTime + ", pan=" + pan + ", transAmount=" + transAmount + ", messageType=" + messageType + ", transTypeCode="
				+ transTypeCode + ", customerType=" + customerType + ", realCustomerType=" + realCustomerType + ", recoveryType=" + recoveryType
				+ ", bankTerminalNo=" + bankTerminalNo + ", bankCustomerNo=" + bankCustomerNo + ", bankExternalId=" + bankExternalId + ", recoveryCost="
				+ recoveryCost + ", oriTrackNo=" + oriTrackNo + ", transReturnCode=" + transReturnCode + ", inputWay=" + inputWay + ", recoveryHandlingFee="
				+ recoveryHandlingFee + ", recoveryReceiveFee=" + recoveryReceiveFee + ", reservedUse=" + reservedUse + ", panBin=" + panBin + ", terminalType="
				+ terminalType + ", complianSpecialBilling=" + complianSpecialBilling + ", standardClearMul=" + standardClearMul + ", tradingArea=" + tradingArea
				+ ", reservedUse2=" + reservedUse2 + ", dealStatus=" + dealStatus + ", isReview=" + isReview + ", isTally=" + isTally + ", def1=" + def1 + ", def2="
				+ def2 + ", def3=" + def3 + ", ndef1=" + ndef1 + ", ndef2=" + ndef2 + ", ndef3=" + ndef3 + "]";
	}

}

