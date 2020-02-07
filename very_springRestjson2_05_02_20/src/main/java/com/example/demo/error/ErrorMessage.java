package com.example.demo.error;

public class ErrorMessage {
	
	private String message;
	private int  Status;
	private long errorTime;
	
	
	
	
	public ErrorMessage() {
		super();
	}




	public ErrorMessage(String message, int status, long errorTime) {
		super();
		this.message = message;
		Status = status;
		this.errorTime = errorTime;
		
		
		
		
	}




	public String getMessage() {
		return message;
	}




	public void setMessage(String message) {
		this.message = message;
	}




	public int getStatus() {
		return Status;
	}




	public void setStatus(int status) {
		Status = status;
	}




	public long getErrorTime() {
		return errorTime;
	}




	public void setErrorTime(long errorTime) {
		this.errorTime = errorTime;
	}
	
	
	
	
	
	

}
