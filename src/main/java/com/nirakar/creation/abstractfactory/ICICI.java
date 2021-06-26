package com.nirakar.creation.abstractfactory;

public class ICICI implements Bank {

	private static final ICICI INSTANCE = new ICICI();

	@Override
	public void getBank() {
		System.out.println("Getbank in ICCI Bank ");

	}

	public static Bank getInstance() {
		// TODO Auto-generated method stub
		return INSTANCE;
	}

}
