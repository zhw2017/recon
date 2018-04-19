package com.pay.recontwo.model;

public class FileTempletSet extends BaseMapperVO {
	/**
	 * 
	 */
	private static final long serialVersionUID = -236043496205500148L;
	/** 文件编码 */
	private String fileCode;
	/** 文件说明 */
	private String fileExplain;
	/** 文件名正则 */
	private String fileRegExp;
	/** 文件名例子 */
	private String fileExample;
	/** 文件来源划分 */
	private String fileSourceDivi;
	/** 文件类型划分 */
	private String fileBusiDivi;
	/** 字符集 */
	private String fileCharacter;
	/** 解析器 */
	private String parseImplClass;
	/** 分割符 */
	private String fileSeparator;
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

	public String getFileSeparator() {
		return fileSeparator;
	}

	public void setFileSeparator(String fileSeparator) {
		this.fileSeparator = fileSeparator;
	}

	public String getFileCharacter() {
		return fileCharacter;
	}

	public void setFileCharacter(String fileCharacter) {
		this.fileCharacter = fileCharacter;
	}

	public String getFileCode() {
		return fileCode;
	}

	public void setFileCode(String fileCode) {
		this.fileCode = fileCode;
	}

	public String getFileExplain() {
		return fileExplain;
	}

	public void setFileExplain(String fileExplain) {
		this.fileExplain = fileExplain;
	}

	public String getFileRegExp() {
		return fileRegExp;
	}

	public void setFileRegExp(String fileRegExp) {
		this.fileRegExp = fileRegExp;
	}

	public String getFileExample() {
		return fileExample;
	}

	public void setFileExample(String fileExample) {
		this.fileExample = fileExample;
	}

	public String getFileSourceDivi() {
		return fileSourceDivi;
	}

	public void setFileSourceDivi(String fileSourceDivi) {
		this.fileSourceDivi = fileSourceDivi;
	}

	public String getFileBusiDivi() {
		return fileBusiDivi;
	}

	public void setFileBusiDivi(String fileBusiDivi) {
		this.fileBusiDivi = fileBusiDivi;
	}

	public String getParseImplClass() {
		return parseImplClass;
	}

	public void setParseImplClass(String parseImplClass) {
		this.parseImplClass = parseImplClass;
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
		return "FileTempletSet [fileCode=" + fileCode + ", fileExplain=" + fileExplain + ", fileRegExp=" + fileRegExp + ", fileExample=" + fileExample
				+ ", fileSourceDivi=" + fileSourceDivi + ", fileBusiDivi=" + fileBusiDivi + ", fileCharacter=" + fileCharacter + ", parseImplClass="
				+ parseImplClass + ", fileSeparator=" + fileSeparator + ", createUser=" + createUser + ", modifyUser=" + modifyUser + ", def1=" + def1 + ", def2="
				+ def2 + ", def3=" + def3 + "]";
	}

}
