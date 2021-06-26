package com.nirakar.creation.abstractfactory;

public class BankFactory {

	public static Bank getInstance(String bank) {

		switch (bank.toLowerCase()) {
		case "sbi":
			return SBI.getInstance();
		case "icici":
			return ICICI.getInstance();
		default:
			return null;
		}
	}

}
