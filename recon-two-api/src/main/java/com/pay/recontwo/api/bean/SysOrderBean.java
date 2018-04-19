package com.pay.recontwo.api.bean;

import java.io.Serializable;
import java.util.Date;

//import org.codehaus.jackson.annotate.JsonIgnoreProperties;
//import org.hibernate.validator.constraints.NotBlank;

/**
 * @Description: 系统订单对外查询返回数据
 * @see: SysOrderBean 此处填写需要参考的类
 * @version 2017年3月27日 下午5:18:40
 * @author guangzhi.ji
 */
//@JsonIgnoreProperties(ignoreUnknown = true)
public class SysOrderBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5172133137183624525L;
	/** 对接机构 */
	private String accessInst;
	/** 业务大类 */
	private String busiType;
	/** 业务编码 */
//	@NotBlank
	private String busiCode;
	/** 业务名称 */
	private String busiName;
	/** 主体 */
	private String organization;
	/** 文件名 */
	private String fileName;
	/** 对账期间 */
//	@NotBlank
	private String checkPeriod;
	/** 系统清算日期 */
	private String sysClearDate;
	/** 系统交易日期 */
	private Date transTime;
	/** 银行清算日期 */
	private String bankClearDate;
	/** 支付通道编码 */
	private String payChannelCode;
	/** 银行商户号 */
	private String bankCustomerNo;
	/** 商户号 */
	private String customerNo;
	/** 核对流水号 */
//	@NotBlank
	private String checkId;
	/** 交易订单号 */
	private String transOrderId;
	/** 交易状态 */
	private String transStatus;
	/** 交易类型 */
	private String transType;
	/** 交易金额 */
	private double transAmount;
	/** 交易手续费 */
	private double transFee;
	/** 交换费 */
	private double exchangeFee;
	/** 转接服务费 */
	private double transferFee;
	/** 品牌服务费 */
	private double brandFee;
	/** 交易成本 */
	private double transCost;
	/** 其它成本 */
	private double otherCost;
	/** 卡类型 */
	private String cardType;
	/** 卡号 */
	private String pan;
	/** 银行流水号 */
	private String bankFlowId;
	/** 原始银行流水号 */
	private String oldBankFlowId;
	/** 请求号 */
	private String requestId;
	/** 原始订单号 */
	private String oriOrderId;
	/** 订单中心号 */
	private String orderCenterId;
	/** 原始请求号 */
	private String oldRequestId;
	/** 银行批次号 */
	private String bankBatchNo;
	/** 银行终端号 */
	private String bankPosCati;
	/** POS终端号 */
	private String sysPosCati;
	/** 银行参考号 */
	private String bankExternalId;
	/** 数据有效性 */
	private String dataValidity;
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

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getCheckPeriod() {
		return checkPeriod;
	}

	public void setCheckPeriod(String checkPeriod) {
		this.checkPeriod = checkPeriod;
	}

	public String getSysClearDate() {
		return sysClearDate;
	}

	public void setSysClearDate(String sysClearDate) {
		this.sysClearDate = sysClearDate;
	}

	public Date getTransTime() {
		return transTime;
	}

	public void setTransTime(Date transTime) {
		this.transTime = transTime;
	}

	public String getBankClearDate() {
		return bankClearDate;
	}

	public void setBankClearDate(String bankClearDate) {
		this.bankClearDate = bankClearDate;
	}

	public String getPayChannelCode() {
		return payChannelCode;
	}

	public void setPayChannelCode(String payChannelCode) {
		this.payChannelCode = payChannelCode;
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

	public String getCheckId() {
		return checkId;
	}

	public void setCheckId(String checkId) {
		this.checkId = checkId;
	}

	public String getTransOrderId() {
		return transOrderId;
	}

	public void setTransOrderId(String transOrderId) {
		this.transOrderId = transOrderId;
	}

	public String getTransStatus() {
		return transStatus;
	}

	public void setTransStatus(String transStatus) {
		this.transStatus = transStatus;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public double getTransAmount() {
		return transAmount;
	}

	public void setTransAmount(double transAmount) {
		this.transAmount = transAmount;
	}

	public double getTransFee() {
		return transFee;
	}

	public void setTransFee(double transFee) {
		this.transFee = transFee;
	}

	public double getExchangeFee() {
		return exchangeFee;
	}

	public void setExchangeFee(double exchangeFee) {
		this.exchangeFee = exchangeFee;
	}

	public double getTransferFee() {
		return transferFee;
	}

	public void setTransferFee(double transferFee) {
		this.transferFee = transferFee;
	}

	public double getBrandFee() {
		return brandFee;
	}

	public void setBrandFee(double brandFee) {
		this.brandFee = brandFee;
	}

	public double getTransCost() {
		return transCost;
	}

	public void setTransCost(double transCost) {
		this.transCost = transCost;
	}

	public double getOtherCost() {
		return otherCost;
	}

	public void setOtherCost(double otherCost) {
		this.otherCost = otherCost;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getBankFlowId() {
		return bankFlowId;
	}

	public void setBankFlowId(String bankFlowId) {
		this.bankFlowId = bankFlowId;
	}

	public String getOldBankFlowId() {
		return oldBankFlowId;
	}

	public void setOldBankFlowId(String oldBankFlowId) {
		this.oldBankFlowId = oldBankFlowId;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getOriOrderId() {
		return oriOrderId;
	}

	public void setOriOrderId(String oriOrderId) {
		this.oriOrderId = oriOrderId;
	}

	public String getOrderCenterId() {
		return orderCenterId;
	}

	public void setOrderCenterId(String orderCenterId) {
		this.orderCenterId = orderCenterId;
	}

	public String getOldRequestId() {
		return oldRequestId;
	}

	public void setOldRequestId(String oldRequestId) {
		this.oldRequestId = oldRequestId;
	}

	public String getBankBatchNo() {
		return bankBatchNo;
	}

	public void setBankBatchNo(String bankBatchNo) {
		this.bankBatchNo = bankBatchNo;
	}

	public String getBankPosCati() {
		return bankPosCati;
	}

	public void setBankPosCati(String bankPosCati) {
		this.bankPosCati = bankPosCati;
	}

	public String getSysPosCati() {
		return sysPosCati;
	}

	public void setSysPosCati(String sysPosCati) {
		this.sysPosCati = sysPosCati;
	}

	public String getBankExternalId() {
		return bankExternalId;
	}

	public void setBankExternalId(String bankExternalId) {
		this.bankExternalId = bankExternalId;
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
		return "SysOrderBean [accessInst=" + accessInst + ", busiType=" + busiType + ", busiCode=" + busiCode + ", busiName=" + busiName + ", organization="
				+ organization + ", fileName=" + fileName + ", checkPeriod=" + checkPeriod + ", sysClearDate=" + sysClearDate + ", transTime=" + transTime
				+ ", bankClearDate=" + bankClearDate + ", payChannelCode=" + payChannelCode + ", bankCustomerNo=" + bankCustomerNo + ", customerNo=" + customerNo
				+ ", checkId=" + checkId + ", transOrderId=" + transOrderId + ", transStatus=" + transStatus + ", transType=" + transType + ", transAmount="
				+ transAmount + ", transFee=" + transFee + ", exchangeFee=" + exchangeFee + ", transferFee=" + transferFee + ", brandFee=" + brandFee
				+ ", transCost=" + transCost + ", otherCost=" + otherCost + ", cardType=" + cardType + ", pan=" + pan + ", bankFlowId=" + bankFlowId
				+ ", oldBankFlowId=" + oldBankFlowId + ", requestId=" + requestId + ", oriOrderId=" + oriOrderId + ", orderCenterId=" + orderCenterId
				+ ", oldRequestId=" + oldRequestId + ", bankBatchNo=" + bankBatchNo + ", bankPosCati=" + bankPosCati + ", sysPosCati=" + sysPosCati
				+ ", bankExternalId=" + bankExternalId + ", dataValidity=" + dataValidity + ", def1=" + def1 + ", def2=" + def2 + ", def3=" + def3 + ", ndef1="
				+ ndef1 + ", ndef2=" + ndef2 + ", ndef3=" + ndef3 + "]";
	}

}
