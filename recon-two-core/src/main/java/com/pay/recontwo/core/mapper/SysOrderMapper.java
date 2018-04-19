package com.pay.recontwo.core.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.pay.recontwo.model.SysBankClearDiff;
import com.pay.recontwo.model.SysOrder;
import com.pay.recontwo.model.SysTransProfit;

/**
 * @Description: 这里用一句话描述这个类的作用
 * @see: SysOrder 此处填写需要参考的类
 * @version 2016年10月15日 下午15:49:48
 * @author guangzhi.ji
 */
public interface SysOrderMapper extends BaseMapper<SysOrder> {
	public int insertListSelfTable(@Param("tableName") String tableName, @Param("list") List<SysOrder> list);

	public List<SysOrder> findBySelfTableAndMap(Map<String, Object> map);

	public List<SysOrder> findCheckDataBySelfTableAndMap(Map<String, Object> map);

	public int delBySelfTableAndMap(Map<String, Object> map);

	public List<SysTransProfit> findSysTransProfit(@Param("tableName") String tableName, @Param("checkPeriod") String checkPeriod,
			@Param("busiCode") String busiCode, @Param("busiType") String busiType, @Param("instNo") String instNo);

	public List<SysBankClearDiff> findSysBankClearDiff(Map<String, Object> map);
}
