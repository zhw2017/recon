package com.pay.recontwo.core.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.pay.recontwo.model.BankPayFee;

/**
 * @Description: 这里用一句话描述这个类的作用
 * @see: BankPayFee 此处填写需要参考的类
 * @version 2016年10月15日 下午15:49:48
 * @author guangzhi.ji
 */
public interface BankPayFeeMapper extends BaseMapper<BankPayFee> {
	/**
	 * @Description 删除历史数据
	 * @param map
	 * @see 需要参考的类或方法
	 */
	public void delHistoryData(Map<String, Object> map);

	public BankPayFee findRecoveryTotal(@Param("checkPeriod") String checkPeriod, @Param("accessInst") String accessInst);

	public BankPayFee findOtherTotal(@Param("checkPeriod") String checkPeriod, @Param("accessInst") String accessInst);
}
