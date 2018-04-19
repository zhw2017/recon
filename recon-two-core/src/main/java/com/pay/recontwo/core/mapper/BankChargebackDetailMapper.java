package com.pay.recontwo.core.mapper;

import java.util.List;
import java.util.Map;

import com.pay.recontwo.model.BankChargebackDetail;

/**
 * @Description: 这里用一句话描述这个类的作用
 * @see: BankChargebackDetail 此处填写需要参考的类
 * @version 2016年10月15日 下午15:49:48
 * @author guangzhi.ji
 */
public interface BankChargebackDetailMapper extends BaseMapper<BankChargebackDetail> {
	public List<BankChargebackDetail> findExceptRewardByMap(Map<String, Object> map);

}
