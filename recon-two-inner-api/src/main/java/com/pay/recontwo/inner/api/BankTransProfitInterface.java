package com.pay.recontwo.inner.api;

import com.pay.recontwo.model.BankTransProfit;
import com.pay.recontwo.model.BusiAssSet;

/**
 * @Description: 这里用一句话描述这个类的作用
 * @see: BankTransProfitInterface 此处填写需要参考的类
 * @version 2016年10月15日 下午15:49:48
 * @author guangzhi.ji
 */
public interface BankTransProfitInterface extends BaseInterface<BankTransProfit> {
	public void calBankTransProfit(BusiAssSet busiAssSet, String execDate);

}
