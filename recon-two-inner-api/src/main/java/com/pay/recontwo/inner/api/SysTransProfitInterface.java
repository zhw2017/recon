package com.pay.recontwo.inner.api;

import com.pay.recontwo.model.BusiAssSet;
import com.pay.recontwo.model.SysTransProfit;

/**
 * @Description: 这里用一句话描述这个类的作用
 * @see: SysTransProfitInterface 此处填写需要参考的类
 * @version 2016年10月15日 下午15:49:48
 * @author guangzhi.ji
 */
public interface SysTransProfitInterface extends BaseInterface<SysTransProfit> {

	public void calSysTransProfit(BusiAssSet busiAssSet, String execDate);

}
