package com.nirakar.creational.factory.example2;

public class EmailMessage implements MessageInfo {
	
	private static final EmailMessage INSTANCE = new EmailMessage();
	
	private EmailMessage() {
		
	}
	private String message ="I am in Email service";

	@Override
	public String message(String message) {
		return this.getMessage() + message;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static MessageInfo getInstance() {

		return INSTANCE;
	}

}
