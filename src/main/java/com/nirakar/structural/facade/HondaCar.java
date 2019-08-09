package com.nirakar.structural.facade;

public class HondaCar implements Car {

	@Override
	public void cost() {
		System.out.println("Honda Car cost you 10 Lakh");

	}

	@Override
	public void company() {
		System.out.println("Its a Honda Type Car !!!!");

	}

}
