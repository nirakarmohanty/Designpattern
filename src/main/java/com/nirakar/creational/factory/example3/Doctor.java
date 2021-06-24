package com.nirakar.creational.factory.example3;

public class Doctor implements Hospital {

	private static Doctor INSTANCE = new Doctor();
	@Override
	public String callDepartment() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Hospital getInstance() {		
		return INSTANCE;
	}

}
