package com.pay.recontwo.core.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pay.recontwo.model.BusiTransCharge;

/**
 * @Description: 这里用一句话描述这个类的作用
 * @see: BusiTransCharge 此处填写需要参考的类
 * @version 2016年10月15日 下午15:49:48
 * @author guangzhi.ji
 */
public interface BusiTransChargeMapper extends BaseMapper<BusiTransCharge> {
	/**
	 * @Description 查找已经处理的所有差错记录
	 * @param busiCode
	 * @param checkPeriod
	 * @return
	 * @see 需要参考的类或方法
	 */
	List<BusiTransCharge> findHadDeal(@Param("busiCode") String busiCode, @Param("checkPeriod") String checkPeriod);

	/**
	 * @Description 查找某个期间内某个差错类型的记录
	 * @param busiCode
	 * @param startCheckPeriod
	 * @param endCheckPeriod
	 * @param chargebackType
	 * @return
	 * @see 需要参考的类或方法
	 */
	public BusiTransCharge findByChargeBackTypeAndDealStatusSum(@Param("busiCode") String busiCode, @Param("checkPeriod") String checkPeriod,
			@Param("chargebackType") String chargebackType, @Param("dealStatus") String dealStatus);

}
