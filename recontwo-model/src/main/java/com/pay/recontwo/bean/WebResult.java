package com.pay.recontwo.bean;

import java.io.Serializable;

//import org.codehaus.jackson.annotate.JsonIgnoreProperties;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class WebResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5137160991630329062L;
	/** 结果 */
	private String result = "SUCCESS";
	/** 错误码 */
	private String errorCode;
	/** 错误信息 */
	private String errorMsg;
	/** 单据号 */
	private String billCode;
	/** 显示信息 */
	private String showMsg;

	public WebResult() {}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getBillCode() {
		return billCode;
	}

	public void setBillCode(String billCode) {
		this.billCode = billCode;
	}

	public String getShowMsg() {
		return showMsg;
	}

	public void setShowMsg(String showMsg) {
		this.showMsg = showMsg;
	}

}
