package com.pay.recontwo.inner.api;

import java.util.List;

import com.pay.recontwo.bean.WebResult;
import com.pay.recontwo.model.BusiTransCharge;

/**
 * @Description: 交易差错处理服务
 * @see: BusiTransChargeInterface 此处填写需要参考的类
 * @version 2016年10月15日 下午15:49:48
 * @author guangzhi.ji
 */
public interface BusiTransChargeInterface extends BaseInterface<BusiTransCharge> {
	/**
	 * @Description 复核单边数据
	 * @param listBean
	 * @param wantReviewResult
	 * @return
	 * @see 需要参考的类或方法
	 */
	public List<WebResult> reviewBusiTransCharge(List<BusiTransCharge> listBean, String wantReviewResult);

	/**
	 * @Description 单边数据记账
	 * @param listBean
	 * @param wantTallyResult
	 * @return
	 * @see 需要参考的类或方法
	 */
	public List<WebResult> tallyBusiTransCharge(List<BusiTransCharge> listBean, String wantTallyResult);

	/**
	 * @Description 发送单边数据记账
	 * @param listBean
	 * @return
	 * @see 需要参考的类或方法
	 */
	public List<WebResult> sendChargebackSide(List<BusiTransCharge> listBean);
}
