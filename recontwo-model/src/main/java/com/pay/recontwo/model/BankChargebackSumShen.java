package com.pay.recontwo.model;


public class BankChargebackSumShen extends BaseMapperVO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4785421080571382234L;
	/** 对接机构 */
//	@NotBlank
	private String accessInst;
	/** 机构名称 */
	private String instName;
	/** 业务编码 */
	private String busiCode;
	/** 业务名称 */
	private String busiName;
	/** 主体 */
//	@NotBlank
	private String organization;
	/** 对账期间 */
//	@NotBlank
	private String checkPeriod;
	/** 合计 */
	private double totalAmt;
	/** 发送方小计 */
	private double sendSum;
	/** 请款-发送方 */
	private double pleaseAmtSend;
	/** 贷记调整-发送方 */
	private double creditAdjustSend;
	/** 退单-发送方 */
	private double chargebackAmtSend;
	/** 再请款-发送方 */
	private double againPleaseSend;
	/** 二次退单-发送方 */
	private double againChargebackSend;
	/** 退货的再请款-发送方 */
	private double returnPleaseSend;
	/** 退货的二次退单-发送方 */
	private double returnAgentChargeSend;
	/** 转帐贷记调整-发送方 */
	private double transCreditAdjustSend;
	/** 转帐请款-发送方 */
	private double transPleaseSend;
	/** 手工退货-发送方 */
	private double manualReturnSend;
	/** 收费-发送方 */
	private double tollAmtSend;
	/** 付费-发送方 */
	private double paidAmtSend;
	/** 差错例外-发送方 */
	private double chargeExceptiomSend;
	/** 调单回复-发送方 */
	private double orderReplySend;
	/** 差错处理费用-发送方 */
	private double chargebackCostSend;
	/** 接收方小计 */
	private double receiveSum;
	/** 请款-接收方 */
	private double pleaseAmtReceive;
	/** 贷记调整-接收方 */
	private double creditAdjustReceive;
	/** 退单-接收方 */
	private double chargebackAmtReceive;
	/** 再请款-接收方 */
	private double againPleaseReceive;
	/** 二次退单-接收方 */
	private double againChargebackReceive;
	/** 退货的再请款-接收方 */
	private double returnPleaseReceive;
	/** 退货的二次退单-接收方 */
	private double returnAgentChargeReceive;
	/** 转出贷记调整-接收方 */
	private double transOutCreditAdjustReceive;
	/** 转入贷记调整-接收方 */
	private double transInCreditAdjustReceive;
	/** 转出请款-接收方 */
	private double transOutPleaseReceive;
	/** 转入请款-接收方 */
	private double transInPleaseReceive;
	/** 手工退货-接收方 */
	private double manualReturnReceive;
	/** 收费-接收方 */
	private double tollAmtReceive;
	/** 付费-接收方 */
	private double paidAmtReceive;
	/** 差错例外-接收方 */
	private double chargeExceptiomReceive;
	/** 调单回复-接收方 */
	private double orderReplyReceive;
	/** 差错处理费用-接收方 */
	private double chargebackCostReceive;
	/** 可追偿B */
	private double recoverableB;
	/** 利润/损失B */
	private double profitLoss;
	/** 稽核 */
	private double auditingAmt;
	/** 是否复核 */
	private String isReview = "N";
	/** 是否记账 */
	private String isTally = "N";
	/** 创建人 */
	private String createUser;
	/** 修改人 */
	private String modifyUser;
	/** 自定义项3 */
	private String def3;
	/** 自定义项2 */
	private String def2;
	/** 自定义项1 */
	private String def1;
	/** 数值自定义项1 */
	private double ndef1;
	/** 数值自定义项2 */
	private double ndef2;
	/** 数值自定义项3 */
	private double ndef3;
	/** 数值自定义项4 */
	private double ndef4;
	/** 数值自定义项5 */
	private double ndef5;
	/** 数值自定义项6 */
	private double ndef6;

	public String getInstName() {
		return instName;
	}

	public void setInstName(String instName) {
		this.instName = instName;
	}

	public String getAccessInst() {
		return accessInst;
	}

	public void setAccessInst(String accessInst) {
		this.accessInst = accessInst;
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

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getCheckPeriod() {
		return checkPeriod;
	}

	public void setCheckPeriod(String checkPeriod) {
		this.checkPeriod = checkPeriod;
	}

	public double getTotalAmt() {
		return totalAmt;
	}

	public void setTotalAmt(double totalAmt) {
		this.totalAmt = totalAmt;
	}

	public double getSendSum() {
		return sendSum;
	}

	public void setSendSum(double sendSum) {
		this.sendSum = sendSum;
	}

	public double getPleaseAmtSend() {
		return pleaseAmtSend;
	}

	public void setPleaseAmtSend(double pleaseAmtSend) {
		this.pleaseAmtSend = pleaseAmtSend;
	}

	public double getCreditAdjustSend() {
		return creditAdjustSend;
	}

	public void setCreditAdjustSend(double creditAdjustSend) {
		this.creditAdjustSend = creditAdjustSend;
	}

	public double getChargebackAmtSend() {
		return chargebackAmtSend;
	}

	public void setChargebackAmtSend(double chargebackAmtSend) {
		this.chargebackAmtSend = chargebackAmtSend;
	}

	public double getAgainPleaseSend() {
		return againPleaseSend;
	}

	public void setAgainPleaseSend(double againPleaseSend) {
		this.againPleaseSend = againPleaseSend;
	}

	public double getAgainChargebackSend() {
		return againChargebackSend;
	}

	public void setAgainChargebackSend(double againChargebackSend) {
		this.againChargebackSend = againChargebackSend;
	}

	public double getReturnPleaseSend() {
		return returnPleaseSend;
	}

	public void setReturnPleaseSend(double returnPleaseSend) {
		this.returnPleaseSend = returnPleaseSend;
	}

	public double getReturnAgentChargeSend() {
		return returnAgentChargeSend;
	}

	public void setReturnAgentChargeSend(double returnAgentChargeSend) {
		this.returnAgentChargeSend = returnAgentChargeSend;
	}

	public double getTransCreditAdjustSend() {
		return transCreditAdjustSend;
	}

	public void setTransCreditAdjustSend(double transCreditAdjustSend) {
		this.transCreditAdjustSend = transCreditAdjustSend;
	}

	public double getTransPleaseSend() {
		return transPleaseSend;
	}

	public void setTransPleaseSend(double transPleaseSend) {
		this.transPleaseSend = transPleaseSend;
	}

	public double getManualReturnSend() {
		return manualReturnSend;
	}

	public void setManualReturnSend(double manualReturnSend) {
		this.manualReturnSend = manualReturnSend;
	}

	public double getTollAmtSend() {
		return tollAmtSend;
	}

	public void setTollAmtSend(double tollAmtSend) {
		this.tollAmtSend = tollAmtSend;
	}

	public double getPaidAmtSend() {
		return paidAmtSend;
	}

	public void setPaidAmtSend(double paidAmtSend) {
		this.paidAmtSend = paidAmtSend;
	}

	public double getChargeExceptiomSend() {
		return chargeExceptiomSend;
	}

	public void setChargeExceptiomSend(double chargeExceptiomSend) {
		this.chargeExceptiomSend = chargeExceptiomSend;
	}

	public double getOrderReplySend() {
		return orderReplySend;
	}

	public void setOrderReplySend(double orderReplySend) {
		this.orderReplySend = orderReplySend;
	}

	public double getChargebackCostSend() {
		return chargebackCostSend;
	}

	public void setChargebackCostSend(double chargebackCostSend) {
		this.chargebackCostSend = chargebackCostSend;
	}

	public double getReceiveSum() {
		return receiveSum;
	}

	public void setReceiveSum(double receiveSum) {
		this.receiveSum = receiveSum;
	}

	public double getPleaseAmtReceive() {
		return pleaseAmtReceive;
	}

	public void setPleaseAmtReceive(double pleaseAmtReceive) {
		this.pleaseAmtReceive = pleaseAmtReceive;
	}

	public double getCreditAdjustReceive() {
		return creditAdjustReceive;
	}

	public void setCreditAdjustReceive(double creditAdjustReceive) {
		this.creditAdjustReceive = creditAdjustReceive;
	}

	public double getChargebackAmtReceive() {
		return chargebackAmtReceive;
	}

	public void setChargebackAmtReceive(double chargebackAmtReceive) {
		this.chargebackAmtReceive = chargebackAmtReceive;
	}

	public double getAgainPleaseReceive() {
		return againPleaseReceive;
	}

	public void setAgainPleaseReceive(double againPleaseReceive) {
		this.againPleaseReceive = againPleaseReceive;
	}

	public double getAgainChargebackReceive() {
		return againChargebackReceive;
	}

	public void setAgainChargebackReceive(double againChargebackReceive) {
		this.againChargebackReceive = againChargebackReceive;
	}

	public double getReturnPleaseReceive() {
		return returnPleaseReceive;
	}

	public void setReturnPleaseReceive(double returnPleaseReceive) {
		this.returnPleaseReceive = returnPleaseReceive;
	}

	public double getReturnAgentChargeReceive() {
		return returnAgentChargeReceive;
	}

	public void setReturnAgentChargeReceive(double returnAgentChargeReceive) {
		this.returnAgentChargeReceive = returnAgentChargeReceive;
	}

	public double getTransOutCreditAdjustReceive() {
		return transOutCreditAdjustReceive;
	}

	public void setTransOutCreditAdjustReceive(double transOutCreditAdjustReceive) {
		this.transOutCreditAdjustReceive = transOutCreditAdjustReceive;
	}

	public double getTransInCreditAdjustReceive() {
		return transInCreditAdjustReceive;
	}

	public void setTransInCreditAdjustReceive(double transInCreditAdjustReceive) {
		this.transInCreditAdjustReceive = transInCreditAdjustReceive;
	}

	public double getTransOutPleaseReceive() {
		return transOutPleaseReceive;
	}

	public void setTransOutPleaseReceive(double transOutPleaseReceive) {
		this.transOutPleaseReceive = transOutPleaseReceive;
	}

	public double getTransInPleaseReceive() {
		return transInPleaseReceive;
	}

	public void setTransInPleaseReceive(double transInPleaseReceive) {
		this.transInPleaseReceive = transInPleaseReceive;
	}

	public double getManualReturnReceive() {
		return manualReturnReceive;
	}

	public void setManualReturnReceive(double manualReturnReceive) {
		this.manualReturnReceive = manualReturnReceive;
	}

	public double getTollAmtReceive() {
		return tollAmtReceive;
	}

	public void setTollAmtReceive(double tollAmtReceive) {
		this.tollAmtReceive = tollAmtReceive;
	}

	public double getPaidAmtReceive() {
		return paidAmtReceive;
	}

	public void setPaidAmtReceive(double paidAmtReceive) {
		this.paidAmtReceive = paidAmtReceive;
	}

	public double getChargeExceptiomReceive() {
		return chargeExceptiomReceive;
	}

	public void setChargeExceptiomReceive(double chargeExceptiomReceive) {
		this.chargeExceptiomReceive = chargeExceptiomReceive;
	}

	public double getOrderReplyReceive() {
		return orderReplyReceive;
	}

	public void setOrderReplyReceive(double orderReplyReceive) {
		this.orderReplyReceive = orderReplyReceive;
	}

	public double getChargebackCostReceive() {
		return chargebackCostReceive;
	}

	public void setChargebackCostReceive(double chargebackCostReceive) {
		this.chargebackCostReceive = chargebackCostReceive;
	}

	public double getRecoverableB() {
		return recoverableB;
	}

	public void setRecoverableB(double recoverableB) {
		this.recoverableB = recoverableB;
	}

	public double getProfitLoss() {
		return profitLoss;
	}

	public void setProfitLoss(double profitLoss) {
		this.profitLoss = profitLoss;
	}

	public double getAuditingAmt() {
		return auditingAmt;
	}

	public void setAuditingAmt(double auditingAmt) {
		this.auditingAmt = auditingAmt;
	}

	public String getIsReview() {
		return isReview;
	}

	public void setIsReview(String isReview) {
		this.isReview = isReview;
	}

	public String getIsTally() {
		return isTally;
	}

	public void setIsTally(String isTally) {
		this.isTally = isTally;
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

	public String getDef3() {
		return def3;
	}

	public void setDef3(String def3) {
		this.def3 = def3;
	}

	public String getDef2() {
		return def2;
	}

	public void setDef2(String def2) {
		this.def2 = def2;
	}

	public String getDef1() {
		return def1;
	}

	public void setDef1(String def1) {
		this.def1 = def1;
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

	public double getNdef4() {
		return ndef4;
	}

	public void setNdef4(double ndef4) {
		this.ndef4 = ndef4;
	}

	public double getNdef5() {
		return ndef5;
	}

	public void setNdef5(double ndef5) {
		this.ndef5 = ndef5;
	}

	public double getNdef6() {
		return ndef6;
	}

	public void setNdef6(double ndef6) {
		this.ndef6 = ndef6;
	}

	@Override
	public String toString() {
		return "BankChargebackSumShen [accessInst=" + accessInst + ", instName=" + instName + ", busiCode=" + busiCode + ", busiName=" + busiName
				+ ", organization=" + organization + ", checkPeriod=" + checkPeriod + ", totalAmt=" + totalAmt + ", sendSum=" + sendSum + ", pleaseAmtSend="
				+ pleaseAmtSend + ", creditAdjustSend=" + creditAdjustSend + ", chargebackAmtSend=" + chargebackAmtSend + ", againPleaseSend=" + againPleaseSend
				+ ", againChargebackSend=" + againChargebackSend + ", returnPleaseSend=" + returnPleaseSend + ", returnAgentChargeSend=" + returnAgentChargeSend
				+ ", transCreditAdjustSend=" + transCreditAdjustSend + ", transPleaseSend=" + transPleaseSend + ", manualReturnSend=" + manualReturnSend
				+ ", tollAmtSend=" + tollAmtSend + ", paidAmtSend=" + paidAmtSend + ", chargeExceptiomSend=" + chargeExceptiomSend + ", orderReplySend="
				+ orderReplySend + ", chargebackCostSend=" + chargebackCostSend + ", receiveSum=" + receiveSum + ", pleaseAmtReceive=" + pleaseAmtReceive
				+ ", creditAdjustReceive=" + creditAdjustReceive + ", chargebackAmtReceive=" + chargebackAmtReceive + ", againPleaseReceive=" + againPleaseReceive
				+ ", againChargebackReceive=" + againChargebackReceive + ", returnPleaseReceive=" + returnPleaseReceive + ", returnAgentChargeReceive="
				+ returnAgentChargeReceive + ", transOutCreditAdjustReceive=" + transOutCreditAdjustReceive + ", transInCreditAdjustReceive="
				+ transInCreditAdjustReceive + ", transOutPleaseReceive=" + transOutPleaseReceive + ", transInPleaseReceive=" + transInPleaseReceive
				+ ", manualReturnReceive=" + manualReturnReceive + ", tollAmtReceive=" + tollAmtReceive + ", paidAmtReceive=" + paidAmtReceive
				+ ", chargeExceptiomReceive=" + chargeExceptiomReceive + ", orderReplyReceive=" + orderReplyReceive + ", chargebackCostReceive="
				+ chargebackCostReceive + ", recoverableB=" + recoverableB + ", profitLoss=" + profitLoss + ", auditingAmt=" + auditingAmt + ", isReview="
				+ isReview + ", isTally=" + isTally + ", createUser=" + createUser + ", modifyUser=" + modifyUser + ", def3=" + def3 + ", def2=" + def2 + ", def1="
				+ def1 + ", ndef1=" + ndef1 + ", ndef2=" + ndef2 + ", ndef3=" + ndef3 + ", ndef4=" + ndef4 + ", ndef5=" + ndef5 + ", ndef6=" + ndef6 + "]";
	}

}
