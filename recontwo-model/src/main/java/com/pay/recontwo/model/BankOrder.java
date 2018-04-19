package com.pay.recontwo.model;

import java.util.Date;

//import org.hibernate.validator.constraints.NotBlank;

public class BankOrder extends BaseMapperVO {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1187062999182389742L;
	/** 对接机构 */
	private String accessInst;
	/** 业务大类 */
	private String busiType;
	/** 业务编码 */
//	@NotBlank
	private String busiCode;
	/** 业务名称 */
	private String busiName;
	/** 对账期间 */
//	@NotBlank
	private String checkPeriod;
	/** 主体 */
	private String organization;
	/** 文件名 */
	private String fileName;
	/** 资金结算账户编码 */
	private String fundSettleAccCode;
	/** 资金结算账户名称 */
	private String fundSettleAccName;
	/** 支付通道编码 */
	private String payChannelCode;
	/** 核对流水号 */
//	@NotBlank
	private String checkId;
	/** 银行清算时间 */
	private String bankClearDate;
	/** 银行结算日期 */
	private String bankSettleDate;
	/** 银行交易时间 */
	private Date bankTransTime;
	/** 银行商户号 */
	private String bankCustomerNo;
	/** 卡号 */
	private String pan;
	/** 交易状态 */
	private String transStatus;
	/** 交易类型码 */
	private String transTypeCode;
	/** 交易金额 */
	private double transAmount;
	/** 交易总成本 */
	private double transCost;
	/** 原始交易时间 */
	private Date oldTransTime;
	/** 原始跟踪号 */
	private String oriTrackNo;
	/** 终端类型 */
	private String terminalType;
	/** 商户类型 */
	private String customerType;
	/** 银行跟踪号 */
	private String bankTrackNo;
	/** 银行请求号 */
	private String bankRequestId;
	/** 银行参考号 */
	private String bankExternalId;
	/** 银行流水号 */
	private String bankFlow;
	/** 银行终端号 */
	private String bankTerminalNo;
	/** 报文类型 */
	private String messageType;
	/** 转接服务费 */
	private double transferFee;
	/** 发卡方应付手续费 */
	private double carHandlingFee;
	/** 发卡方应收手续费 */
	private double carReceiveFee;
	/** 品牌服务费 */
	private double brandFee;
	/** 其它费用 */
	private double otherFee;
	/** 服务点条件码 */
	private String servConCode;
	/** 交易发起方式 */
	private String transHowInit;
	/** 标准商户 */
	private String isStandard;
	/** 账户结算类型 */
	private String accSettleType;
	/** 交易地域 */
	private String tradingArea;
	/** 代理机构标识码 */
	private String agencyId;
	/** 发送机构标识码 */
	private String sendOrgiCode;
	/** 特殊计费类型 */
	private String specBillType;
	/** 特殊计费档次 */
	private String specBillGrade;
	/** 代收时的承兑金额 */
	private double receAcceptFee;
	/** 分期付款手续费 */
	private double stagingPayFee;
	/** 持卡人交易手续费 */
	private double cardTransFee;
	/** 数据有效性 */
	private String dataValidity;
	/** 自定义项1 */
	/** 目前用于存储服务点输入方式 */
	private String def1;
	/** 自定义项2 */
	private String def2;
	/** 自定义项3 */
	private String def3;
	/** 数值自定义项1 */
	/** 目前用于COMA额外的手续费 */
	private double ndef1;
	/** 数值自定义项2 */
	private double ndef2;
	/** 数值自定义项3 */
	private double ndef3;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
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

	public Date getBankTransTime() {
		return bankTransTime;
	}

	public void setBankTransTime(Date bankTransTime) {
		this.bankTransTime = bankTransTime;
	}

	public String getBankCustomerNo() {
		return bankCustomerNo;
	}

	public void setBankCustomerNo(String bankCustomerNo) {
		this.bankCustomerNo = bankCustomerNo;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getTransStatus() {
		return transStatus;
	}

	public void setTransStatus(String transStatus) {
		this.transStatus = transStatus;
	}

	public String getTransTypeCode() {
		return transTypeCode;
	}

	public void setTransTypeCode(String transTypeCode) {
		this.transTypeCode = transTypeCode;
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

	public Date getOldTransTime() {
		return oldTransTime;
	}

	public void setOldTransTime(Date oldTransTime) {
		this.oldTransTime = oldTransTime;
	}

	public String getOriTrackNo() {
		return oriTrackNo;
	}

	public void setOriTrackNo(String oriTrackNo) {
		this.oriTrackNo = oriTrackNo;
	}

	public String getTerminalType() {
		return terminalType;
	}

	public void setTerminalType(String terminalType) {
		this.terminalType = terminalType;
	}

	public String getBankTrackNo() {
		return bankTrackNo;
	}

	public void setBankTrackNo(String bankTrackNo) {
		this.bankTrackNo = bankTrackNo;
	}

	public String getBankRequestId() {
		return bankRequestId;
	}

	public void setBankRequestId(String bankRequestId) {
		this.bankRequestId = bankRequestId;
	}

	public String getBankExternalId() {
		return bankExternalId;
	}

	public void setBankExternalId(String bankExternalId) {
		this.bankExternalId = bankExternalId;
	}

	public String getBankFlow() {
		return bankFlow;
	}

	public void setBankFlow(String bankFlow) {
		this.bankFlow = bankFlow;
	}

	public String getBankTerminalNo() {
		return bankTerminalNo;
	}

	public void setBankTerminalNo(String bankTerminalNo) {
		this.bankTerminalNo = bankTerminalNo;
	}

	public String getMessageType() {
		return messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public double getTransferFee() {
		return transferFee;
	}

	public void setTransferFee(double transferFee) {
		this.transferFee = transferFee;
	}

	public double getCarHandlingFee() {
		return carHandlingFee;
	}

	public void setCarHandlingFee(double carHandlingFee) {
		this.carHandlingFee = carHandlingFee;
	}

	public double getCarReceiveFee() {
		return carReceiveFee;
	}

	public void setCarReceiveFee(double carReceiveFee) {
		this.carReceiveFee = carReceiveFee;
	}

	public double getBrandFee() {
		return brandFee;
	}

	public void setBrandFee(double brandFee) {
		this.brandFee = brandFee;
	}

	public double getOtherFee() {
		return otherFee;
	}

	public void setOtherFee(double otherFee) {
		this.otherFee = otherFee;
	}

	public String getServConCode() {
		return servConCode;
	}

	public void setServConCode(String servConCode) {
		this.servConCode = servConCode;
	}

	public String getTransHowInit() {
		return transHowInit;
	}

	public void setTransHowInit(String transHowInit) {
		this.transHowInit = transHowInit;
	}

	public String getIsStandard() {
		return isStandard;
	}

	public void setIsStandard(String isStandard) {
		this.isStandard = isStandard;
	}

	public String getAccSettleType() {
		return accSettleType;
	}

	public void setAccSettleType(String accSettleType) {
		this.accSettleType = accSettleType;
	}

	public String getTradingArea() {
		return tradingArea;
	}

	public void setTradingArea(String tradingArea) {
		this.tradingArea = tradingArea;
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

	public String getSpecBillType() {
		return specBillType;
	}

	public void setSpecBillType(String specBillType) {
		this.specBillType = specBillType;
	}

	public String getSpecBillGrade() {
		return specBillGrade;
	}

	public void setSpecBillGrade(String specBillGrade) {
		this.specBillGrade = specBillGrade;
	}

	public double getReceAcceptFee() {
		return receAcceptFee;
	}

	public void setReceAcceptFee(double receAcceptFee) {
		this.receAcceptFee = receAcceptFee;
	}

	public double getStagingPayFee() {
		return stagingPayFee;
	}

	public void setStagingPayFee(double stagingPayFee) {
		this.stagingPayFee = stagingPayFee;
	}

	public double getCardTransFee() {
		return cardTransFee;
	}

	public void setCardTransFee(double cardTransFee) {
		this.cardTransFee = cardTransFee;
	}

	public String getDataValidity() {
		return dataValidity;
	}

	public void setDataValidity(String dataValidity) {
		this.dataValidity = dataValidity;
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
		return "BankOrder [accessInst=" + accessInst + ", busiType=" + busiType + ", busiCode=" + busiCode + ", busiName=" + busiName + ", checkPeriod="
				+ checkPeriod + ", organization=" + organization + ", fileName=" + fileName + ", fundSettleAccCode=" + fundSettleAccCode + ", fundSettleAccName="
				+ fundSettleAccName + ", payChannelCode=" + payChannelCode + ", checkId=" + checkId + ", bankClearDate=" + bankClearDate + ", bankSettleDate="
				+ bankSettleDate + ", bankTransTime=" + bankTransTime + ", bankCustomerNo=" + bankCustomerNo + ", pan=" + pan + ", transStatus=" + transStatus
				+ ", transTypeCode=" + transTypeCode + ", transAmount=" + transAmount + ", transCost=" + transCost + ", oldTransTime=" + oldTransTime
				+ ", oriTrackNo=" + oriTrackNo + ", terminalType=" + terminalType + ", customerType=" + customerType + ", bankTrackNo=" + bankTrackNo
				+ ", bankRequestId=" + bankRequestId + ", bankExternalId=" + bankExternalId + ", bankFlow=" + bankFlow + ", bankTerminalNo=" + bankTerminalNo
				+ ", messageType=" + messageType + ", transferFee=" + transferFee + ", carHandlingFee=" + carHandlingFee + ", carReceiveFee=" + carReceiveFee
				+ ", brandFee=" + brandFee + ", otherFee=" + otherFee + ", servConCode=" + servConCode + ", transHowInit=" + transHowInit + ", isStandard="
				+ isStandard + ", accSettleType=" + accSettleType + ", tradingArea=" + tradingArea + ", agencyId=" + agencyId + ", sendOrgiCode=" + sendOrgiCode
				+ ", specBillType=" + specBillType + ", specBillGrade=" + specBillGrade + ", receAcceptFee=" + receAcceptFee + ", stagingPayFee=" + stagingPayFee
				+ ", cardTransFee=" + cardTransFee + ", dataValidity=" + dataValidity + ", def1=" + def1 + ", def2=" + def2 + ", def3=" + def3 + ", ndef1=" + ndef1
				+ ", ndef2=" + ndef2 + ", ndef3=" + ndef3 + "]";
	}

}
