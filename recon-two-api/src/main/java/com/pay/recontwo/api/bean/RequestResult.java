/**
 *
 */
package com.pay.recontwo.api.bean;

import java.io.Serializable;

//import org.hibernate.validator.constraints.NotEmpty;

import com.pay.recontwo.api.enums.ResultCodeEnum;

/**
 * @Description: 请求结果
 * @see: RequestResult 此处填写需要参考的类
 * @version 2017年10月10日 下午3:46:29
 * @author guangzhi.ji
 */
public class RequestResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2977220848233778596L;
//	@NotEmpty
	private ResultCodeEnum handleResultCode;
	/** 处理结果信息 */
	private String handleResultMsg;

	public ResultCodeEnum getHandleResultCode() {
		return handleResultCode;
	}

	public void setHandleResultCode(ResultCodeEnum handleResultCode) {
		this.handleResultCode = handleResultCode;
	}

	public String getHandleResultMsg() {
		return handleResultMsg;
	}

	public void setHandleResultMsg(String handleResultMsg) {
		this.handleResultMsg = handleResultMsg;
	}

}
