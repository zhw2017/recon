package com.pay.recontwo.core.utils;

public class ErrorCodeUtis {
	/** 文件不存在 */
	public final static String DOWN_FILE_NOEXISTS = "DF001";
	/** 文件目录不存在 */
	public final static String DOWN_DIR_NOEXISTS = "DF002";
	/** 下载文件过程出错 */
	public final static String DOWN_FILE_PROC_ERROR = "DF003";
	/** FTP配置为空 */
	public final static String DOWN_FILE_FTP_NULL = "DF004";
	/** 上次执行未完成请等待 */
	public final static String DOWN_FILE_PROCESSING = "DF005";
	/** 并发操作请重试 */
	public final static String DOWN_FILE_RETRY = "DF006";
	/** 成功不能重复执行 */
	public final static String DOWN_FILE_REPEAT = "DF007";
	/** 下载文件未知出错 */
	public final static String DOWN_FILE_UNKNOWN_ERROR = "DF999";

	/** 定时解析成功不能重复执行 */
	public final static String PARSE_FILE_REPEAT = "PF000";
	/** 解析时本地文件不存在 */
	public final static String PARSE_FILE_NO_EXISTS = "PF001";
	/** 解析时文件数据为空 */
	public final static String PARSE_FILE_DATA_EMPTY = "PF002";
	/** 解析时文件时出错 */
	public final static String PARSE_FILE_PRO_ERROR = "PF003";
	/** 解析后插入数据出错 */
	public final static String PARSE_FILE_INSERT_DB_ERROR = "PF004";
	/** 没有配置文件 */
	public final static String PARSE_FILE_NO_SET = "PF005";
	/** 文件未下载成功 */
	public final static String PARSE_FILE_NO_DOWN = "PF006";
	/** 上次执行未完成请等待 */
	public final static String PARSE_FILE_PROCESSING = "PF007";
	/** 解析文件未知出错 */
	public final static String PARSE_FILE_UNKNOWN_ERROR = "PF999";

	/** 上次执行未完成请等待 */
	public final static String BUSI_CHECK_PROCESSING = "BC001";
	/** 并发操作请重试 */
	public final static String BUSI_CHECK_RETRY = "BC002";
	/** 系统文件未解析完成 */
	public final static String BUSI_CHECK_SYSFILE_NO_PARSE = "BC003";
	/** 银行文件未解析完成 */
	public final static String BUSI_CHECK_BANKFILE_NO_PARSE = "BC004";
	/** 未配置系统文件 */
	public final static String BUSI_CHECK_NO_SET_SYSFILE = "BC005";
	/** 未配置银行文件 */
	public final static String BUSI_CHECK_NO_SET_BANKFILE = "BC006";
	/** 单边已经处理 */
	public final static String BUSI_CHECK_SIDE_HANDLE = "BC007";
	/** 对账结果已经存在 */
	public final static String BUSI_CHECK_RESULT_EXIST = "BC008";
	/** 系统数据为空 */
	public final static String BUSI_CHECK_SYS_EMPTY = "BC009";
	/** 银行数据为空 */
	public final static String BUSI_CHECK_BANK_EMPTY = "BC010";
	/** 双方记录相差过大 */
	public final static String BUSI_CHECK_BIDIFF_EXCEED = "BC011";
	/** 系统单边过大 */
	public final static String BUSI_CHECK_SYS_SIDE_EXCEED = "BC012";
	/** 银行单边过大 */
	public final static String BUSI_CHECK_BANK_SIDE_EXCEED = "BC013";
	/** 解析文件未知出错 */
	public final static String BUSI_CHECK_UNKNOWN_ERROR = "BC014";

	/** 交易差错处理 更新事务回滚 **/
	public final static String BUSI_TRANS_CHARGE_TRANSACTION_ROLLBACK = "BTC001";
}
