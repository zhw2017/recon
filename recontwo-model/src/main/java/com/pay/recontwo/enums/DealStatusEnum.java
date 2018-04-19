package com.pay.recontwo.enums;


import java.io.Serializable;

public enum DealStatusEnum implements Serializable {

	/**
	 * 未处理
	 */
	UNTREATED,
	/**
	 * 已复核
	 */
	CONFIRMED,
	/**
	 * 处理中
	 */
	DOING,
	/**
	 * 已处理
	 */
	PROCESSED,
	/**
	 * 已推送
	 */
	PUSHING,
	/**
	 * 单边跨日
	 */
	SIDE_CROSS,
	/**
	 * 单边确认
	 */
	SIDE_COMFIRM
}

