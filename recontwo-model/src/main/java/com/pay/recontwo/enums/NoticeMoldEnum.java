/**
 *
 */
package com.pay.recontwo.enums;

/**
 * @Description: 消息中心通知模型
 * @see: NoticeMoldEnum 此处填写需要参考的类
 * @version 2017年5月4日 下午3:43:38
 * @author chao.luo
 */
public enum NoticeMoldEnum {
	/** 微信通知 **/
	WECHAT_NOTICE("WEIXIN", "wechatNotice"),
	/** 短信通知 **/
	SMS_NOTICE("SMS", "smsNotice"),
	/** 邮件通知 **/
	EMAIL_NOTICE("EMAIL", "emailNotice"),
	/** 报警通知 **/
	WARNAPP_NOTICE("WARNAPP", "warnAppNotice");

	private String keyName;
	private String beanName;

	private NoticeMoldEnum(String keyName, String beanName) {
		this.keyName = keyName;
		this.beanName = beanName;
	}

	/**
	 * @return the keyName
	 */
	public String getKeyName() {
		return keyName;
	}

	/**
	 * @param keyName the keyName to set
	 */
	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	/**
	 * @return the beanName
	 */
	public String getBeanName() {
		return beanName;
	}

	/**
	 * @param beanName the beanName to set
	 */
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

}
