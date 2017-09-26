package com.decorate.ssm.exception;

/**
 * 自定义的异常，对预期的异常进行抛出
 * @author Silence
 *
 */
public class MyException extends Exception{
	private String message;
	private String code;
	
	
	public MyException(String message, String code) {
		super(message);
		this.message = message;
		this.code = code;
	}
	
	
	public MyException(String message) {
		super(message);
		this.message = message;
	}


	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
}
