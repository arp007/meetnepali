package com.nepali36.model.dto;

public class ResponseMessage {
	
	public ResponseMessage(String message){
		this.setMessage(message);
	}
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
