package com.pay.recontwo.model;

public class GenFileForm extends BaseMapperVO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5278939718602764146L;
	/** 配置模板主键 */
	private String fileTempletSetId;
	/** 序号 */
	private int sequence;
	/** 文件字段编码 */
	private String fileFieldCode;
	/** 存储字段名称 */
	private String savleFieldName;
	/** 存储字段编码 */
	private String savleFieldCode;
	/** 存储类型 */
	private String savleFieldType;
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

	public String getFileFieldCode() {
		return fileFieldCode;
	}

	public void setFileFieldCode(String fileFieldCode) {
		this.fileFieldCode = fileFieldCode;
	}

	public String getSavleFieldName() {
		return savleFieldName;
	}

	public void setSavleFieldName(String savleFieldName) {
		this.savleFieldName = savleFieldName;
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
