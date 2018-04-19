package com.pay.recontwo.core.parse.file;

import com.pay.recontwo.bean.ReturnResult;
import com.pay.recontwo.enums.TimeFreEnum;
import com.pay.recontwo.model.BaseMapperVO;
import com.pay.recontwo.model.BusiAssSet;
import com.pay.recontwo.model.FileParseLog;
import com.pay.recontwo.model.FileParseSet;
import com.pay.recontwo.model.FileTempletSet;

/**
 * @Description: 这里用一句话描述这个类的作用
 * @see: BankUnionTrans 此处填写需要参考的类
 * @version 2016年10月21日 下午7:49:36
 * @author guangzhi.ji
 */
public interface BaseFileTrans<T extends BaseMapperVO, V extends BaseMapperVO> {
	/**
	 * @Description 一句话描述方法用法
	 * @param returnResult
	 * @param busiAssSet
	 * @param fileParseSet
	 * @param fileOptLog
	 * @param timeFreEnum
	 * @return
	 * @see 需要参考的类或方法
	 */
	public ReturnResult<V> parseFileToBean(ReturnResult<V> returnResult, BusiAssSet busiAssSet, FileParseSet fileParseSet, FileTempletSet fileTempletSet,
			FileParseLog fileParseLog, TimeFreEnum timeFreEnum);

	/**
	 * @Description 是否存在表头
	 * @return
	 * @see 需要参考的类或方法
	 */
	public abstract boolean isExistTitle();

	/**
	 * @Description 是否检查下载
	 * @param model
	 * @return
	 * @see 需要参考的类或方法
	 */
	public abstract boolean isCheckDown();

}
