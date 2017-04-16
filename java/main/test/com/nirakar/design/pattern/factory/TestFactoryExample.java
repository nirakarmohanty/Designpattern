package com.nirakar.design.pattern.factory;

import com.nirakar.design.pattern.creational.factory.Car;
import com.nirakar.design.pattern.creational.factory.CarFactory;

public class TestFactoryExample {

	/** This is a tester class to test Factory design pattern 
	 * @param args
	 */
	public static void main(String[] args) {

		CarFactory carfactoryObj = CarFactory.getInstance();
		System.out.println("---------------------");
		Car carObject1 = carfactoryObj.getInstace("maruthi");
		carObject1.getCarName();
		System.out.println("----- Maruthi class Instantiate -------------");
		Car carObject2 = carfactoryObj.getInstace("hundai");
		carObject2.getCarName();
		System.out.println("----- Hundai class Instantiate -------------");
		Car carObject3 = carfactoryObj.getInstace("mahindra");
		carObject3.getCarName();
		System.out.println("----- Mahindra class Instantiate -------------");
	}

}
 
