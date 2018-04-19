package com.pay.recontwo.inner.api;

import java.util.List;

import com.pay.recontwo.bean.WebResult;
import com.pay.recontwo.model.BusiCheckResult;

/**
 * @Description: 对账结果服务
 * @see: BusiCheckResultInterface 此处填写需要参考的类
 * @version 2016年10月15日 下午15:49:48
 * @author guangzhi.ji
 */
public interface BusiCheckResultInterface extends BaseInterface<BusiCheckResult> {
	/**
	 * @Description 复核对账结果
	 * @param listBusiCheckResult
	 * @param wantReviewResult
	 * @return
	 * @see 需要参考的类或方法
	 */
	List<WebResult> reviewBusiCheckResult(List<BusiCheckResult> listBusiCheckResult, String wantReviewResult);

	/**
	 * @Description 记账对账结果
	 * @param listBusiCheckResult
	 * @param wantTallyResult
	 * @return
	 * @see 需要参考的类或方法
	 */
	List<WebResult> tallyBusiCheckResult(List<BusiCheckResult> listBusiCheckResult, String wantTallyResult);

}
