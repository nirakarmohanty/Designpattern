package com.nirakar.creation.abstractfactory;

public class LoanFacotry {

	public static Loan getInstance(String loan) {

		switch (loan) {
		case "personal":
			return Personal.getInstance();
		case "hoemloan":
			return HomeLoan.getInstance();
		default:
			return null;
		}
	}

}
