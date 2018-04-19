package com.pay.recontwo.model;

public class SysPayChannel extends BaseMapperVO {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7979260512988978791L;
	/** 业务配置主键 */
	private String busiAssSetId;
	/** 支付通道编码 */
	private String payChannelCode;
	/** 支付通道名称 */
	private String payChannelName;
	/** 启用状态 */
	private String isEnable;
	/** 自定义项1 */
	private String def1;
	/** 自定义项2 */
	private String def2;
	/** 自定义项3 */
	private String def3;

	public String getBusiAssSetId() {
		return busiAssSetId;
	}

	public void setBusiAssSetId(String busiAssSetId) {
		this.busiAssSetId = busiAssSetId;
	}

	public String getPayChannelCode() {
		return payChannelCode;
	}

	public void setPayChannelCode(String payChannelCode) {
		this.payChannelCode = payChannelCode;
	}

	public String getPayChannelName() {
		return payChannelName;
	}

	public void setPayChannelName(String payChannelName) {
		this.payChannelName = payChannelName;
	}

	public String getIsEnable() {
		return isEnable;
	}

	public void setIsEnable(String isEnable) {
		this.isEnable = isEnable;
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
