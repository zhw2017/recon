package com.pay.recontwo.bean;

import java.io.Serializable;
import java.util.Date;


public class FileOptBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3333754961509943739L;
	/** 文件说明 */
//	@NotBlank
	private String fileExplain;
	/** 文件日期 */
//	@NotBlank
	private String fileDate;
	/** 文件名 */
//	@NotBlank
	private String fileName;
	/** 执行方式 */
//	@NotBlank
	private String execMode;
	/** 操作类型 */
//	@NotBlank
	private String opType;
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
//	@NotBlank
	private Date startTime;
	/** 结束时间 */
//	@NotBlank
	private Date endTime;
	/** 用时 */
//	@NotBlank
	private Date useTime;
	/** 下次执行时间 */
//	@NotBlank
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

	public String getFileExplain() {
		return fileExplain;
	}

	public FileOptBean() {
		super();
	}

	public FileOptBean(String fileExplain, String fileDate, String fileName, String execMode, String opType, String result, String errorCode, String errorMsg,
			String execHostIp, Date startTime, Date endTime, Date useTime, Date nextStartTime, String createUser) {
		super();
		this.fileExplain = fileExplain;
		this.fileDate = fileDate;
		this.fileName = fileName;
		this.execMode = execMode;
		this.opType = opType;
		this.result = result;
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
		this.execHostIp = execHostIp;
		this.startTime = startTime;
		this.endTime = endTime;
		this.useTime = useTime;
		this.nextStartTime = nextStartTime;
		this.createUser = createUser;
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

	public String getOpType() {
		return opType;
	}

	public void setOpType(String opType) {
		this.opType = opType;
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

	public Date getUseTime() {
		return useTime;
	}

	public void setUseTime(Date useTime) {
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
