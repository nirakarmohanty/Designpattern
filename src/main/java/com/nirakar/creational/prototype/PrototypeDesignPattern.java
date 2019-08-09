package com.nirakar.creational.prototype;

/**
 * Prototype design pattern is nothing but its cloning of Object. THis is
 * another type of creational design pattern because , we are creating object
 * here
 * 
 * @author nmohanty
 * 
 */
public class PrototypeDesignPattern implements Cloneable {

	public PrototypeDesignPattern getInstance() throws CloneNotSupportedException {
		return (PrototypeDesignPattern) super.clone();
	}

	
}
