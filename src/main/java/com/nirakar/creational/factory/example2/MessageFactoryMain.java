package com.nirakar.creational.factory.example2;


//Client 
public class MessageFactoryMain {
	

	public static void main(String[] args) {
		
		MessageInfo instance = MessageFactory.getInstance("sms");
		System.out.println(instance);
		//instance.message("Hi this bull need to send through email service");
		System.out.println(instance.getMessage());

	}

}
