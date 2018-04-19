package com.pay.recontwo.core.parse.file.base;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pay.recontwo.bean.ReturnResult;
import com.pay.recontwo.core.exception.FileParseException;
import com.pay.recontwo.core.parse.file.BaseFileTrans;
import com.pay.recontwo.core.service.FileParseLogService;
import com.pay.recontwo.core.service.FileParseSetService;
import com.pay.recontwo.core.utils.ErrorCodeUtis;
import com.pay.recontwo.core.utils.StringUtils;
import com.pay.recontwo.enums.DataValidityEnum;
import com.pay.recontwo.enums.ExecModeEnum;
import com.pay.recontwo.enums.ExecStatusEnum;
import com.pay.recontwo.enums.FileSourceDiviEnum;
import com.pay.recontwo.enums.ResultCodeEnum;
import com.pay.recontwo.enums.TimeFreEnum;
import com.pay.recontwo.model.BaseMapperVO;
import com.pay.recontwo.model.BusiAssSet;
import com.pay.recontwo.model.FileParseLog;
import com.pay.recontwo.model.FileParseSet;
import com.pay.recontwo.model.FileTempletSet;

/**
 * @Description: 单一文件解析基类
 * @see: BaseFileTransImpl 此处填写需要参考的类
 * @version 2017年3月14日 上午11:00:47
 * @author guangzhi.ji
 */
public abstract class BaseFileTransImpl<T extends BaseMapperVO, V extends BaseMapperVO> implements BaseFileTrans<T, V> {
	private static Logger logMonitor = LoggerFactory.getLogger("monitor");
	protected Logger log = LoggerFactory.getLogger(getClass());

	@Resource
	private DateQueryService dateQueryService;
	@Resource
	private FileParseSetService fileParseSetService;
	@Resource
	private FileParseLogService fileParseLogService;
	@Resource
	private FileDownLogService fileDownLogService;
	@Resource
	private FileUtils fileUtils;
	@Resource
	private EnvironmentUtils environmentUtils;

	@Override
	public ReturnResult<V> parseFileToBean(ReturnResult<V> returnResult, BusiAssSet busiAssSet, FileParseSet fileParseSet, FileTempletSet fileTempletSet,
			FileParseLog fileParseLog, TimeFreEnum timeFreEnum) {
		/** 检查是否在执行 */
		fileParseLog.setStartTime(new Date());
		String execStatus = fileParseSet.getExecStatus();
		if (ExecStatusEnum.PROCESSING.toString().equals(execStatus)) {
			fileParseLogService.recordFileParseLog(fileParseLog, timeFreEnum, ResultCodeEnum.FAIL.toString(), ErrorCodeUtis.PARSE_FILE_PROCESSING, "上次执行未完成请等待!");
			throw new FileParseException(ErrorCodeUtis.PARSE_FILE_PROCESSING, "上次执行未完成请等待!");
		}
		/** 检查并发操作 */
		fileParseSet.setExecStatus(ExecStatusEnum.PROCESSING.toString());
		int updateById = fileParseSetService.updateById(fileParseSet);
		if (updateById <= 0) {
			fileParseLogService.recordFileParseLog(fileParseLog, timeFreEnum, ResultCodeEnum.FAIL.toString(), ErrorCodeUtis.DOWN_FILE_RETRY, "并发操作请重试!");
			throw new FileParseException(ErrorCodeUtis.DOWN_FILE_RETRY, "并发操作请重试!");
		}
		String fileParseSetId = fileParseSet.getId();
		if (!StringUtils.isBlank(fileParseSetId)) {
			fileParseSet = fileParseSetService.findById(fileParseSetId);
		}
		/** 处理解析文件 */
		String localPath = fileParseSet.getLocalDir();
		String fileType = fileParseSet.getFileType();
		String instNo = fileParseLog.getInstNo();
		String execDate = fileParseLog.getFileDate();
		String execMode = fileParseLog.getExecMode();
		String busiCode = busiAssSet.getBusiCode();
		localPath = fileUtils.converFileName(localPath, execDate);
		localPath = fileUtils.chechPath(localPath);
		String fileRegExp = fileTempletSet.getFileRegExp();
		String fileRegExpName = null;
		if (("DISTILL_POS_ORDER").equals(fileParseSet.getFileCode()) || ("DISTILL_REMIT_BILL").equals(fileParseSet.getFileCode())) {
			long currentTime = System.currentTimeMillis();
			currentTime -= 60 * 60 * 1000;
			Date date = new Date(currentTime);
			String downDat = DateFormatUtils.format(date, "yyyy-MM-dd HH:mm:ss");
			fileRegExpName = fileUtils.converFileName(fileRegExp, downDat);
		} else {
			fileRegExpName = fileUtils.converFileName(fileRegExp, execDate);
		}
		try {
			File localFile = new File(localPath);
			String[] listFileName = localFile.list(new DirFilter(fileRegExpName));
			/** 如果匹配不上就用原来 */
			if (listFileName == null || listFileName.length <= 0) {
				listFileName = new String[] { fileRegExpName };
			}
			for (String realFileName : listFileName) {
				String fileName = realFileName;
				log.info("fileParseSet:" + fileParseSet.toString());
				fileParseLog.setFileName(fileName);
				fileParseLog.setLocalDir(localPath);
				fileParseLog.setFileType(fileParseSet.getFileType());
				fileParseLog.setFileExplain(fileTempletSet.getFileExplain());
				fileParseLog.setPriority(fileParseSet.getPriority());
				fileParseLog.setStartTime(new Date());
				fileParseLog.setExecHostIp(HostUtils.getHostIp());
				String queryFileInst = FileSourceDiviEnum.BANK.toString().equals(fileType) ? instNo : "PAY";
				log.info("execDate:[" + execDate + ",]bankInstNo:[" + instNo + "],busiCode:[" + busiCode + "],FileName:[" + fileParseLog.getFileName()
						+ "] parse start");
				if (ExecModeEnum.TASK.toString().equals(execMode)) {
					boolean findIsSuccess = fileParseLogService.findParseSuccess(busiCode, fileParseLog.getFileName(), fileParseLog.getLocalDir());
					if (findIsSuccess) {
						log.info("instNo:[" + instNo + "],busiCode:[" + busiCode + "],fileName:[" + fileParseLog.getFileName() + "],had success,no't exec!");
						continue;
					}
				}
				if (isCheckDown()) {
					/** 生产环境检查文件是否下载 */
					// if (environmentUtils.isProductEnv()) {
					log.info("check isProductEnv:{}", true);
					if (ExecModeEnum.TASK.toString().equals(execMode)) {
						// String downFileName = downFileNameByParse(fileName);
						boolean findFileIsDown = fileDownLogService.findFileIsDown(queryFileInst, fileParseLog.getFileName());
						if (!findFileIsDown) {
							fileParseLogService.recordFileParseLog(fileParseLog, timeFreEnum, ResultCodeEnum.FAIL.toString(), ErrorCodeUtis.PARSE_FILE_NO_DOWN,
									"文件未下载成功!");
							logMonitor.warn(String.format(SelfStringUtils.LOG_FORMAT, "BaseFileTransImpl", ErrorCodeUtis.PARSE_FILE_NO_DOWN, "busiCode:" + busiCode
									+ ",fileName:" + fileName, "begin", "success", "-", "-"));
							throw new FileParseException(ErrorCodeUtis.PARSE_FILE_NO_DOWN, "文件未下载成功!");
						}
					}
					// }
				}
				if (!localFile.exists()) {
					fileParseLogService.recordFileParseLog(fileParseLog, timeFreEnum, ResultCodeEnum.FAIL.toString(), ErrorCodeUtis.PARSE_FILE_NO_EXISTS,
							"解析时本地文件不存在!");
					logMonitor.warn(String.format(SelfStringUtils.LOG_FORMAT, "BaseFileTransImpl", ErrorCodeUtis.PARSE_FILE_NO_EXISTS, "busiCode:" + busiCode
							+ ",fileName:" + fileName, "begin", "success", "-", "-"));
					throw new FileParseException(ErrorCodeUtis.PARSE_FILE_NO_EXISTS, "解析时本地文件不存在!");
				}
				/** 清算日期即对账期间 */
				String clearDate = getClearDate(execDate, busiAssSet.getClearCycle());
				if (ExecModeEnum.MANUAL.toString().equals(execMode)) {
					/** 历史解析成功结果失效 */
					log.info("execDate:[" + execDate + "],busiCode:[" + busiCode + "],fileName:[" + fileParseLog.getFileName() + "],updateDataValidityStatus start");
					fileParseLogService.updateSuccessDataValidityStatus(execDate, busiCode, fileParseLog.getFileName(), DataValidityEnum.INVALID.toString(),
							fileParseLog.getLocalDir());
					log.info("execDate:[" + execDate + "],busiCode:[" + busiCode + "],fileName:[" + fileParseLog.getFileName() + "],updateDataValidityStatus end");
					/** 删除历史数据 */
					log.info("execMode:[" + execMode + "],fileName:[" + fileParseLog.getFileName() + "],delHistoryData start");
					delHistoryData(instNo, busiCode, clearDate, fileParseLog.getFileName());
					log.info("execMode:[" + execMode + "],fileName:[" + fileParseLog.getFileName() + "],delHistoryData end");
				}
				List<T> listModel = new ArrayList<T>();
				String settleDate = getSettleDate(clearDate, busiAssSet.getFundSettleCycle());
				try {
					/** 解析完文件之前的处理 */
					beforeParseFile(returnResult, listModel, busiAssSet, fileParseSet, fileTempletSet, fileParseLog);
					/** 解析文件 */
					listModel = parseFile(busiAssSet, fileTempletSet, fileParseLog, clearDate, settleDate);
					fileParseLog.setBankChannel(busiAssSet.getDefaultChannel());
					/** 解析完文件之后的处理 */
					afterParseFile(returnResult, listModel, busiAssSet, fileParseSet, fileTempletSet, fileParseLog);
				} catch (Exception e) {
					fileParseLogService.recordFileParseLog(fileParseLog, TimeFreEnum.ONEHOUR, ResultCodeEnum.FAIL.toString(), ErrorCodeUtis.PARSE_FILE_PRO_ERROR,
							"解析时文件出错!");
					if (ExecModeEnum.TASK.toString().equals(execMode)) {
						logMonitor.warn(String.format(SelfStringUtils.LOG_FORMAT, "BaseFileTransImpl", "parseFile.pf003.error", "busiCode:" + busiCode
								+ ",fileName:" + fileName, "begin", "success", "-", "-"));
					}
					throw new FileParseException(ErrorCodeUtis.PARSE_FILE_PRO_ERROR, "解析时文件出错!", e);
				}
				if (ListUtils.isBlankList(listModel)) {
					fileParseLogService.recordFileParseLog(fileParseLog, TimeFreEnum.ONEHOUR, ResultCodeEnum.SUCCESS.toString(),
							ErrorCodeUtis.PARSE_FILE_DATA_EMPTY, "解析时文件数据为空!");
					continue;
				}
				fileParseLogService.recordFileParseLog(fileParseLog, TimeFreEnum.ONEHOUR, ResultCodeEnum.SUCCESS.toString(), null, null);
				log.info("execDate:[" + execDate + ",]bankInstNo:[" + instNo + "],busiCode:[" + busiCode + "],FileName:[" + fileName + "] parse end");
			}
			return returnResult;
		} catch (Exception e) {
			/** 异常消息 */
			if (e instanceof FileParseException) {
				throw e;
			} else {
				String errorMsg = "parseException no-FileParseException:" + e.getMessage();
				log.error(errorMsg, e);
				fileParseLogService.recordFileParseLog(fileParseLog, TimeFreEnum.ONEHOUR, ResultCodeEnum.FAIL.toString(), ErrorCodeUtis.PARSE_FILE_UNKNOWN_ERROR, e
						.getMessage().length() <= 200 ? e.getMessage() : e.getMessage().substring(0, 200));
				throw new FileParseException(ErrorCodeUtis.PARSE_FILE_UNKNOWN_ERROR, "未知异常!", e);
			}
		} finally {
			/** 更新成未执行 */
			fileParseSetService.findAndUpdatesetExecStatusById(fileParseSet.getId(), 0, ExecStatusEnum.NO_START);
		}

	}

	@Override
	public boolean isExistTitle() {
		return false;
	}

	@Override
	public boolean isCheckDown() {
		return true;
	}

	/**
	 * @Description 解析文件处理
	 * @param busiAssSet
	 * @param fileAllPath
	 * @param fileTempletSet
	 * @param bankInstNo
	 * @param clearDate
	 * @return
	 * @throws Exception
	 * @see 需要参考的类或方法
	 */
	public abstract List<T> parseFile(BusiAssSet busiAssSet, FileTempletSet fileTempletSet, FileParseLog fileParseLog, String clearDate, String settleDate)
			throws Exception;

	/**
	 * @Description 获取清算日期
	 * @param file
	 * @param dateCycleEnum
	 * @return
	 * @see 需要参考的类或方法
	 */
	private String getClearDate(String execDate, String dateCycleEnum) {
		/** 时间条件暂时未使用 */
		String clearDate = dateQueryService.getClearDate(execDate, dateCycleEnum);
		return clearDate;
	}

	/**
	 * @Description 获取结算日期
	 * @param clearDate
	 * @param dateCycleEnum
	 * @return
	 * @see 需要参考的类或方法
	 */
	private String getSettleDate(String clearDate, String dateCycleEnum) {
		/** 时间条件暂时未使用 */
		String settleDate = dateQueryService.getSettleDate(clearDate, dateCycleEnum);
		return settleDate;
	}

	/**
	 * @Description 是否清除历史数据
	 * @return
	 * @see 需要参考的类或方法
	 */
	public boolean isClearHistory() {
		return false;
	}

	/**
	 * @Description 删除历史数据
	 * @param instNo
	 * @param fileName
	 * @param clearDate
	 * @see 需要参考的类或方法
	 */
	public abstract void delHistoryData(String instNo, String busiCode, String clearDate, String fileName);

	/**
	 * @Description 解析文件之前
	 * @param listModel
	 * @return
	 * @see 需要参考的类或方法
	 */
	public abstract void beforeParseFile(ReturnResult<V> returnResult, List<T> listModel, BusiAssSet busiAssSet, FileParseSet fileParseSet,
			FileTempletSet fileTempletSet, FileParseLog fileParseLog);

	/**
	 * @Description 解析文件之后
	 * @param listModel
	 * @return
	 * @see 需要参考的类或方法
	 */
	public abstract void afterParseFile(ReturnResult<V> returnResult, List<T> listModel, BusiAssSet busiAssSet, FileParseSet fileParseSet,
			FileTempletSet fileTempletSet, FileParseLog fileParseLog);

	/**
	 * @Description 解析文件之前处理
	 * @param line
	 * @return
	 * @see 需要参考的类或方法
	 */
	public abstract String beforeParseLineToBean(String line);

	/**
	 * @Description 设置过滤规则基于解析成BEAN的
	 * @param model
	 * @return
	 * @see 需要参考的类或方法
	 */
	public abstract boolean isFilterLineBaseOnBean(BusiAssSet busiAssSet, T model);

	/**
	 * @Description 设置过滤规则基于原始文件行
	 * @param line
	 * @param fileSeparator
	 * @param row
	 * @return
	 * @see 需要参考的类或方法
	 */
	public abstract boolean isFilterLineBaseOnString(String line, String fileSeparator, int row);

}
