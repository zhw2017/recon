/**
 *
 */
package com.pay.recontwo.enums;

/**
 * Title: 银行收款记录
 * Description 交易类型
 * Copyright: Copyright (c)2015
 * Company: pay
 * @author chao.luo
 */
public enum TransTypeEnum {
	// /** 交易成功 **/
	// TRANS_SUCC,
	// /** 交易撤销 **/
	// TRANS_REVOKE,
	// /** 交易冲正 **/
	// TRANS_FLUSH,
	// /** 撤销冲正 **/
	// REVOKE_FLUSH,
	// /** 退款 **/
	// TRANS_REFUND
	BALANCE_INQUIRY, // 余额查询
	AVAILABLE_FUNDSINQUIRY, // 可用余额查询
	PURCHASE, // 消费
	PURCHASE_VOID, // 消费撤销
	PURCHASE_REVERSAL, // 消费冲正
	PURCHASE_VOID_REVERSAL, // 消费撤销冲正
	PURCHASE_REFUND, // 消费退货
	SPECIFY_QUANCUN, // 指定圈存
	SPECIFY_QUANCUN_REVERSAL, // 指定圈存冲正
	NOT_SPECIFY_QUANCUN, // 非指定圈存
	NOT_SPECIFY_QUANCUN_REVERSAL, // 非指定圈存冲正
	CASH_RECHARGE_QUNCUN, // 現金充值
	CASH_RECHARGE_QUNCUN_REVERSAL, // 現金充值沖正
	OFFLINE_PURCHASE, // 脱机消费
	PURCHASE_SCRIPT_NOTICE, // 消费脚本通知
	SPECIFY_QUANCUN_NOTICE, // 指定脚本通知
	NOT_SPECIFY_QUANCUN_NOTICE, // 非指定脚本通知
	BALANCE_INQUIRY_NOTICE, // 查询脚本通知
	PREAUTH_SCRIPT_NOTICE, // 预授权脚本通知
	CASH_RECHARGE_QUNCUN_NOTICE, // 現金充值腳本通知

	// 管理类

	SIGN_IN, // 签到
	SIGN_OFF, // 签退
	SETTLE, // 结算
	BATCH_UP, // 批上送
	DOWNLOAD_MAIN_KEY, // 下载主密钥
	DOWNLOAD_IC_REQUEST, // 下载IC公钥请求
	DOWNLOAD_IC_TRANSFER, // 下载IC公钥传递
	DOWNLOAD_IC_END, // 下载IC公钥结束
	// 冲正查询
	PURCHASE_REVERSAL_QUERY, // 消费冲正查询
	PRE_AUTH_REVERSAL_QUERY, // 预授权冲正查询
	PRE_AUTH_COMP_REVERSAL_QUERTY, // 预授权完成冲正查询
	PURCHASE_VOID_REVERSAL_QUERY, // 消费撤销冲正查询
	PRE_AUTH_VOID_REVERSAL_QUERY, // 预授权撤销冲正查询
	PRE_AUTH_COMP_VOID_REVERSAL_QUERTY, // 预授权完成撤销冲正查询
	PURCHASE_ORDER_QUERY, // 掌易通消费查询

	// 预授权类

	PRE_AUTH, // 预授权
	PRE_AUTH_VOID, // 预授权撤销
	PRE_AUTH_REVERSAL, // 预授权冲正
	PRE_AUTH_VOID_REVERSAL, // 预授权 撤销冲正
	PRE_AUTH_COMP, // 预授权完成
	PRE_AUTH_COMP_VOID, // 预授权完成撤销
	PRE_AUTH_COMP_REVERSAL, // 预授权完成冲正
	PRE_AUTH_COMP_VOID_REVERSAL, // 预授权完成撤销冲正

	// 快捷支付
	// QUERY_ORDER, //订单查询
	QUICK_TRADE, // 下订单
	QUICK_PAY, // 支付订单
	VERIFY_CODE_SEND, // 重发验证码

	SM_GET_TDCODE, // 扫码支付获取二维码信息(用SM_PURCHAS替换，不在使用)
	SM_PURCHASE, // 扫码支付
	SM_QUERY_STATUS, // 扫码支付查询订单状态
	QB_QUERY, // 银联钱包查询
	QB_PURCHASE, // 银联钱包消费
	QB_PURCHASE_VOID, // 银联钱包消费撤销
	QB_PURCHASE_REVERSAL, // 银联钱包消费冲正

	// add by jigz
	REALTIME_DPAY, // 实时代付 目前用于总银联代付交易
	DPAY, // 代付
	T0_DPAY, // T0代付
	DPAY_REFUND, // 代付退款
	ADVANCE, // 垫付
	ADVANCE_REFUND, // 垫付退款
	OFFLINE_PRE_AUTH_COMP// 手工预授权完成
}
