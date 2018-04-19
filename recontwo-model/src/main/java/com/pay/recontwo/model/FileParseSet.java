package com.pay.recontwo.model;

public class FileParseSet extends BaseMapperVO {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8717953822876300886L;
	/** 业务配置主键 */
	private String busiAssSetId;
	/** 文件类型 */
	private String fileType;
	/** 文件编码 */
	private String fileCode;
	/** 本地路径 */
	private String localDir;
	/** 数据处理实现 */
	private String dataHandleImpl;
	/** 是否解析 */
	private String isParse;
	/** 优先级 */
	private int priority;
	/** 默认银行通道 */
	private String defaultChannel;
	/** 文件提供时间 */
	private String fileProvideTime;
	/** 通知类型 */
	private String noticeType;
	/** 通知组编码 */
	private String noticeTeamCode;
	/** 执行状态 */
	private String execStatus;
	/** 创建人 */
	private String createUser;
	/** 修改人 */
	private String modifyUser;
	/** 自定义项1 */
	private String def1;
	/** 自定义项2 */
	private String def2;
	/** 自定义项3 */
	private String def3;

	public String getFileProvideTime() {
		return fileProvideTime;
	}

	public void setFileProvideTime(String fileProvideTime) {
		this.fileProvideTime = fileProvideTime;
	}

	public String getBusiAssSetId() {
		return busiAssSetId;
	}

	public void setBusiAssSetId(String busiAssSetId) {
		this.busiAssSetId = busiAssSetId;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getFileCode() {
		return fileCode;
	}

	public void setFileCode(String fileCode) {
		this.fileCode = fileCode;
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

	public String getIsParse() {
		return isParse;
	}

	public void setIsParse(String isParse) {
		this.isParse = isParse;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getDefaultChannel() {
		return defaultChannel;
	}

	public void setDefaultChannel(String defaultChannel) {
		this.defaultChannel = defaultChannel;
	}

	public String getNoticeType() {
		return noticeType;
	}

	public void setNoticeType(String noticeType) {
		this.noticeType = noticeType;
	}

	public String getNoticeTeamCode() {
		return noticeTeamCode;
	}

	public void setNoticeTeamCode(String noticeTeamCode) {
		this.noticeTeamCode = noticeTeamCode;
	}

	public String getExecStatus() {
		return execStatus;
	}

	public void setExecStatus(String execStatus) {
		this.execStatus = execStatus;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getModifyUser() {
		return modifyUser;
	}

	public void setModifyUser(String modifyUser) {
		this.modifyUser = modifyUser;
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

	@Override
	public String toString() {
		return "FileParseSet [busiAssSetId=" + busiAssSetId + ", fileType=" + fileType + ", fileCode=" + fileCode + ", localDir=" + localDir + ", dataHandleImpl="
				+ dataHandleImpl + ", isParse=" + isParse + ", priority=" + priority + ", defaultChannel=" + defaultChannel + ", fileProvideTime=" + fileProvideTime
				+ ", noticeType=" + noticeType + ", noticeTeamCode=" + noticeTeamCode + ", execStatus=" + execStatus + ", createUser=" + createUser
				+ ", modifyUser=" + modifyUser + ", def1=" + def1 + ", def2=" + def2 + ", def3=" + def3 + "]";
	}

}
