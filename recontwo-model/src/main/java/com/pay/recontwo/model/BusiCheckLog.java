package com.pay.recontwo.model;

import java.util.Date;

//import javax.validation.constraints.NotNull;

//import org.hibernate.validator.constraints.NotBlank;

public class BusiCheckLog extends BaseMapperVO {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5721429640465208583L;
	/** 对账期间 */
//	@NotBlank
	private String checkPeriod;
	/** 对接机构 */
//	@NotBlank
	private String accessInst;
	/** 业务大类 */
//	@NotBlank
	private String busiType;
	/** 业务编码 */
//	@NotBlank
	private String busiCode;
	/** 业务名称 */
	private String busiName;
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
	private String useTime;
	/** 任务开始时间 */
	private Date taskStartTime;
	/** 下次执行时间 */
	private Date nextStartTime;
	/** 创建人 */
	private String createUser;
	/** 自定义项1 */
	private String def1;
	/** 自定义项2 */
	private String def2;
	/** 自定义项3 */
	private String def3;

	public BusiCheckLog() {
		super();
	}

	public BusiCheckLog(String checkPeriod, String accessInst, String busiType, String busiCode, String busiName, String execMode, String execHostIp,
			Date startTime, String createUser) {
		super();
		this.checkPeriod = checkPeriod;
		this.accessInst = accessInst;
		this.busiType = busiType;
		this.busiCode = busiCode;
		this.busiName = busiName;
		this.execMode = execMode;
		this.execHostIp = execHostIp;
		this.startTime = startTime;
		this.createUser = createUser;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Date getTaskStartTime() {
		return taskStartTime;
	}

	public void setTaskStartTime(Date taskStartTime) {
		this.taskStartTime = taskStartTime;
	}

	public String getCheckPeriod() {
		return checkPeriod;
	}

	public void setCheckPeriod(String checkPeriod) {
		this.checkPeriod = checkPeriod;
	}

	public String getAccessInst() {
		return accessInst;
	}

	public void setAccessInst(String accessInst) {
		this.accessInst = accessInst;
	}

	public String getBusiType() {
		return busiType;
	}

	public void setBusiType(String busiType) {
		this.busiType = busiType;
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
