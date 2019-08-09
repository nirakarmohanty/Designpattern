package com.nirakar.structural.facade;

public class MarutiCar implements Car {

	@Override
	public void cost() {
		System.out.println("Honda Car cost you 5 Lakh");
	}

	@Override
	public void company() {
		System.out.println("Its a Maruti Type Car !!!!");
	}
}
