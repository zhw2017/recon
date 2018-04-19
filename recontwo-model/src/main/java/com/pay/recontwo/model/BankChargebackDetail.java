package com.pay.recontwo.model;

import java.util.Date;

public class BankChargebackDetail extends BaseMapperVO {
	/**
	 *
	 */
	private static final long serialVersionUID = -8945166647286313716L;
	/** 对接机构 */
	private String accessInst;
	/** 业务大类 */
	private String busiType;
	/** 业务编码 */
	private String busiCode;
	/** 业务名称 */
	private String busiName;
	/** 对账期间 */
	private String checkPeriod;
	/** 主体 */
	private String organization;
	/** 文件名 */
	private String fileName;
	/** 资金结算账户编码 */
	private String fundSettleAccCode;
	/** 资金结算账户名称 */
	private String fundSettleAccName;
	/** 支付通道编码 */
	private String payChannelCode;
	/** 核对流水号 */
	private String checkId;
	/** 银行清算时间 */
	private String bankClearDate;
	/** 银行结算日期 */
	private String bankSettleDate;
	/** 清算机构 */
	private String clearInst;
	/** 收单机构 */
	private String transInst;
	/** 发卡方 */
	private String cardOfbank;
	/** 卡号 */
	private String pan;
	/** 差错交易日期 */
	private Date chabakTransTime;
	/** 差错交易标志 */
	private String errorTransMark;
	/** 跟踪号 */
	private String trackNo;
	/** 交易金额 */
	private double transAmt;
	/** 受理方应收手续费 */
	private double recipReceiveFee;
	/** 受理方应付手续费 */
	private double recipHandleFee;
	/** 应收费用 */
	private double chabakReceiveFee;
	/** 应付费用 */
	private double chabakHandleFee;
	/** 分期付款手续费 */
	private double stagingPayFee;
	/** 持卡人交易手续费 */
	private double cardTransFee;
	/** 交易渠道 */
	private String transChannel;
	/** 原因码 */
	private String reasonCode;
	/** 原交易参考号 */
	private String oriBankExternalId;
	/** 原交易类型 */
	private String oriTransType;
	/** 原交易日期 */
	private Date oriTransTime;
	/** 原跟踪号 */
	private String oriTrackNo;
	/** 原交易金额 */
	private double oriTransAmt;
	/** 商户代码 */
	private String bankCustomerNo;
	/** 终端编号 */
	private String terminalNo;
	/** 原始的交易代码 */
	private String oriTransCode;
	/** 订单号 */
	private String bankOrderNo;
	/** 交易发起方式 */
	private String transHowInit;
	/** 账户结算类型 */
	private String accSettleType;
	/** 是否长款 */
	private String isOvercharged;
	/** 是否记账 */
	private String isTally = "N";
	/** 是否复核 */
	private String isReview = "N";
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
	/** 数值自定义项1 */
	private double ndef1;
	/** 数值自定义项2 */
	private double ndef2;
	/** 数值自定义项3 */
	private double ndef3;
	/** add by jigz for errora 20170214 */
	/** 追加原交易类型 */
	private String appendOriTransType;
	/** 追加商户手续费 */
	private double appendCustomerFee;
	/** 差错借贷方向 */
	private String errorDirection;

	public BankChargebackDetail() {}

	public String getIsOvercharged() {
		return isOvercharged;
	}

	public void setIsOvercharged(String isOvercharged) {
		this.isOvercharged = isOvercharged;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getAccessInst() {
		return accessInst;
	}

	public void setAccessInst(String accessInst) {
		this.accessInst = accessInst;
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

	public String getCheckPeriod() {
		return checkPeriod;
	}

	public void setCheckPeriod(String checkPeriod) {
		this.checkPeriod = checkPeriod;
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

	public String getPayChannelCode() {
		return payChannelCode;
	}

	public void setPayChannelCode(String payChannelCode) {
		this.payChannelCode = payChannelCode;
	}

	public String getCheckId() {
		return checkId;
	}

	public void setCheckId(String checkId) {
		this.checkId = checkId;
	}

	public String getBankClearDate() {
		return bankClearDate;
	}

	public void setBankClearDate(String bankClearDate) {
		this.bankClearDate = bankClearDate;
	}

	public String getBankSettleDate() {
		return bankSettleDate;
	}

	public void setBankSettleDate(String bankSettleDate) {
		this.bankSettleDate = bankSettleDate;
	}

	public String getClearInst() {
		return clearInst;
	}

	public void setClearInst(String clearInst) {
		this.clearInst = clearInst;
	}

	public String getTransInst() {
		return transInst;
	}

	public void setTransInst(String transInst) {
		this.transInst = transInst;
	}

	public String getCardOfbank() {
		return cardOfbank;
	}

	public void setCardOfbank(String cardOfbank) {
		this.cardOfbank = cardOfbank;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public Date getChabakTransTime() {
		return chabakTransTime;
	}

	public void setChabakTransTime(Date chabakTransTime) {
		this.chabakTransTime = chabakTransTime;
	}

	public String getErrorTransMark() {
		return errorTransMark;
	}

	public void setErrorTransMark(String errorTransMark) {
		this.errorTransMark = errorTransMark;
	}

	public String getTrackNo() {
		return trackNo;
	}

	public void setTrackNo(String trackNo) {
		this.trackNo = trackNo;
	}

	public double getTransAmt() {
		return transAmt;
	}

	public void setTransAmt(double transAmt) {
		this.transAmt = transAmt;
	}

	public double getRecipReceiveFee() {
		return recipReceiveFee;
	}

	public void setRecipReceiveFee(double recipReceiveFee) {
		this.recipReceiveFee = recipReceiveFee;
	}

	public double getRecipHandleFee() {
		return recipHandleFee;
	}

	public void setRecipHandleFee(double recipHandleFee) {
		this.recipHandleFee = recipHandleFee;
	}

	public double getChabakReceiveFee() {
		return chabakReceiveFee;
	}

	public void setChabakReceiveFee(double chabakReceiveFee) {
		this.chabakReceiveFee = chabakReceiveFee;
	}

	public double getChabakHandleFee() {
		return chabakHandleFee;
	}

	public void setChabakHandleFee(double chabakHandleFee) {
		this.chabakHandleFee = chabakHandleFee;
	}

	public double getStagingPayFee() {
		return stagingPayFee;
	}

	public void setStagingPayFee(double stagingPayFee) {
		this.stagingPayFee = stagingPayFee;
	}

	public double getCardTransFee() {
		return cardTransFee;
	}

	public void setCardTransFee(double cardTransFee) {
		this.cardTransFee = cardTransFee;
	}

	public String getTransChannel() {
		return transChannel;
	}

	public void setTransChannel(String transChannel) {
		this.transChannel = transChannel;
	}

	public String getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getOriBankExternalId() {
		return oriBankExternalId;
	}

	public void setOriBankExternalId(String oriBankExternalId) {
		this.oriBankExternalId = oriBankExternalId;
	}

	public String getOriTransType() {
		return oriTransType;
	}

	public void setOriTransType(String oriTransType) {
		this.oriTransType = oriTransType;
	}

	public Date getOriTransTime() {
		return oriTransTime;
	}

	public void setOriTransTime(Date oriTransTime) {
		this.oriTransTime = oriTransTime;
	}

	public String getOriTrackNo() {
		return oriTrackNo;
	}

	public void setOriTrackNo(String oriTrackNo) {
		this.oriTrackNo = oriTrackNo;
	}

	public double getOriTransAmt() {
		return oriTransAmt;
	}

	public void setOriTransAmt(double oriTransAmt) {
		this.oriTransAmt = oriTransAmt;
	}

	public String getBankCustomerNo() {
		return bankCustomerNo;
	}

	public void setBankCustomerNo(String bankCustomerNo) {
		this.bankCustomerNo = bankCustomerNo;
	}

	public String getTerminalNo() {
		return terminalNo;
	}

	public void setTerminalNo(String terminalNo) {
		this.terminalNo = terminalNo;
	}

	public String getOriTransCode() {
		return oriTransCode;
	}

	public void setOriTransCode(String oriTransCode) {
		this.oriTransCode = oriTransCode;
	}

	public String getBankOrderNo() {
		return bankOrderNo;
	}

	public void setBankOrderNo(String bankOrderNo) {
		this.bankOrderNo = bankOrderNo;
	}

	public String getTransHowInit() {
		return transHowInit;
	}

	public void setTransHowInit(String transHowInit) {
		this.transHowInit = transHowInit;
	}

	public String getAccSettleType() {
		return accSettleType;
	}

	public void setAccSettleType(String accSettleType) {
		this.accSettleType = accSettleType;
	}

	public String getIsTally() {
		return isTally;
	}

	public void setIsTally(String isTally) {
		this.isTally = isTally;
	}

	public String getIsReview() {
		return isReview;
	}

	public void setIsReview(String isReview) {
		this.isReview = isReview;
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

	public double getNdef1() {
		return ndef1;
	}

	public void setNdef1(double ndef1) {
		this.ndef1 = ndef1;
	}

	public double getNdef2() {
		return ndef2;
	}

	public void setNdef2(double ndef2) {
		this.ndef2 = ndef2;
	}

	public double getNdef3() {
		return ndef3;
	}

	public void setNdef3(double ndef3) {
		this.ndef3 = ndef3;
	}

	public String getAppendOriTransType() {
		return appendOriTransType;
	}

	public void setAppendOriTransType(String appendOriTransType) {
		this.appendOriTransType = appendOriTransType;
	}

	public double getAppendCustomerFee() {
		return appendCustomerFee;
	}

	public void setAppendCustomerFee(double appendCustomerFee) {
		this.appendCustomerFee = appendCustomerFee;
	}

	public String getErrorDirection() {
		return errorDirection;
	}

	public void setErrorDirection(String errorDirection) {
		this.errorDirection = errorDirection;
	}

	@Override
	public String toString() {
		return "BankChargebackDetail [accessInst=" + accessInst + ", busiType=" + busiType + ", busiCode=" + busiCode + ", busiName=" + busiName + ", checkPeriod="
				+ checkPeriod + ", organization=" + organization + ", fileName=" + fileName + ", fundSettleAccCode=" + fundSettleAccCode + ", fundSettleAccName="
				+ fundSettleAccName + ", payChannelCode=" + payChannelCode + ", checkId=" + checkId + ", bankClearDate=" + bankClearDate + ", bankSettleDate="
				+ bankSettleDate + ", clearInst=" + clearInst + ", transInst=" + transInst + ", cardOfbank=" + cardOfbank + ", pan=" + pan + ", chabakTransTime="
				+ chabakTransTime + ", errorTransMark=" + errorTransMark + ", trackNo=" + trackNo + ", transAmt=" + transAmt + ", recipReceiveFee="
				+ recipReceiveFee + ", recipHandleFee=" + recipHandleFee + ", chabakReceiveFee=" + chabakReceiveFee + ", chabakHandleFee=" + chabakHandleFee
				+ ", stagingPayFee=" + stagingPayFee + ", cardTransFee=" + cardTransFee + ", transChannel=" + transChannel + ", reasonCode=" + reasonCode
				+ ", oriBankExternalId=" + oriBankExternalId + ", oriTransType=" + oriTransType + ", oriTransTime=" + oriTransTime + ", oriTrackNo=" + oriTrackNo
				+ ", oriTransAmt=" + oriTransAmt + ", bankCustomerNo=" + bankCustomerNo + ", terminalNo=" + terminalNo + ", oriTransCode=" + oriTransCode
				+ ", bankOrderNo=" + bankOrderNo + ", transHowInit=" + transHowInit + ", accSettleType=" + accSettleType + ", isOvercharged=" + isOvercharged
				+ ", isTally=" + isTally + ", isReview=" + isReview + ", createUser=" + createUser + ", modifyUser=" + modifyUser + ", def1=" + def1 + ", def2="
				+ def2 + ", def3=" + def3 + ", ndef1=" + ndef1 + ", ndef2=" + ndef2 + ", ndef3=" + ndef3 + ", appendOriTransType=" + appendOriTransType
				+ ", appendCustomerFee=" + appendCustomerFee + ", errorDirection=" + errorDirection + "]";
	}

}
