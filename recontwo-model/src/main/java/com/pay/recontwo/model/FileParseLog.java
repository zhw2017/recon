package com.pay.recontwo.model;

import java.util.Date;

public class FileParseLog extends BaseMapperVO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7632662916834315064L;
	/** 机构编码 */
	private String instNo;
	/** 文件类型 */
	private String fileType;
	/** 文件日期 */
	private String fileDate;
	/** 业务编码 */
	private String busiCode;
	/** 业务名称 */
	private String busiName;
	/** 文件说明 */
	private String fileExplain;
	/** 文件名 */
	private String fileName;
	/** 本地路径 */
	private String localDir;
	/** 银行通道 */
	private String bankChannel;
	/** 解析器 */
	private String dataHandleImpl;
	/** 优先级 */
	private int priority;
	/** 执行方式 */
	private String execMode;
	/** 结果 */
	private String result;
	/** 错误码 */
	private String errorCode;
	/** 错误信息 */
	private String errorMsg;
	/** 总行数 */
	private int fileTotalRow;
	/** 使用行数 */
	private int fileUseRow;
	/** 执行主机 */
	private String execHostIp;
	/** 开始时间 */
	private Date startTime;
	/** 结束时间 */
	private Date endTime;
	/** 用时 */
	private String useTime;
	/** 任务开始时间 */
	private Date taskStartTime;
	/** 下次执行时间 */
	private Date nextStartTime;
	/** 创建人 */
	private String createUser;
	/** 自定义项1 用于标记结果有效还是无效 */
	private String def1;
	/** 自定义项2 */
	private String def2;
	/** 自定义项3 */
	private String def3;

	public FileParseLog() {
		super();
	}

	public FileParseLog(String instNo, String fileDate, String execMode, String result, String createUser, Date taskStartTime) {
		super();
		this.instNo = instNo;
		this.fileDate = fileDate;
		this.execMode = execMode;
		this.result = result;
		this.createUser = createUser;
		this.taskStartTime = taskStartTime;
	}

	public String getBusiCode() {
		return busiCode;
	}

	public void setBusiCode(String busiCode) {
		this.busiCode = busiCode;
	}

	public String getBusiName() {
		return busiName;
	}

	public void setBusiName(String busiName) {
		this.busiName = busiName;
	}

	public String getFileExplain() {
		return fileExplain;
	}

	public void setFileExplain(String fileExplain) {
		this.fileExplain = fileExplain;
	}

	public String getBankChannel() {
		return bankChannel;
	}

	public void setBankChannel(String bankChannel) {
		this.bankChannel = bankChannel;
	}

	public String getInstNo() {
		return instNo;
	}

	public void setInstNo(String instNo) {
		this.instNo = instNo;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getFileDate() {
		return fileDate;
	}

	public void setFileDate(String fileDate) {
		this.fileDate = fileDate;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getLocalDir() {
		return localDir;
	}

	public void setLocalDir(String localDir) {
		this.localDir = localDir;
	}

	public String getDataHandleImpl() {
		return dataHandleImpl;
	}

	public void setDataHandleImpl(String dataHandleImpl) {
		this.dataHandleImpl = dataHandleImpl;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getExecMode() {
		return execMode;
	}

	public void setExecMode(String execMode) {
		this.execMode = execMode;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public int getFileTotalRow() {
		return fileTotalRow;
	}

	public void setFileTotalRow(int fileTotalRow) {
		this.fileTotalRow = fileTotalRow;
	}

	public int getFileUseRow() {
		return fileUseRow;
	}

	public void setFileUseRow(int fileUseRow) {
		this.fileUseRow = fileUseRow;
	}

	public String getExecHostIp() {
		return execHostIp;
	}

	public void setExecHostIp(String execHostIp) {
		this.execHostIp = execHostIp;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getUseTime() {
		return useTime;
	}

	public void setUseTime(String useTime) {
		this.useTime = useTime;
	}

	public Date getTaskStartTime() {
		return taskStartTime;
	}

	public void setTaskStartTime(Date taskStartTime) {
		this.taskStartTime = taskStartTime;
	}

	public Date getNextStartTime() {
		return nextStartTime;
	}

	public void setNextStartTime(Date nextStartTime) {
		this.nextStartTime = nextStartTime;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getDef1() {
		return def1;
	}

	public void setDef1(String def1) {
		this.def1 = def1;
	}

	public String getDef2() {
		return def2;
	}

	public void setDef2(String def2) {
		this.def2 = def2;
	}

	public String getDef3() {
		return def3;
	}

	public void setDef3(String def3) {
		this.def3 = def3;
	}

}
