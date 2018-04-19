package com.pay.recontwo.inner.api;

import java.util.List;
import java.util.Map;

import com.pay.recontwo.enums.ExecModeEnum;
import com.pay.recontwo.enums.TimeFreEnum;
import com.pay.recontwo.model.BusiAssSet;

/**
 * @Description: 业务辅助配置
 * @see: BusiAssSetInterface 此处填写需要参考的类
 * @version 2016年10月15日 下午15:49:48
 * @author guangzhi.ji
 */
public interface BusiAssSetInterface extends BaseInterface<BusiAssSet> {
	/**
	 * @Description 通道对账文件解析
	 * @param execDate
	 * @param busiAssSet
	 * @param execModeEnum
	 * @param fileSourceDivi
	 * @param timeFreEnum
	 * @param operator
	 * @see 需要参考的类或方法
	 */
	public void parseBusiFile(String execDate, BusiAssSet busiAssSet, ExecModeEnum execModeEnum, String fileSourceDivi, TimeFreEnum timeFreEnum, String operator);

	/**
	 * @Description 按业务编码查询业务辅助配置
	 * @param busiCode
	 * @return
	 * @see 需要参考的类或方法
	 */
	public BusiAssSet findByBusiCode(String busiCode);

	/**
	 * @Description 通道对账
	 * @param busiCode
	 * @param checkPeriod
	 * @param execMode
	 * @param timeFreEnum
	 * @param operator
	 * @see 需要参考的类或方法
	 */
	public void busiCheck(String busiCode, String checkPeriod, ExecModeEnum execMode, TimeFreEnum timeFreEnum, String operator);

	/**
	 * @Description 清除对账结果
	 * @param busiCode
	 * @param checkPeriod
	 * @see 需要参考的类或方法
	 */
	public void clearCheckResult(String busiCode, String checkPeriod);

	/**
	 * @Description 查询所有代理清算的配置
	 * @param map
	 * @return
	 * @see 需要参考的类或方法
	 */
	public List<BusiAssSet> findAgentBusiAssSets(Map<String, Object> map);
}
