package com.pay.recontwo.bean;

import java.util.Hashtable;

import com.pay.recontwo.model.BankChargebackDetail;

public class BankChargebackDetailShow extends BankChargebackDetail {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7785370324484511010L;
	public double adjustAmount = 0;
	public double reduceFee = 0;
	public double errorFee = 0;

	public double getAdjustAmount() {
		return adjustAmount;
	}

	public void setAdjustAmount(double adjustAmount) {
		this.adjustAmount = adjustAmount;
	}

	public double getReduceFee() {
		return reduceFee;
	}

	public void setReduceFee(double reduceFee) {
		this.reduceFee = reduceFee;
	}

	public double getErrorFee() {
		return errorFee;
	}

	public void setErrorFee(double errorFee) {
		this.errorFee = errorFee;
	}
	

}
