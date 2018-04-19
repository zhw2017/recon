package com.pay.recontwo.model;

public class BankALFeeBean extends BaseMapperVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 688892140824390935L;
	/** 核对流水号 */
	private String checkId;
	/** 银行跟踪号 */
	private String bankTrackNo;
	/** 银行参考号 */
	private String bankExternalId;
	/** 银行商户号 */
	private String bankCustomerNo;
	/** 银行终端号 */
	private String bankTerminalNo;
	/** 报文类型 */
	private String messageType;
	/** 交易类型码 */
	private String transTypeCode;
	/** 受理方手续费 */
	private double carReceiveFee;
	/** 品牌服务费 */
	private double brandFee;
	/** 其它费用 */
	private double otherFee;
	/** 自定义项1 */
	private String def1;
	/** 自定义项2 */
	private String def2;
	/** 自定义项3 */
	private String def3;
	/** 自定义项4 */
	private String def4;
	/** 自定义项5 */
	private String def5;

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

	public String getBankCustomerNo() {
		return bankCustomerNo;
	}

	public void setBankCustomerNo(String bankCustomerNo) {
		this.bankCustomerNo = bankCustomerNo;
	}

	public String getBankTerminalNo() {
		return bankTerminalNo;
	}

	public void setBankTerminalNo(String bankTerminalNo) {
		this.bankTerminalNo = bankTerminalNo;
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

	public String getDef4() {
		return def4;
	}

	public void setDef4(String def4) {
		this.def4 = def4;
	}

	public String getDef5() {
		return def5;
	}

	public void setDef5(String def5) {
		this.def5 = def5;
	}

	public String getCheckId() {
		return checkId;
	}

	public void setCheckId(String checkId) {
		this.checkId = checkId;
	}

	public String getBankTrackNo() {
		return bankTrackNo;
	}

	public void setBankTrackNo(String bankTrackNo) {
		this.bankTrackNo = bankTrackNo;
	}

	public String getBankExternalId() {
		return bankExternalId;
	}

	public void setBankExternalId(String bankExternalId) {
		this.bankExternalId = bankExternalId;
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

}
