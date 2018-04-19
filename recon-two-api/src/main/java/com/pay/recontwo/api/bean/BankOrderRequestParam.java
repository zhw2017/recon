package com.pay.recontwo.api.bean;

//import org.hibernate.validator.constraints.NotBlank;

/**
 * @Description: 银行订单查询请求传参
 * @see: BankOrderRequestParam 此处填写需要参考的类
 * @version 2016年12月12日 下午12:02:06
 * @author guangzhi.ji
 */
public class BankOrderRequestParam implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 897754526216140888L;
	/** 银行清算日期 格式：YYYY-MM-DD */
//	@NotBlank
	private String bankClearDate;
	/** 通道编号 例如:POS_UNIONPAY_100008 */
//	@NotBlank
	private String payChannelCode;
	/** 12位银行参考号 */
//	@NotBlank
	private String bankExternalId;
	/** 银行跟踪号 */
//	@NotBlank
	private String bankTrackNo;
	/** 交易类型码 */
//	@NotBlank
	private String transTypeCode;

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

	public String getBankExternalId() {
		return bankExternalId;
	}

	public void setBankExternalId(String bankExternalId) {
		this.bankExternalId = bankExternalId;
	}

	public String getBankTrackNo() {
		return bankTrackNo;
	}

	public void setBankTrackNo(String bankTrackNo) {
		this.bankTrackNo = bankTrackNo;
	}

	public String getTransTypeCode() {
		return transTypeCode;
	}

	public void setTransTypeCode(String transTypeCode) {
		this.transTypeCode = transTypeCode;
	}

	@Override
	public String toString() {
		return "BankOrderRequestParam [bankClearDate=" + bankClearDate + ", payChannelCode=" + payChannelCode + ", bankExternalId=" + bankExternalId
				+ ", bankTrackNo=" + bankTrackNo + ", transTypeCode=" + transTypeCode + "]";
	}

}
