package com.nirakar.creation.abstractfactory;

public class HomeLoan implements Loan {
	private static final HomeLoan INSTANCE= new HomeLoan();
	@Override
	public void getLoan() {
		System.out.println("Get Loan in Home loan");

	}

	public static Loan getInstance() {
		// TODO Auto-generated method stub
		return INSTANCE;
	}

}
