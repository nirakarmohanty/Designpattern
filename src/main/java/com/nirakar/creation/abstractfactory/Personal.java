package com.nirakar.creation.abstractfactory;

public class Personal implements Loan {
	private static final Personal INSTANCE= new Personal();
	@Override
	public void getLoan() {

		System.out.println("Personal loan ");
	}

	public static Loan getInstance() {
		// TODO Auto-generated method stub
		return INSTANCE;
	}

}
