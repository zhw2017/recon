package com.pay.recontwo.model;

public class BusiAssSet extends BaseMapperVO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1335302568818835585L;
	/** 机构编码 */
	private String instNo;
	/** 业务大类 */
	private String busiType;
	/** 业务编码 */
	private String busiCode;
	/** 业务名称 */
	private String busiName;
	/** 数据划分 */
	private String dataDivi;
	/** 主体 */
	private String organization;
	/** 资金结算账户编码 */
	private String fundSettleAccCode;
	/** 资金结算账户名称 */
	private String fundSettleAccName;
	/** 资金账户类型 */
	private String fundAccType;
	/** 资金结算周期 */
	private String fundSettleCycle;
	/** 清算周期 */
	private String clearCycle;
	/** 复核后自动记账 */
	private String checkComplTally;
	/** 默认银行通道 */
	private String defaultChannel;
	/** 是否对账 */
	private String isCheck;
	/** 是否资金核对 */
	private String isFundCheck;
	/** 是否差错处理 */
	private String isChargeHandle;
	/** 中断条数 */
	private int interruptNum;
	/** 对账执行状态 */
	private String execStatus;
	/** 通知类型 */
	private String noticeType;
	/** 通知组编码 */
	private String noticeTeamCode;
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

	public String getIsFundCheck() {
		return isFundCheck;
	}

	public void setIsFundCheck(String isFundCheck) {
		this.isFundCheck = isFundCheck;
	}

	public String getDefaultChannel() {
		return defaultChannel;
	}

	public void setDefaultChannel(String defaultChannel) {
		this.defaultChannel = defaultChannel;
	}

	public int getInterruptNum() {
		return interruptNum;
	}

	public void setInterruptNum(int interruptNum) {
		this.interruptNum = interruptNum;
	}

	public String getInstNo() {
		return instNo;
	}

	public void setInstNo(String instNo) {
		this.instNo = instNo;
	}

	public String getBusiType() {
		return busiType;
	}

	public void setBusiType(String busiType) {
		this.busiType = busiType;
	}

	public String getBusiCode() {
		return busiCode;
	}

	public void setBusiCode(String busiCode) {
		this.busiCode = busiCode;
	}

	public String getBusiName() {
		return busiName;
	}

	public void setBusiName(String busiName) {
		this.busiName = busiName;
	}

	public String getDataDivi() {
		return dataDivi;
	}

	public void setDataDivi(String dataDivi) {
		this.dataDivi = dataDivi;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getFundSettleAccCode() {
		return fundSettleAccCode;
	}

	public void setFundSettleAccCode(String fundSettleAccCode) {
		this.fundSettleAccCode = fundSettleAccCode;
	}

	public String getFundSettleAccName() {
		return fundSettleAccName;
	}

	public void setFundSettleAccName(String fundSettleAccName) {
		this.fundSettleAccName = fundSettleAccName;
	}

	public String getFundAccType() {
		return fundAccType;
	}

	public void setFundAccType(String fundAccType) {
		this.fundAccType = fundAccType;
	}

	public String getFundSettleCycle() {
		return fundSettleCycle;
	}

	public void setFundSettleCycle(String fundSettleCycle) {
		this.fundSettleCycle = fundSettleCycle;
	}

	public String getClearCycle() {
		return clearCycle;
	}

	public void setClearCycle(String clearCycle) {
		this.clearCycle = clearCycle;
	}

	public String getCheckComplTally() {
		return checkComplTally;
	}

	public void setCheckComplTally(String checkComplTally) {
		this.checkComplTally = checkComplTally;
	}

	public String getIsCheck() {
		return isCheck;
	}

	public void setIsCheck(String isCheck) {
		this.isCheck = isCheck;
	}

	public String getIsChargeHandle() {
		return isChargeHandle;
	}

	public void setIsChargeHandle(String isChargeHandle) {
		this.isChargeHandle = isChargeHandle;
	}

	public String getExecStatus() {
		return execStatus;
	}

	public void setExecStatus(String execStatus) {
		this.execStatus = execStatus;
	}

	public String getNoticeType() {
		return noticeType;
	}

	public void setNoticeType(String noticeType) {
		this.noticeType = noticeType;
	}

	public String getNoticeTeamCode() {
		return noticeTeamCode;
	}

	public void setNoticeTeamCode(String noticeTeamCode) {
		this.noticeTeamCode = noticeTeamCode;
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
		return "BusiAssSet [instNo=" + instNo + ", busiType=" + busiType + ", busiCode=" + busiCode + ", busiName=" + busiName + ", dataDivi=" + dataDivi
				+ ", organization=" + organization + ", fundSettleAccCode=" + fundSettleAccCode + ", fundSettleAccName=" + fundSettleAccName + ", fundAccType="
				+ fundAccType + ", fundSettleCycle=" + fundSettleCycle + ", clearCycle=" + clearCycle + ", checkComplTally=" + checkComplTally + ", isCheck="
				+ isCheck + ", isChargeHandle=" + isChargeHandle + ", execStatus=" + execStatus + ", noticeType=" + noticeType + ", noticeTeamCode="
				+ noticeTeamCode + ", createUser=" + createUser + ", modifyUser=" + modifyUser + ", def1=" + def1 + ", def2=" + def2 + ", def3=" + def3 + "]";
	}

}
