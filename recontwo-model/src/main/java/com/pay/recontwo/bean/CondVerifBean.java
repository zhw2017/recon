package com.pay.recontwo.bean;

import java.io.Serializable;
import java.util.HashMap;

public class CondVerifBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8364033640369397356L;
	HashMap<String, String> inMap = new HashMap<String, String>();
	HashMap<String, String> ninMap = new HashMap<String, String>();
	String busiAssSetId = null;

	public HashMap<String, String> getInMap() {
		return inMap;
	}

	public void setInMap(HashMap<String, String> inMap) {
		this.inMap = inMap;
	}

	public HashMap<String, String> getNinMap() {
		return ninMap;
	}

	public void setNinMap(HashMap<String, String> ninMap) {
		this.ninMap = ninMap;
	}

	public String getBusiAssSetId() {
		return busiAssSetId;
	}

	public void setBusiAssSetId(String busiAssSetId) {
		this.busiAssSetId = busiAssSetId;
	}

}
