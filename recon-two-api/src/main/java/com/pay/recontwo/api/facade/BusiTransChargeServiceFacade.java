package com.pay.recontwo.api.facade;

import com.pay.recontwo.api.bean.BusiTransChargeRequestParam;
import com.pay.recontwo.api.bean.RequestResult;

/**
 * @Description: 银行订单查询接口
 * @see: BankOrderServiceFacade 此处填写需要参考的类
 * @version 2016年12月1日 下午3:53:16
 * @author guangzhi.ji
 */
public interface BusiTransChargeServiceFacade {
	/**
	 * @Description 标记单边状态
	 * @param bankOrderRequestParam
	 * @return
	 * @see 需要参考的类或方法
	 */
	RequestResult signSideStatus(BusiTransChargeRequestParam busiTransChargeRequestParam);
}
