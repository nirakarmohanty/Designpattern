package com.nirakar.structural.bridge;

public class HyundaiCar implements Car {

	@Override
	public void value(int value) {
		System.out.println("Hyundai Values!!" + value);
	}

}
