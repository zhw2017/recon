package com.pay.recontwo.core.service;

import java.util.List;
import java.util.Map;

import com.pay.recontwo.bean.WebResult;
import com.pay.recontwo.core.mapper.BusiAssSetMapper;
import com.pay.recontwo.enums.ExecModeEnum;
import com.pay.recontwo.enums.ExecStatusEnum;
import com.pay.recontwo.enums.TimeFreEnum;
import com.pay.recontwo.model.BusiAssSet;

/**
 * @Description: 这里用一句话描述这个类的作用
 * @see: BusiAssSetService 此处填写需要参考的类
 * @version 2016年10月15日 下午15:49:48
 * @author guangzhi.ji
 */
public interface BusiAssSetService extends BusiAssSetMapper {
	public void parseBusiFile(String execDate, BusiAssSet busiAssSet, ExecModeEnum execModeEnum, String fileSourceDivi, TimeFreEnum timeFreEnum, String operator);

	public BusiAssSet findByBusiCode(String busiCode);

	public void busiCheck(String busiCode, String checkPeriod, ExecModeEnum execMode, TimeFreEnum timeFreEnum, String operator);

	public void clearCheckResult(String busiCode, String checkPeriod);

	public void findAndUpdatesetExecStatusById(String id, int execNum, ExecStatusEnum execStatusEnum);

	public WebResult transSideToCross(String busiCode, String checkPeriod);

	public List<BusiAssSet> findByInstNo(String instNo);

	public BusiAssSet findByPayChannelCodeAndBusiType(String payChannelCode, String dataDivi);

	public List<BusiAssSet> findReceiptInstByAcc(String fundSettleAccCode);

	public List<BusiAssSet> findAgentBusiAssSets(Map<String, Object> map);

}
