package com.pay.recontwo.inner.api;

import java.util.List;

import com.pay.recontwo.bean.WebResult;
import com.pay.recontwo.model.BusiCheckResultManual;

/**
 * @Description: 这里用一句话描述这个类的作用
 * @see: BusiCheckResultManualInterface 此处填写需要参考的类
 * @version 2016年10月15日 下午15:49:48
 * @author guangzhi.ji
 */
public interface BusiCheckResultManualInterface extends BaseInterface<BusiCheckResultManual> {

	public int insertTender(List<BusiCheckResultManual> listBusiCheckResultManual);

	public List<WebResult> reviewBankBusiClearMin(List<BusiCheckResultManual> listBean, String wantReviewResult);

	public List<WebResult> tallyBankBusiClearMin(List<BusiCheckResultManual> listBean, String wantTallyResult);

	public int insertOrUpdate(List<BusiCheckResultManual> listBankBusiClearMin, boolean isForce);
}
