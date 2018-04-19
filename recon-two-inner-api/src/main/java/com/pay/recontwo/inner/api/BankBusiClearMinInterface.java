package com.pay.recontwo.inner.api;

import java.util.List;

import com.pay.recontwo.bean.WebResult;
import com.pay.recontwo.model.BankBusiClearMin;

/**
 * @Description: 这里用一句话描述这个类的作用
 * @see: BankBusiClearMinInterface 此处填写需要参考的类
 * @version 2016年10月15日 下午15:49:48
 * @author guangzhi.ji
 */
public interface BankBusiClearMinInterface extends BaseInterface<BankBusiClearMin> {

	public int insertTender(List<BankBusiClearMin> listBankBusiClearMin);

	public List<WebResult> reviewBankBusiClearMin(List<BankBusiClearMin> listBean, String wantReviewResult);

	public List<WebResult> tallyBankBusiClearMin(List<BankBusiClearMin> listBean, String wantTallyResult);
}
