package com.pay.recontwo.model;

import java.util.Date;

import com.pay.recontwo.enums.DealStatusEnum;

public class BankPayFee extends BaseMapperVO {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2551579547448714939L;
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
	/** 银行清算时间 */
	private String bankClearDate;
	/** 银行结算日期 */
	private String bankSettleDate;
	/** 支付通道编码 */
	private String payChannelCode;
	/** 文件名 */
	private String fileName;
	/** 交易代码 */
	private String transCode;
	/** 交易金额 */
	private double transAmt;
	/** 原因码 */
	private String reasonCode;
	/** 发起方一级机构 */
	private String sendOneInst;
	/** 发起方二级机构 */
	private String sendTwoInst;
	/** 接收方一级机构 */
	private String recipOneInst;
	/** 接收方二级机构 */
	private String recipTwoInst;
	/** 交易日期时间 */
	private Date transTime;
	/** 系统跟踪号 */
	private String trackNo;
	/** 主账号 */
	private String pan;
	/** 收付费附言 */
	private String fcpDemo;
	/** 保留使用 */
	private String reservedUse;
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

	public String getTransCode() {
		return transCode;
	}

	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}

	public double getTransAmt() {
		return transAmt;
	}

	public void setTransAmt(double transAmt) {
		this.transAmt = transAmt;
	}

	public String getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getSendOneInst() {
		return sendOneInst;
	}

	public void setSendOneInst(String sendOneInst) {
		this.sendOneInst = sendOneInst;
	}

	public String getSendTwoInst() {
		return sendTwoInst;
	}

	public void setSendTwoInst(String sendTwoInst) {
		this.sendTwoInst = sendTwoInst;
	}

	public String getRecipOneInst() {
		return recipOneInst;
	}

	public void setRecipOneInst(String recipOneInst) {
		this.recipOneInst = recipOneInst;
	}

	public String getRecipTwoInst() {
		return recipTwoInst;
	}

	public void setRecipTwoInst(String recipTwoInst) {
		this.recipTwoInst = recipTwoInst;
	}

	public Date getTransTime() {
		return transTime;
	}

	public void setTransTime(Date transTime) {
		this.transTime = transTime;
	}

	public String getTrackNo() {
		return trackNo;
	}

	public void setTrackNo(String trackNo) {
		this.trackNo = trackNo;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getFcpDemo() {
		return fcpDemo;
	}

	public void setFcpDemo(String fcpDemo) {
		this.fcpDemo = fcpDemo;
	}

	public String getReservedUse() {
		return reservedUse;
	}

	public void setReservedUse(String reservedUse) {
		this.reservedUse = reservedUse;
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
		return "BankPayFee [accessInst=" + accessInst + ", busiType=" + busiType + ", busiCode=" + busiCode + ", busiName=" + busiName + ", checkPeriod="
				+ checkPeriod + ", organization=" + organization + ", fundSettleAccCode=" + fundSettleAccCode + ", fundSettleAccName=" + fundSettleAccName
				+ ", bankClearDate=" + bankClearDate + ", bankSettleDate=" + bankSettleDate + ", payChannelCode=" + payChannelCode + ", fileName=" + fileName
				+ ", transCode=" + transCode + ", transAmt=" + transAmt + ", reasonCode=" + reasonCode + ", sendOneInst=" + sendOneInst + ", sendTwoInst="
				+ sendTwoInst + ", recipOneInst=" + recipOneInst + ", recipTwoInst=" + recipTwoInst + ", transTime=" + transTime + ", trackNo=" + trackNo + ", pan="
				+ pan + ", fcpDemo=" + fcpDemo + ", reservedUse=" + reservedUse + ", dealStatus=" + dealStatus + ", isReview=" + isReview + ", isTally=" + isTally
				+ ", def1=" + def1 + ", def2=" + def2 + ", def3=" + def3 + ", ndef1=" + ndef1 + ", ndef2=" + ndef2 + ", ndef3=" + ndef3 + "]";
	}

}
