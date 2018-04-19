package com.pay.recontwo.model;

public class MsgFileForm extends BaseMapperVO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4987166043786952555L;
	/** 配置模板主键 */
	private String fileTempletSetId;
	/** 序号 */
	private int sequence;
	/** 报文字段描述 */
	private String msgFieldDesc;
	/** 报文字段长度 */
	private int msgFieldLength;
	/** 是否收缩空格 */
	private String isTrimBlank;
	/** 跳跃单空格 */
	private String isJumpBlank;
	/** 是否使用 */
	private String isUse;
	/** 存储字段 */
	private String savleFieldCode;
	/** 存储类型 */
	private String savleFieldType;
	/** 特殊解析器 */
	private String specialClass;
	/** 自定义项1 */
	private String def1;
	/** 自定义项2 */
	private String def2;
	/** 自定义项3 */
	private String def3;

	public String getFileTempletSetId() {
		return fileTempletSetId;
	}

	public void setFileTempletSetId(String fileTempletSetId) {
		this.fileTempletSetId = fileTempletSetId;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public String getMsgFieldDesc() {
		return msgFieldDesc;
	}

	public void setMsgFieldDesc(String msgFieldDesc) {
		this.msgFieldDesc = msgFieldDesc;
	}

	public int getMsgFieldLength() {
		return msgFieldLength;
	}

	public void setMsgFieldLength(int msgFieldLength) {
		this.msgFieldLength = msgFieldLength;
	}

	public String getIsTrimBlank() {
		return isTrimBlank;
	}

	public void setIsTrimBlank(String isTrimBlank) {
		this.isTrimBlank = isTrimBlank;
	}

	public String getIsJumpBlank() {
		return isJumpBlank;
	}

	public void setIsJumpBlank(String isJumpBlank) {
		this.isJumpBlank = isJumpBlank;
	}

	public String getIsUse() {
		return isUse;
	}

	public void setIsUse(String isUse) {
		this.isUse = isUse;
	}

	public String getSavleFieldCode() {
		return savleFieldCode;
	}

	public void setSavleFieldCode(String savleFieldCode) {
		this.savleFieldCode = savleFieldCode;
	}

	public String getSavleFieldType() {
		return savleFieldType;
	}

	public void setSavleFieldType(String savleFieldType) {
		this.savleFieldType = savleFieldType;
	}

	public String getSpecialClass() {
		return specialClass;
	}

	public void setSpecialClass(String specialClass) {
		this.specialClass = specialClass;
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
