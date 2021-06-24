package com.nirakar.creational.factory.example2;

public class MessageFactory {

	public static MessageInfo getInstance(String messageType) {
		switch (messageType.toLowerCase()) {
		case "whatsapp":
			return WhatsAppMessage.getInstance();
		case "sms":
			return SmsMessage.getInstance();
		case "email":
			return EmailMessage.getInstance();
		default:
			return null;
		}
	}

}
