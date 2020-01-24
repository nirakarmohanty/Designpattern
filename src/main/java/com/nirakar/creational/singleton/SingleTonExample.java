/**
 * Example of Singleton Design Pattern
 */
package com.nirakar.creational.singleton;

/**
 * THis class describes Singleton Design pattern
 * 
 * @author NIRAKAR
 * 
 */
public class SingleTonExample {

	/**
	 * Static initialization of SingleTon Object
	 */
	private static SingleTonExample singletonObject = new SingleTonExample();

	/**
	 * private Constructor
	 */
	private SingleTonExample() {

	}

	/**
	 * Public and Static method which can be accessed out side of the class
	 * 
	 * @return
	 */
	public static SingleTonExample getInstance() {
		synchronized (SingleTonExample.class) {
			synchronized (singletonObject) {
				return singletonObject;
			}

		}
	}

}
