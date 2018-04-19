package com.pay.recontwo.api.bean;

import java.io.Serializable;
import java.util.Date;

//import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * @Description: 银行订单对外查询返回数据
 * @see: BankOrderBean 此处填写需要参考的类
 * @version 2016年12月1日 下午3:52:38
 * @author guangzhi.ji
 */
//@JsonIgnoreProperties(ignoreUnknown = true)
public class BankOrderBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1986284809259500163L;
	/** 对接机构 */
	private String accessInst;
	/** 支付通道编码 */
	private String payChannelCode;
	/** 银行清算时间 */
	private String bankClearDate;
	/** 银行交易时间 */
	private Date bankTransTime;
	/** 银行商户号 */
	private String bankCustomerNo;
	/** 卡号 */
	private String pan;
	/** 交易金额 */
	private double transAmount;
	/** 转接服务费 */
	private double transferFee;
	/** 发卡方应付手续费 (消费时收取) */
	private double carHandlingFee;
	/** 发卡方应收手续费(退货时收取) */
	private double carReceiveFee;
	/** 品牌服务费 */
	private double brandFee;
	/** 标准商户 */
	private String isStandard;

	public String getAccessInst() {
		return accessInst;
	}

	public void setAccessInst(String accessInst) {
		this.accessInst = accessInst;
	}

	public String getPayChannelCode() {
		return payChannelCode;
	}

	public void setPayChannelCode(String payChannelCode) {
		this.payChannelCode = payChannelCode;
	}

	public String getBankClearDate() {
		return bankClearDate;
	}

	public void setBankClearDate(String bankClearDate) {
		this.bankClearDate = bankClearDate;
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

	public double getTransAmount() {
		return transAmount;
	}

	public void setTransAmount(double transAmount) {
		this.transAmount = transAmount;
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

	public String getIsStandard() {
		return isStandard;
	}

	public void setIsStandard(String isStandard) {
		this.isStandard = isStandard;
	}

	@Override
	public String toString() {
		return "BankOrderBean [accessInst=" + accessInst + ", payChannelCode=" + payChannelCode + ", bankClearDate=" + bankClearDate + ", bankTransTime="
				+ bankTransTime + ", bankCustomerNo=" + bankCustomerNo + ", pan=" + pan + ", transAmount=" + transAmount + ", transferFee=" + transferFee
				+ ", carHandlingFee=" + carHandlingFee + ", carReceiveFee=" + carReceiveFee + ", brandFee=" + brandFee + ", isStandard=" + isStandard + "]";
	}

}
