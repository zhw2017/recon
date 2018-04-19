package com.pay.recontwo.inner.api;

import com.pay.recontwo.bean.WebResult;
import com.pay.recontwo.model.BankBusiClear;

/**
 * @Description: 这里用一句话描述这个类的作用
 * @see: BankBusiClearInterface 此处填写需要参考的类
 * @version 2016年10月15日 下午15:49:48
 * @author guangzhi.ji
 */
public interface BankBusiClearInterface extends BaseInterface<BankBusiClear> {

	/**
	 * @Description 按结算日期重载数据-前台
	 * @param bankSettleDate
	 * @param fundSettleAccCode
	 * @see 需要参考的类或方法
	 */
	public void loadBankBusiClearBySettleDate(String bankSettleDate, String fundSettleAccCode);

	/**
	 * @Description 按结算日期账务复核数据
	 * @param bankSettleDate
	 * @param fundSettleAccCode
	 * @return
	 * @see 需要参考的类或方法
	 */
	public WebResult reviewBankBusiClear(String bankSettleDate, String fundSettleAccCode);

	/**
	 * @Description 按结算日期账务取消复核数据
	 * @param bankSettleDate
	 * @param fundSettleAccCode
	 * @return
	 * @see 需要参考的类或方法
	 */
	public WebResult cancelReviewBankBusiClear(String bankSettleDate, String fundSettleAccCode);

	/**
	 * @Description 按结算日期账务记账数据
	 * @param bankSettleDate
	 * @param fundSettleAccCode
	 * @return
	 * @see 需要参考的类或方法
	 */
	public WebResult tallyBankBusiClear(String bankSettleDate, String fundSettleAccCode);

	/**
	 * @Description 按结算日期账务取消记账数据
	 * @param bankSettleDate
	 * @param fundSettleAccCode
	 * @return
	 * @see 需要参考的类或方法
	 */
	public WebResult cancelTallyBankBusiClear(String bankSettleDate, String fundSettleAccCode);

}
