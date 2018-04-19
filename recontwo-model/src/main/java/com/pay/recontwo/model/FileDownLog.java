package com.pay.recontwo.model;

import java.util.Date;

//import javax.validation.constraints.NotNull;

//import org.hibernate.validator.constraints.NotBlank;

public class FileDownLog extends BaseMapperVO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3333754961509943739L;
	/** 银行机构编码 */
//	@NotBlank
	private String instNo;
	/** 文件说明 */
//	@NotBlank
	private String fileExplain;
	/** 下载代号 */
//	@NotBlank
	private String downCode;
	/** 文件日期 */
//	@NotBlank
	private String fileDate;
	/** 文件名 */
//	@NotBlank
	private String fileName;
	/** 执行方式 */
//	@NotBlank
	private String execMode;
	/** 结果 */
//	@NotBlank
	private String result;
	/** 错误码 */
	private String errorCode;
	/** 错误信息 */
	private String errorMsg;
	/** 执行主机 */
//	@NotBlank
	private String execHostIp;
	/** 开始时间 */
//	@NotNull
	private Date startTime;
	/** 结束时间 */
//	@NotNull
	private Date endTime;
	/** 用时 */
//	@NotNull
	private String useTime;
	/** 任务开始时间 */
//	@NotNull
	private Date taskStartTime;
	/** 下次执行时间 */
	private Date nextStartTime;
	/** 创建人 */
//	@NotBlank
	private String createUser;
	/** 自定义项1 */
	private String def1;
	/** 自定义项2 */
	private String def2;
	/** 自定义项3 */
	private String def3;

	public String getDownCode() {
		return downCode;
	}

	public void setDownCode(String downCode) {
		this.downCode = downCode;
	}

	public Date getTaskStartTime() {
		return taskStartTime;
	}

	public void setTaskStartTime(Date taskStartTime) {
		this.taskStartTime = taskStartTime;
	}

	public String getFileExplain() {
		return fileExplain;
	}

	public String getInstNo() {
		return instNo;
	}

	public void setInstNo(String instNo) {
		this.instNo = instNo;
	}

	public FileDownLog() {
		super();
	}

	public FileDownLog(String instNo, String fileExplain, String fileDate, String execMode, String result, String createUser, Date taskStartTime) {
		super();
		this.instNo = instNo;
		this.fileExplain = fileExplain;
		this.fileDate = fileDate;
		this.execMode = execMode;
		this.result = result;
		this.createUser = createUser;
		this.taskStartTime = taskStartTime;
	}

	public void setFileExplain(String fileExplain) {
		this.fileExplain = fileExplain;
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
