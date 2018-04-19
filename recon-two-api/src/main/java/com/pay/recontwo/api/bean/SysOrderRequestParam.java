package com.pay.recontwo.api.bean;

//import org.hibernate.validator.constraints.NotBlank;

/**
 * @Description: 系统订单查询请求传参
 * @see: SysOrderRequestParam 此处填写需要参考的类
 * @version 2017年3月27日 下午5:21:23
 * @author guangzhi.ji
 */
public class SysOrderRequestParam implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6586834296104344522L;
	/** 银行清算日期 格式：YYYY-MM-DD */
//	@NotBlank
	private String bankClearDate;
	/** 12位银行参考号 */
//	@NotBlank
	private String bankExternalId;

	public String getBankClearDate() {
		return bankClearDate;
	}

	public void setBankClearDate(String bankClearDate) {
		this.bankClearDate = bankClearDate;
	}

	public String getBankExternalId() {
		return bankExternalId;
	}

	public void setBankExternalId(String bankExternalId) {
		this.bankExternalId = bankExternalId;
	}

}
