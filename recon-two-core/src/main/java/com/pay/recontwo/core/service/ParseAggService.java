package com.pay.recontwo.core.service;

import com.pay.recontwo.enums.ExecModeEnum;
import com.pay.recontwo.enums.TimeFreEnum;
import com.pay.recontwo.model.BusiAssSet;

/**
 * @Description: 这里用一句话描述这个类的作用
 * @see: ParseAggService 此处填写需要参考的类
 * @version 2016年11月1日 下午5:19:08
 * @author guangzhi.ji
 */
public interface ParseAggService {
	public void parseBusiFile(String execDate, BusiAssSet busiAssSet, ExecModeEnum execModeEnum, String fileSourceDivi, TimeFreEnum timeFreEnum, String operator);
}
