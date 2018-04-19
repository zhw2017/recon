package com.pay.recontwo.bean;

import java.io.Serializable;
import java.util.List;


import com.pay.recontwo.model.BaseMapperVO;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class ReturnResult<T extends BaseMapperVO> implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3757081798958065028L;
	/** 继续处理的返回的对象 */
	private List<T> goObject;

	public ReturnResult() {

	}

	public List<T> getGoObject() {
		return goObject;
	}

	public void setGoObject(List<T> goObject) {
		this.goObject = goObject;
	}

}
