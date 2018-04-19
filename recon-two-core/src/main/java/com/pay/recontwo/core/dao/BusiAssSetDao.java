package com.pay.recontwo.core.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.pay.recontwo.core.mapper.AbstractBaseMapper;
import com.pay.recontwo.core.mapper.BusiAssSetMapper;
import com.pay.recontwo.model.BusiAssSet;

/**
 * @Description: 这里用一句话描述这个类的作用
 * @see: BusiAssSetDao 此处填写需要参考的类
 * @version 2016年10月8日 下午15:49:48
 * @author guangzhi.ji
 */
@Repository("busiAssSetDao")
public class BusiAssSetDao extends AbstractBaseMapper<BusiAssSet> implements BusiAssSetMapper {
	@Resource
	private BusiAssSetMapper busiAssSetMapper;

	public BusiAssSetDao() {
		super(BusiAssSetMapper.class.getName());
	}

	@Override
	public List<BusiAssSet> findFundCheckReceiptInstNo() {
		return busiAssSetMapper.findFundCheckReceiptInstNo();
	}

	@Override
	public List<BusiAssSet> findFundCheckReceiptInstNoByAcc(String fundSettleAccCode) {
		return busiAssSetMapper.findFundCheckReceiptInstNoByAcc(fundSettleAccCode);
	}

	@Override
	public List<BusiAssSet> findUseParse() {
		return busiAssSetMapper.findUseParse();
	}

}
