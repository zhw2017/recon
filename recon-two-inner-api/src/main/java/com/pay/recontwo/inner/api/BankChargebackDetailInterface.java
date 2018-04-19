package com.pay.recontwo.inner.api;

import java.util.List;

import com.pay.recontwo.bean.WebResult;
import com.pay.recontwo.model.BankChargebackDetail;

/**
 * @Description: 这里用一句话描述这个类的作用
 * @see: BankChargebackDetailInterface 此处填写需要参考的类
 * @version 2016年10月15日 下午15:49:48
 * @author guangzhi.ji
 */
public interface BankChargebackDetailInterface extends BaseInterface<BankChargebackDetail> {

	public List<WebResult> reviewBankChargebackDetail(List<BankChargebackDetail> listBean, String wantReviewResult);

	public List<WebResult> tallyBankChargebackDetail(List<BankChargebackDetail> listBean, String wantTallyResult);

}
