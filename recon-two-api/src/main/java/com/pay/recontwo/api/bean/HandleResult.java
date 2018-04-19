/**
 *
 */
package com.pay.recontwo.api.bean;

import java.io.Serializable;
import java.util.List;

//import org.hibernate.validator.constraints.NotEmpty;

import com.pay.recontwo.api.enums.ResultCodeEnum;

/**
 * @Description: 银行订单返回结果
 * @see: HandleResult 此处填写需要参考的类
 * @version 2016年12月10日 下午2:31:21
 * @author guangzhi.ji
 */
public class HandleResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6184127536982067463L;
//	@NotEmpty
	private ResultCodeEnum handleResultCode;
	/** 处理结果信息 */
	private String handleResultMsg;
	/** 数据明细处理结果信息 */
	private List<BankOrderBean> listBankOrderBean;

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

	public List<BankOrderBean> getListBankOrderBean() {
		return listBankOrderBean;
	}

	public void setListBankOrderBean(List<BankOrderBean> listBankOrderBean) {
		this.listBankOrderBean = listBankOrderBean;
	}

	@Override
	public String toString() {
		return "HandleResult [handleResultCode=" + handleResultCode + ", handleResultMsg=" + handleResultMsg + ", listBankOrderBean=" + listBankOrderBean + "]";
	}

}
