package com.pay.recontwo.model;

public class DownFileSet extends BaseMapperVO {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8347251242228523337L;
	/** 机构编码 */
	private String instNo;
	/** 下载说明 */
	private String downExplain;
	/** 下载代号 */
	private String downCode;
	/** 文件名正则 */
	private String fileRegExp;
	/** 下载类型 */
	private String fileType;
	/** 本地路径 */
	private String localDir;
	/** FTP配置编码 */
	private String ftpSetCode;
	/** 远程路径 */
	private String remoteDir;
	/** 执行状态 */
	private String execStatus;
	/** 启用状态 */
	private String isEnable;
	/** 创建人 */
	private String createUser;
	/** 创建人 */
	private String modifyUser;
	/** 自定义项1 */
	private String def1;
	/** 自定义项2 */
	private String def2;
	/** 自定义项3 */
	private String def3;
	/** 是否通知 */
	private String isNotice;
	/** 通知时间 */
	private String noticeTime;
	/** 通知方式 */
	private String noticeMsgType;
	/** 通知组 */
	private String noticeTeamCode;
	/** 下载周期 */
	private int downDateCycle;
	/** 是否模糊 */
	private String isLikeFileName;

	public String getIsNotice() {
		return isNotice;
	}

	public void setIsNotice(String isNotice) {
		this.isNotice = isNotice;
	}

	public String getInstNo() {
		return instNo;
	}

	public void setInstNo(String instNo) {
		this.instNo = instNo;
	}

	public String getDownExplain() {
		return downExplain;
	}

	public void setDownExplain(String downExplain) {
		this.downExplain = downExplain;
	}

	public String getDownCode() {
		return downCode;
	}

	public void setDownCode(String downCode) {
		this.downCode = downCode;
	}

	public String getFileRegExp() {
		return fileRegExp;
	}

	public void setFileRegExp(String fileRegExp) {
		this.fileRegExp = fileRegExp;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getLocalDir() {
		return localDir;
	}

	public void setLocalDir(String localDir) {
		this.localDir = localDir;
	}

	public String getFtpSetCode() {
		return ftpSetCode;
	}

	public void setFtpSetCode(String ftpSetCode) {
		this.ftpSetCode = ftpSetCode;
	}

	public String getRemoteDir() {
		return remoteDir;
	}

	public void setRemoteDir(String remoteDir) {
		this.remoteDir = remoteDir;
	}

	public String getExecStatus() {
		return execStatus;
	}

	public void setExecStatus(String execStatus) {
		this.execStatus = execStatus;
	}

	public String getIsEnable() {
		return isEnable;
	}

	public void setIsEnable(String isEnable) {
		this.isEnable = isEnable;
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

	public String getNoticeTime() {
		return noticeTime;
	}

	public void setNoticeTime(String noticeTime) {
		this.noticeTime = noticeTime;
	}

	public String getNoticeMsgType() {
		return noticeMsgType;
	}

	public void setNoticeMsgType(String noticeMsgType) {
		this.noticeMsgType = noticeMsgType;
	}

	public String getNoticeTeamCode() {
		return noticeTeamCode;
	}

	public void setNoticeTeamCode(String noticeTeamCode) {
		this.noticeTeamCode = noticeTeamCode;
	}

	public int getDownDateCycle() {
		return downDateCycle;
	}

	public void setDownDateCycle(int downDateCycle) {
		this.downDateCycle = downDateCycle;
	}

	public String getIsLikeFileName() {
		return isLikeFileName;
	}

	public void setIsLikeFileName(String isLikeFileName) {
		this.isLikeFileName = isLikeFileName;
	}

	@Override
	public String toString() {
		return "DownFileSet [instNo=" + instNo + ", downExplain=" + downExplain + ", downCode=" + downCode + ", fileRegExp=" + fileRegExp + ", fileType=" + fileType
				+ ", localDir=" + localDir + ", ftpSetCode=" + ftpSetCode + ", remoteDir=" + remoteDir + ", execStatus=" + execStatus + ", isEnable=" + isEnable
				+ ", createUser=" + createUser + ", modifyUser=" + modifyUser + ", def1=" + def1 + ", def2=" + def2 + ", def3=" + def3 + ", noticeTime="
				+ noticeTime + ", noticeMsgType=" + noticeMsgType + ", noticeTeamCode=" + noticeTeamCode + ", downDateCycle=" + downDateCycle + ", isLikeFileName="
				+ isLikeFileName + "]";
	}

}
