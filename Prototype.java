package com.csc.designpattern.creational;

/**
 * Prototype design pattern is nothing but its cloning of Object. THis is
 * another type of creational design pattern because , we are creating object
 * here
 * 
 * @author nmohanty
 * 
 */
public class PrototypeDesignPattern implements Cloneable {

	PrototypeDesignPattern getInstance() throws CloneNotSupportedException {
		return (PrototypeDesignPattern) super.clone();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		PrototypeDesignPattern object = new PrototypeDesignPattern();
		try {
			System.out.println(object.getInstance());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
