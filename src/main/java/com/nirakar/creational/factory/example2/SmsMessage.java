package com.nirakar.creational.factory.example2;

public class SmsMessage implements MessageInfo {
	private static final SmsMessage INSTANCE = new SmsMessage();
	
	private String message = "I am in SmsService";
	@Override
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String message(String message) {

		return getMessage() + message;
	}

	public static MessageInfo getInstance() {

		return INSTANCE;
	}

}
