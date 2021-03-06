package com.pay.recontwo.core.service;

import com.pay.recontwo.core.mapper.FileTempletSetMapper;
import com.pay.recontwo.model.FileTempletSet;

/**
 * @Description: 这里用一句话描述这个类的作用
 * @see: FileTempletSetService 此处填写需要参考的类
 * @version 2016年10月15日 下午15:49:48
 * @author guangzhi.ji
 */
public interface FileTempletSetService extends FileTempletSetMapper {
	public FileTempletSet findByFileCode(String fileCode);
}
