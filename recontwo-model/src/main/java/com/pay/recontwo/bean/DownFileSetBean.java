package com.pay.recontwo.bean;

import java.io.Serializable;

public class DownFileSetBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1957208591250353828L;
	/** 下载说明 */
	private String downExplain;
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
	private String isUse;
	/** 创建人 */
	private String createUser;
	/** 创建人 */
	private String modifyUser;

	public String getDownExplain() {
		return downExplain;
	}

	public void setDownExplain(String downExplain) {
		this.downExplain = downExplain;
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

	public String getIsUse() {
		return isUse;
	}

	public void setIsUse(String isUse) {
		this.isUse = isUse;
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

}
