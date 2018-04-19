package com.pay.recontwo.api.facade;

import com.pay.recontwo.api.bean.BankOrderRequestParam;
import com.pay.recontwo.api.bean.HandleResult;

/**
 * @Description: 银行订单查询接口
 * @see: BankOrderServiceFacade 此处填写需要参考的类
 * @version 2016年12月1日 下午3:53:16
 * @author guangzhi.ji
 */
public interface BankOrderServiceFacade {
	/**
	 * @Description 一句话描述方法用法
	 * @param bankOrderRequestParam
	 * @return
	 * @see 需要参考的类或方法
	 */
	HandleResult findByClearDateBankExternalId(BankOrderRequestParam bankOrderRequestParam);
}
