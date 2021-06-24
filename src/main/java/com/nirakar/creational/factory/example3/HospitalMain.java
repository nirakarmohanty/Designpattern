package com.nirakar.creational.factory.example3;

public class HospitalMain {

	public static void main(String[] args) {
	
		Hospital instance = HospitalFactory.getInstance("doctor");
		System.out.println(instance);
		

	}

}
