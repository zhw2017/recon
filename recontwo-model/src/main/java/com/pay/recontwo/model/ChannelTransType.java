package com.pay.recontwo.model;

public class ChannelTransType extends BaseMapperVO {
	/**
	 * 
	 */
	private static final long serialVersionUID = -691468911103332415L;
	/** 业务配置主键 */
	private String busiAssSetId;
	/** 系统交易类型 */
	private String sysTransType;
	/** 银行报文类型 */
	private String bankMessageType;
	/** 银行交易类型码 */
	private String bankTransType;
	/** 创建人 */
	private String createUser;
	/** 修改人 */
	private String modifyUser;

	public String getBusiAssSetId() {
		return busiAssSetId;
	}

	public void setBusiAssSetId(String busiAssSetId) {
		this.busiAssSetId = busiAssSetId;
	}

	public String getSysTransType() {
		return sysTransType;
	}

	public void setSysTransType(String sysTransType) {
		this.sysTransType = sysTransType;
	}

	public String getBankMessageType() {
		return bankMessageType;
	}

	public void setBankMessageType(String bankMessageType) {
		this.bankMessageType = bankMessageType;
	}

	public String getBankTransType() {
		return bankTransType;
	}

	public void setBankTransType(String bankTransType) {
		this.bankTransType = bankTransType;
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
