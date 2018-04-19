package com.pay.recontwo.core.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileParseException extends RuntimeException {
	private static Logger log = LoggerFactory.getLogger(FileParseException.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 7326652449484627244L;

	public FileParseException() {

	}

	public FileParseException(String errorCode, String errorMsg, Exception e) {
		super("errorCode:" + errorCode + ",errorMsg:" + errorMsg + ",exception:" + e.getMessage());
		log.error("errorCode:{},errorMsg:{},exceptionMsg:{}", errorCode, errorMsg, e.getMessage());
	}

	public FileParseException(String errorCode, String errorMsg) {
		super("errorCode:" + errorCode + ",errorMsg:" + errorMsg);
		log.error("errorCode:{},errorMsg:{}", errorCode, errorMsg);

	}

	public FileParseException(String errormsg) {
		super(errormsg);
	}

	public FileParseException(Throwable cause) {
		super(cause);
	}
}
