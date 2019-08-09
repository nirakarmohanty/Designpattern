package com.nirakar.design.pattern.singleton;

import com.nirakar.creational.singleton.SingleTonEx;

/**
 * This is a tester class for checking multiple instance creation
 * In this design pattern is used to return Single Object each time whenever its getting called
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
