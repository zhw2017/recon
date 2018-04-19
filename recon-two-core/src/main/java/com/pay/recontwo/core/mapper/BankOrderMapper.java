package com.pay.recontwo.core.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.pay.recontwo.model.BankOrder;
import com.pay.recontwo.model.BankTransProfit;

/**
 * @Description: 这里用一句话描述这个类的作用
 * @see: BankOrder 此处填写需要参考的类
 * @version 2016年10月15日 下午15:49:48
 * @author guangzhi.ji
 */
public interface BankOrderMapper extends BaseMapper<BankOrder> {
	public int insertListSelfTable(@Param("tableName") String tableName, @Param("list") List<BankOrder> list);

	public List<BankOrder> findBySelfTableAndMap(Map<String, Object> map);

	public List<BankOrder> findCheckDataBySelfTableAndMap(Map<String, Object> map);

	public BankOrder findSumBySelfTableAndMap(Map<String, Object> map);

	public int delBySelfTableAndMap(Map<String, Object> map);

	public List<BankOrder> findReceiptBalByInst(@Param("tableName") String tableName, @Param("checkPeriod") String checkPeriod,
			@Param("fundSettleAccCode") String fundSettleAccCode, @Param("accessInst") String accessInst);

	public BankOrder findZUnionDPayFee(@Param("tableName") String tableName, @Param("checkPeriod") String checkPeriod);

	public BankOrder findCreditProfit(@Param("tableName") String tableName, @Param("checkPeriod") String checkPeriod);

	public int updateBankOrderSelfTable(@Param("tableName") String tableName, @Param("item") BankOrder bankOrder);

	public List<BankTransProfit> findBankTransProfit(@Param("tableName") String tableName, @Param("checkPeriod") String checkPeriod,
			@Param("busiCode") String busiCode, @Param("busiType") String busiType, @Param("instNo") String instNo);
}
