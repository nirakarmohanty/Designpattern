package com.nirakar.creation.abstractfactory;

public class SBI implements Bank {

	private static final Bank INSTANCE = new SBI();

	@Override
	public void getBank() {
		System.out.println("Getbank in SBI Bank ");

	}

	public static Bank getInstance() {

		return INSTANCE;
	}

}
