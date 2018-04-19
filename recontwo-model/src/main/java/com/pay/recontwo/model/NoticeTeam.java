package com.pay.recontwo.model;

//import org.hibernate.validator.constraints.NotBlank;

public class NoticeTeam extends BaseMapperVO {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6118381547236161871L;
	/** 通知组编码 */
//	@NotBlank
	private String noticeTeamCode;
	/** 通知组名称 */
//	@NotBlank
	private String noticeTeamName;
	/** 自定义项1 */
	private String def1;
	/** 自定义项2 */
	private String def2;
	/** 自定义项3 */
	private String def3;

	public String getNoticeTeamCode() {
		return noticeTeamCode;
	}

	public void setNoticeTeamCode(String noticeTeamCode) {
		this.noticeTeamCode = noticeTeamCode;
	}

	public String getNoticeTeamName() {
		return noticeTeamName;
	}

	public void setNoticeTeamName(String noticeTeamName) {
		this.noticeTeamName = noticeTeamName;
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
