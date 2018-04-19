package com.pay.recontwo.core.mapper;

import java.util.List;

import com.pay.recontwo.model.ClearFileCond;

/**
 * @Description: 这里用一句话描述这个类的作用
 * @see: ClearFileCond 此处填写需要参考的类
 * @version 2016年10月15日 下午15:49:48
 * @author guangzhi.ji
 */
public interface ClearFileCondMapper extends BaseMapper<ClearFileCond> {
	List<ClearFileCond> findListByInstNo(String instNo);
}
