package com.pay.recontwo.model;

public class RemoteFtpSet extends BaseMapperVO {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7053972029334027382L;
	/** FTP配置编码 */
	private String ftpSetCode;
	/** FTP配置名称 */
	private String ftpSetName;
	/** 远程地址 */
	private String remoteIp;
	/** 远程端口 */
	private String remotePort;
	/** 登陆名 */
	private String loginName;
	/** 密码 */
	private String password;
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

	public String getFtpSetCode() {
		return ftpSetCode;
	}

	public void setFtpSetCode(String ftpSetCode) {
		this.ftpSetCode = ftpSetCode;
	}

	public String getFtpSetName() {
		return ftpSetName;
	}

	public void setFtpSetName(String ftpSetName) {
		this.ftpSetName = ftpSetName;
	}

	public String getRemoteIp() {
		return remoteIp;
	}

	public void setRemoteIp(String remoteIp) {
		this.remoteIp = remoteIp;
	}

	public String getRemotePort() {
		return remotePort;
	}

	public void setRemotePort(String remotePort) {
		this.remotePort = remotePort;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

}
