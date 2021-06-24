package com.nirakar.creational.factory.example3;

public class HospitalFactory {

	public static Hospital getInstance(String departmentName) {
		switch (departmentName) {
		case "doctor":
			return Doctor.getInstance();
		default:
			return null;
		}
	}
}
