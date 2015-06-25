package com.csc.designpattern.creational;

/**
 * This is a tester class for checking multiple instance creation
 * 
 * @author nmohanty
 * 
 */
public class TestSingleTonExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(SingleTonEx.getInstance());
		System.out.println(SingleTonEx.getInstance());
		System.out.println(SingleTonEx.getInstance());
		System.out.println(SingleTonEx.getInstance());
		System.out.println(SingleTonEx.getInstance());
		System.out.println(SingleTonEx.getInstance());

	}

}
