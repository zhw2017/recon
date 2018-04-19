package com.pay.recontwo.core.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.pay.recontwo.bean.ReturnResult;
import com.pay.recontwo.core.parse.file.BaseFileTrans;
import com.pay.recontwo.core.service.FileParseLogService;
import com.pay.recontwo.core.service.FileParseSetService;
import com.pay.recontwo.core.service.FileTempletSetService;
import com.pay.recontwo.core.service.ParseAggService;
import com.pay.recontwo.core.utils.ListUtils;
import com.pay.recontwo.enums.DataValidityEnum;
import com.pay.recontwo.enums.ExecModeEnum;
import com.pay.recontwo.enums.ResultCodeEnum;
import com.pay.recontwo.enums.TimeFreEnum;
import com.pay.recontwo.model.BusiAssSet;
import com.pay.recontwo.model.FileParseLog;
import com.pay.recontwo.model.FileParseSet;
import com.pay.recontwo.model.FileTempletSet;

/**
 * @Description: 解析文件聚合服务
 * @see: ParseAggServiceImpl 此处填写需要参考的类
 * @version 2017年3月14日 上午10:53:59
 * @author guangzhi.ji
 */
@Service
public class ParseAggServiceImpl implements ParseAggService {
	private static Logger log = LoggerFactory.getLogger(ParseAggServiceImpl.class);
	@Resource
	private ApplicationContext applicationContext;
	@Resource
	private FileParseSetService fileParseSetService;
	@Resource
	private FileParseLogService fileParseLogService;
	@Resource
	private FileTempletSetService fileTempletSetService;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void parseBusiFile(String execDate, BusiAssSet busiAssSet, ExecModeEnum execModeEnum, String fileSourceDivi, TimeFreEnum timeFreEnum, String operator) {
		/** 处理解析文件 */
		Date startTime = new Date();
		FileParseLog fileParseLog = new FileParseLog(busiAssSet.getInstNo(), execDate, execModeEnum.toString(), ResultCodeEnum.SUCCESS.toString(), operator,
				startTime);
		fileParseLog.setBusiCode(busiAssSet.getBusiCode());
		fileParseLog.setBusiName(busiAssSet.getBusiName());
		/** 文件解析的结果默认都是有效的 */
		fileParseLog.setDef1(DataValidityEnum.VALID.toString());
		List<FileParseSet> listFileParseSet = fileParseSetService.findByBusiAssIdAndFileType(busiAssSet.getId(), fileSourceDivi);;
		ReturnResult viewShowResult = new ReturnResult();
		if (!ListUtils.isBlankList(listFileParseSet)) {
			for (FileParseSet fileParseSet : listFileParseSet) {
				/** 如果是定时任务 没有设置解析 就不会执行 */
				if (ExecModeEnum.TASK.equals(execModeEnum)) {
					String isParse = fileParseSet.getIsParse();
					if (isParse == null || isParse.equals("N")) {
						log.info("Task not required parse,busiCode:" + busiAssSet.getBusiCode() + ",fileSourceDivi:" + fileSourceDivi + ",fileCode:"
								+ fileParseSet.getFileCode());
						continue;
					}
				}
				String dataHandleImpl = fileParseSet.getDataHandleImpl();
				String fileCode = fileParseSet.getFileCode();
				FileTempletSet fileTempletSet = fileTempletSetService.findByFileCode(fileCode);
				/** 执行配置解析实现类 */
				BaseFileTrans baseFileTrans = (BaseFileTrans) applicationContext.getBean(dataHandleImpl, BaseFileTrans.class);
				viewShowResult = baseFileTrans.parseFileToBean(viewShowResult, busiAssSet, fileParseSet, fileTempletSet, fileParseLog, timeFreEnum);
			}
		}
	}
}
