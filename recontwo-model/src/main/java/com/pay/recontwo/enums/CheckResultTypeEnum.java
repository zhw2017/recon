package com.pay.recontwo.enums;

/**
 * Title: 对账结果类型
 * Description:
 * Copyright: Copyright (c)2014
 * Company: pay
 * @author chao.luo
 */
public enum CheckResultTypeEnum {
	/**
	 * 银行单边，银行端有记录，系统没有记录
	 */
	BANK_SIDE,
	/**
	 * 系统单边
	 */
	SYS_SIDE,
	/**
	 * 双边
	 */
	BILATERAL,
	/**
	 * 金额不等
	 */
	AMOUNT_DIFFER,

	/**
	 * 通道手续费不等
	 */
	FEE_DIFFER,

	/**
	 * 跨日交易
	 */
	CROSS_DATE,
	/**
	 * 系统跨日交易
	 */
	SYS_CROSS_DATE,
	/**
	 * 银行跨日交易
	 */
	BANK_CROSS_DATE,
	/**
	 * 商户手续费不等
	 */
	C_FEE_DIFFER
}
