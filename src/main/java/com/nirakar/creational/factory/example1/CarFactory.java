package com.nirakar.creational.factory.example1;

/**
 * This is a factory class which will return the different class name at run
 * time
 * 
 * @author nmohanty
 * 
 */
public class CarFactory {

	private static CarFactory carFactoryObject = new CarFactory();
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		return carFactoryObject;
	}

	public Car getInstace(String carName) {
		if (carName.equalsIgnoreCase("maruthi"))
			return new Maruti();
		if (carName.equalsIgnoreCase("mahindra"))
			return new Mahindra();
		if (carName.equalsIgnoreCase("hundai"))
			return new Hundai();
		else
			return null;
	}

}
