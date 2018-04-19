package com.pay.recontwo.model;

public class ClearFileCond extends BaseMapperVO {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1056494487872738499L;
	/** 业务配置主键 */
	private String busiAssSetId;
	/** 条件表达式 */
	private String condExpression;
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

	public String getCondExpression() {
		return condExpression;
	}

	public void setCondExpression(String condExpression) {
		this.condExpression = condExpression;
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
