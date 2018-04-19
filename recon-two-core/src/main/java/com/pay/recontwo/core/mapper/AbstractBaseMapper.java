package com.pay.recontwo.core.mapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.pay.recontwo.core.utils.ListUtils;
import com.pay.recontwo.core.utils.ParamValidator;
import com.pay.recontwo.core.utils.PrimaryKeyGenerator;
import com.pay.recontwo.model.BaseMapperVO;

public abstract class AbstractBaseMapper<T extends BaseMapperVO> extends SqlSessionDaoSupport implements BaseMapper<T> {
	protected final Logger log=LoggerFactory.getLogger(getClass());
	@Resource
	private PrimaryKeyGenerator primaryKeyGenerator;
	@Resource
	private ParamValidator paramValidator;
	/** mapper注入类名 */
	private String mapperClassName;
	/** 每批插入条数 */
	private int batchInsertRow = 1000;

	public AbstractBaseMapper(String mapperClassName) {
		this.mapperClassName = mapperClassName;
	}

	@Override
	public int insert(T t) {
		int rows = 0;
		try {
			if (t == null) {
				return 0;
			}
			String nameSpaceMethod = mapperClassName + ".insert";
			patchInsertNecessaryKeyAndVali(t);
			rows = getSqlSession().insert(nameSpaceMethod, t);
		} catch (Exception e) {
			log.error("insert-errorMsg:" + e.getMessage());
		}
		return rows;
	}

	@Override
	public int insertList(List<T> list) {
		int rows = 0;
		try {
			if (ListUtils.isBlankList(list)) {
				return 0;
			}
			String nameSpaceMethod = mapperClassName + ".insertList";
			patchInsertNecessaryKeyAndVali(list);
			rows = getSqlSession().insert(nameSpaceMethod, list);
		} catch (Exception e) {
			log.error("insertList-errorMsg:" + e.getMessage());
		}
		return rows;
	}

	@Override
	public void batchInsert(List<T> listModel) {
		if (ListUtils.isBlankList(listModel)) {
			return;
		}
		log.info("batchInsert start total rows:" + listModel.size());
		List<T> allListModel = (List<T>) listModel;
		int i = 1;
		List<T> listTemp = new ArrayList<>(batchInsertRow);
		for (T model : allListModel) {
			if (i % batchInsertRow == 0) {
				log.info("insert row i=" + i);
				listTemp.add(model);
				insertList(listTemp);
				listTemp.clear();
			} else {
				listTemp.add(model);
			}
			i++;
		}
		if (!listTemp.isEmpty()) {
			log.info("insert row i=" + (i - 1));
			insertList(listTemp);
		}
		log.info("batchInsert end");

	}

	@Override
	public int delById(String id) {
		int rows = 0;
		try {
			String nameSpaceMethod = mapperClassName + ".delById";
			rows = getSqlSession().delete(nameSpaceMethod, id);
		} catch (Exception e) {
			log.error("delById-errorMsg:" + e.getMessage());
		}
		return rows;
	}

	@Override
	public int delByMap(Map<String, Object> map) {
		int rows = 0;
		try {
			String nameSpaceMethod = mapperClassName + ".delByMap";
			rows = getSqlSession().delete(nameSpaceMethod, map);
		} catch (Exception e) {
			log.error("delByMap-errorMsg:" + e.getMessage());
		}
		return rows;
	}

	@Override
	public T findById(String id) {
		try {
			String nameSpaceMethod = mapperClassName + ".findById";
			return getSqlSession().selectOne(nameSpaceMethod, id);
		} catch (Exception e) {
			log.error("findById-errorMsg:" + e.getMessage());

		}
		return null;
	}

	@Override
	public List<T> findByMap(Map<String, Object> map) {
		try {
			String nameSpaceMethod = mapperClassName + ".findByMap";
			return getSqlSession().selectList(nameSpaceMethod, map);
		} catch (Exception e) {
			log.error("findByMap-errorMsg:" + e.getMessage());

		}
		return null;
	}

	@Override
	public int updateById(T t) {
		int rows = 0;
		try {
			String nameSpaceMethod = mapperClassName + ".updateById";
			patchUpdateNecessaryKey(t);
			rows = getSqlSession().update(nameSpaceMethod, t);
		} catch (Exception e) {
			log.error("updateById-errorMsg:" + e.getMessage());

		}
		return rows;
	}

	@Autowired
	public void setMyBatisSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		setSqlSessionFactory(sqlSessionFactory);
	}

	@Override
	public void delHistoryData(Map<String, Object> map) {

	}

	/**
	 * @Description 插入补充必要数据LIST
	 * @param list
	 * @see 需要参考的类或方法
	 */
	public void patchInsertNecessaryKeyAndVali(List<T> list) {
		for (T t : list) {
			patchInsertNecessaryKeyAndVali(t);
		}
	}

	/**
	 * @Description 插入补充必要数据
	 * @param list
	 * @see 需要参考的类或方法
	 */
	public void patchInsertNecessaryKeyAndVali(T t) {
		// if (isUseShareId()) {
		// String generateId = primaryKeyGenerator.shareId();
		// t.setId(generateId);
		// } else {
		// String generateId = primaryKeyGenerator.generateId(t.getClass());
		// t.setId(generateId);
		// }
		String generateId = primaryKeyGenerator.getUUID();
		t.setId(generateId);
		t.setCreateTime(new Date());
		t.setOptimistic(0);
		paramValidator.valid(t);

	}

	/**
	 * @Description 更新补充必要数据
	 * @param list
	 * @see 需要参考的类或方法
	 */
	public void patchUpdateNecessaryKey(T t) {
		t.setModifyTime(new Date());
	}

	public int getBatchInsertRow() {
		return batchInsertRow;
	}

	public void setBatchInsertRow(int batchInsertRow) {
		this.batchInsertRow = batchInsertRow;
	}

	public boolean isUseShareId() {
		return false;
	}
}
