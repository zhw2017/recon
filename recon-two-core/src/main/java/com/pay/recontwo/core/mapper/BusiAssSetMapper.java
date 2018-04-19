package com.pay.recontwo.core.mapper;

import java.util.List;

import com.pay.recontwo.model.BusiAssSet;

/**
 * @Description: 这里用一句话描述这个类的作用
 * @see: BusiAssSet 此处填写需要参考的类
 * @version 2016年10月15日 下午15:49:48
 * @author guangzhi.ji
 */
public interface BusiAssSetMapper extends BaseMapper<BusiAssSet> {
	/**
	 * @Description 查询资金核对的收单机构
	 * @return
	 * @see 需要参考的类或方法
	 */
	public List<BusiAssSet> findFundCheckReceiptInstNo();

	public List<BusiAssSet> findFundCheckReceiptInstNoByAcc(String fundSettleAccCode);

	public List<BusiAssSet> findUseParse();
}
