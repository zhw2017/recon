package com.pay.recontwo.core.service;

import java.util.List;

import com.pay.recontwo.core.mapper.FileParseSetMapper;
import com.pay.recontwo.enums.ExecStatusEnum;
import com.pay.recontwo.model.FileParseSet;

/**
 * @Description: 这里用一句话描述这个类的作用
 * @see: FileParseSetService 此处填写需要参考的类
 * @version 2016年10月15日 下午15:49:48
 * @author guangzhi.ji
 */
public interface FileParseSetService extends FileParseSetMapper {
	public List<FileParseSet> findUseByBusiAssIdAndFileType(String busiAssSetId, String fileSourceDivi);

	public void findAndUpdatesetExecStatusById(String id, int execNum, ExecStatusEnum execStatusEnum);

	public List<FileParseSet> findByBusiAssIdAndFileType(String busiAssSetId, String fileSourceDivi);
}
