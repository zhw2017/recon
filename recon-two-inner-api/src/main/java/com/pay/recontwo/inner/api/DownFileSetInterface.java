package com.pay.recontwo.inner.api;

import java.util.Map;

import com.pay.recontwo.enums.ExecModeEnum;
import com.pay.recontwo.enums.TimeFreEnum;
import com.pay.recontwo.model.DownFileSet;

/**
 * @Description: 文件下载服务
 * @see: DownFileSetInterface 此处填写需要参考的类
 * @version 2016年10月15日 下午15:49:48
 * @author guangzhi.ji
 */
public interface DownFileSetInterface extends BaseInterface<DownFileSet> {
	/**
	 * @Description 按文件配置下载文件
	 * @param execDate
	 * @param downFileSet
	 * @param execModeEnum
	 * @param timeFreEnum
	 * @param operator
	 * @see 需要参考的类或方法
	 */
	public void downFileToLocal(String execDate, DownFileSet downFileSet, ExecModeEnum execModeEnum, TimeFreEnum timeFreEnum, String operator);

	public Map<String, Object> getCode();
}
