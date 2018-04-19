package com.pay.recontwo.core.service;

import com.pay.recontwo.core.mapper.FileParseLogMapper;
import com.pay.recontwo.enums.TimeFreEnum;
import com.pay.recontwo.model.FileParseLog;

/**
 * @Description: 这里用一句话描述这个类的作用
 * @see: FileParseLogService 此处填写需要参考的类
 * @version 2016年10月15日 下午15:49:48
 * @author guangzhi.ji
 */
public interface FileParseLogService extends FileParseLogMapper {

	public void recordFileParseLog(FileParseLog fileParseLog, TimeFreEnum timeFreEnum, String result, String errorCode, String errosMsg);

	public boolean findParseSuccess(String busiCode, String fileName, String localDir);

	public boolean findParseSuccessAndValid(String busiCode, String fileName);

	public void updateSuccessDataValidityStatus(String fileDate, String busiCode, String fileName, String dataValidStatus, String localDir);
}
