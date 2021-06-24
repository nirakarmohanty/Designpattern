package com.nirakar.creational.factory.example2;

public class WhatsAppMessage implements MessageInfo {

	private static final WhatsAppMessage INSTANCE= new WhatsAppMessage();
	
	@Override
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private String message ="I am in Whatsapp service";

	@Override
	public String message(String message) {
		return getMessage() + message;
	}

	public static MessageInfo getInstance() {
		
		return INSTANCE;
	}

}
