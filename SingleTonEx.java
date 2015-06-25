/**
 * Example of Singleton Design Pattern
 */
package com.csc.designpattern.creational;

/**
 * @author nmohanty
 *
 */
public class SingleTonEx {

	private static SingleTonEx singletonObject = new SingleTonEx(); 
	
	/**
	 * private Constructor 
	 */
	private SingleTonEx() {
	
	}
	
	/** Public ans Static method which can be accessed out side of the class
	 * @return
	 */
	public static SingleTonEx getInstance(){
		synchronized (SingleTonEx.class) {
			synchronized (singletonObject){
				return singletonObject;
			}
				
		}
	}

	
}
