package com.pay.recontwo.api.bean;

//import org.hibernate.validator.constraints.NotBlank;

import com.pay.recontwo.api.enums.CheckResultTypeEnum;

/**
 * @Description: 单边记录请求传参
 * @see: BusiTransChargeRequestParam 此处填写需要参考的类
 * @version 2017年10月12日 下午12:02:06
 * @author guangzhi.ji
 */
public class BusiTransChargeRequestParam implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3776153942728782590L;
	/** 清算日期 格式：YYYY-MM-DD */
//	@NotBlank
	private String clearDate;
	/** 通道编号 例如:POS_UNIONPAY_100008 */
//	@NotBlank
	private String payChannelCode;
	/** 银行参考号 银行存储一致流水号 */
//	@NotBlank
	private String bankExternalId;
	/** 单边类型 */
//	@NotBlank
	private CheckResultTypeEnum checkResultTypeEnum;

	public String getClearDate() {
		return clearDate;
	}

	public void setClearDate(String clearDate) {
		this.clearDate = clearDate;
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

	public CheckResultTypeEnum getCheckResultTypeEnum() {
		return checkResultTypeEnum;
	}

	public void setCheckResultTypeEnum(CheckResultTypeEnum checkResultTypeEnum) {
		this.checkResultTypeEnum = checkResultTypeEnum;
	}

}
