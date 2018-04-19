package com.pay.recontwo.inner.api;

import java.util.List;
import java.util.Map;

import com.pay.recontwo.model.BaseMapperVO;

/**
 * @Description: mybatis操作基类接口
 * @see: BaseInterface 此处填写需要参考的类
 * @version 2016年10月12日 下午7:41:12
 * @author guangzhi.ji
 */
public abstract interface BaseInterface<T extends BaseMapperVO> {
	/**
	 * @Description 插入单条数据
	 * @param t
	 * @see 需要参考的类或方法
	 */
	public abstract int insert(T t);

	/**
	 * @Description 插入单条数据
	 * @param t
	 * @see 需要参考的类或方法
	 */
	public abstract int insertList(List<T> list);

	/**
	 * @Description 分批插入
	 * @param t
	 * @see 需要参考的类或方法
	 */
	public abstract void batchInsert(List<T> listModel);

	/**
	 * @Description 根据Id删除
	 * @param id
	 * @see 需要参考的类或方法
	 */

	public abstract int delById(String id);

	/**
	 * @Description 根据Id删除
	 * @param id
	 * @see 需要参考的类或方法
	 */

	public abstract int delByMap(Map<String, Object> map);

	/**
	 * @Description 动态参数修改
	 * @param map
	 * @see 需要参考的类或方法
	 */
	public abstract int updateById(T t);

}
