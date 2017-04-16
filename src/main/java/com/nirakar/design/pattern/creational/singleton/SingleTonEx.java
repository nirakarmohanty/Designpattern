/**
 * Example of Singleton Design Pattern
 */
package com.nirakar.design.pattern.creational.singleton;

/**
 * THis class describes Singleton Design pattern
 * 
 * @author NIRAKAR
 * 
 */
public class SingleTonEx {

	/**
	 * Static initialization of SingleTon Object
	 */
	private static SingleTonEx singletonObject = new SingleTonEx();

	/**
	 * private Constructor
	 */
	private SingleTonEx() {

	}

	/**
	 * Public and Static method which can be accessed out side of the class
	 * 
	 * @return
	 */
	public static SingleTonEx getInstance() {
		synchronized (SingleTonEx.class) {
			synchronized (singletonObject) {
				return singletonObject;
			}

		}
	}

}
