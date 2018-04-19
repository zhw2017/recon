package com.pay.recontwo.inner.api;

import com.pay.recontwo.model.SysBankClearDiff;

/**
 * @Description: 这里用一句话描述这个类的作用
 * @see: SysBankClearDiffInterface 此处填写需要参考的类
 * @version 2016年10月15日 下午15:49:48
 * @author guangzhi.ji
 */
public interface SysBankClearDiffInterface extends BaseInterface<SysBankClearDiff> {

	public void exeSysBankClearDiff(String execDate);
}
