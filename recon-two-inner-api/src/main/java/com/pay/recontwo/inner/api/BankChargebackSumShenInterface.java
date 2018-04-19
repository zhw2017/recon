package com.pay.recontwo.inner.api;

import java.util.List;

import com.pay.recontwo.bean.WebResult;
import com.pay.recontwo.model.BankChargebackSumShen;

/**
 * @Description: 对账
 * @see: BankChargebackSumShenInterface 此处填写需要参考的类
 * @version 2016年10月15日 下午15:49:48
 * @author guangzhi.ji
 */
public interface BankChargebackSumShenInterface extends BaseInterface<BankChargebackSumShen> {

	public int insertTender(List<BankChargebackSumShen> listBankChargebackSumShen);

	public List<WebResult> reviewBankChargebackSumShen(List<BankChargebackSumShen> listBean, String wantReviewResult);

	public List<WebResult> tallyBankChargebackSumShen(List<BankChargebackSumShen> listBean, String wantTallyResult);

	public int insertOrUpdate(List<BankChargebackSumShen> listBankBusiClearMin, boolean isForce);
}
