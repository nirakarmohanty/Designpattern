package com.nirakar.creational.factory;

/**
 * This is a factory class which will return the different class name at run
 * time
 * 
 * @author nmohanty
 * 
 */
public class CarFactory {

	private static CarFactory carFactoryObject = new CarFactory();

	/**
	 * Singleton implementation
	 * 
	 * @return
	 */
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
