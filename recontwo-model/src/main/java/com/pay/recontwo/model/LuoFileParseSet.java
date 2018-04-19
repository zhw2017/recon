package com.pay.recontwo.model;

public class LuoFileParseSet extends BaseMapperVO {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2743413591956405353L;
	/** 配置模板主键 */
	private String fileTempletSetId;
	/** 文件类型 */
	private String fieldType;
	/** 文件后缀 */
	private String fileSuffix;
	/** 到账时间始末 */
	private String bankDateIndex;
	/** 交易日期格式 */
	private String transTimePattern;
	/** 有效起止行数 */
	private String dataScopeIndex;
	/** 数据分隔符 */
	private String splitWith;
	/** 金额单位 */
	private String unit;
	/** 无效数据前缀字段 */
	private String invalidPrefix;
	/** 撤销字段标识 */
	private String revokeFields;
	/** 数据字段配置 */
	private String fields;
	/** 字段中文标头 */
	private String fieldsTxt;
	/** 字段英文标头 */
	private String fieldsCode;
	/** 数据中文标头 */
	private String dataFieldsTxt;
	/** 数据英文标头 */
	private String dataFieldsCode;
	/** 对账字段组合 */
	private String reconCode;
	/** 消费字段组合 */
	private String transCode;
	/** 撤销字段组合 */
	private String revokeCode;
	/** 交易字段标识 */
	private String transFields;
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

	public String getFieldType() {
		return fieldType;
	}

	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}

	public String getFileSuffix() {
		return fileSuffix;
	}

	public void setFileSuffix(String fileSuffix) {
		this.fileSuffix = fileSuffix;
	}

	public String getBankDateIndex() {
		return bankDateIndex;
	}

	public void setBankDateIndex(String bankDateIndex) {
		this.bankDateIndex = bankDateIndex;
	}

	public String getTransTimePattern() {
		return transTimePattern;
	}

	public void setTransTimePattern(String transTimePattern) {
		this.transTimePattern = transTimePattern;
	}

	public String getDataScopeIndex() {
		return dataScopeIndex;
	}

	public void setDataScopeIndex(String dataScopeIndex) {
		this.dataScopeIndex = dataScopeIndex;
	}

	public String getSplitWith() {
		return splitWith;
	}

	public void setSplitWith(String splitWith) {
		this.splitWith = splitWith;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getInvalidPrefix() {
		return invalidPrefix;
	}

	public void setInvalidPrefix(String invalidPrefix) {
		this.invalidPrefix = invalidPrefix;
	}

	public String getRevokeFields() {
		return revokeFields;
	}

	public void setRevokeFields(String revokeFields) {
		this.revokeFields = revokeFields;
	}

	public String getFields() {
		return fields;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getFieldsTxt() {
		return fieldsTxt;
	}

	public void setFieldsTxt(String fieldsTxt) {
		this.fieldsTxt = fieldsTxt;
	}

	public String getFieldsCode() {
		return fieldsCode;
	}

	public void setFieldsCode(String fieldsCode) {
		this.fieldsCode = fieldsCode;
	}

	public String getDataFieldsTxt() {
		return dataFieldsTxt;
	}

	public void setDataFieldsTxt(String dataFieldsTxt) {
		this.dataFieldsTxt = dataFieldsTxt;
	}

	public String getDataFieldsCode() {
		return dataFieldsCode;
	}

	public void setDataFieldsCode(String dataFieldsCode) {
		this.dataFieldsCode = dataFieldsCode;
	}

	public String getReconCode() {
		return reconCode;
	}

	public void setReconCode(String reconCode) {
		this.reconCode = reconCode;
	}

	public String getTransCode() {
		return transCode;
	}

	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}

	public String getRevokeCode() {
		return revokeCode;
	}

	public void setRevokeCode(String revokeCode) {
		this.revokeCode = revokeCode;
	}

	public String getTransFields() {
		return transFields;
	}

	public void setTransFields(String transFields) {
		this.transFields = transFields;
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
