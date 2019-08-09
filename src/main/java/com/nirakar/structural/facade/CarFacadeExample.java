package com.nirakar.structural.facade;

public class CarFacadeExample {
	
	public static void main(String[] args) {
		CarFacade facade=new CarFacade();
		facade.getHondaCar().company();
		facade.getHondaCar().cost();
		
		facade.getMarutiCar().company();
		facade.getMarutiCar().cost();
	}

}
