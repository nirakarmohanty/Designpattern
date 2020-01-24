package com.nirakar.creational.singleton;

public class Singleton {

	// Static variable initialization but private in nature
	private static Singleton INSTANCE = null;

	// Private Constructor
	private Singleton() {
	}

	// Entry point to class
	public static Singleton getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Singleton();
		}
		return INSTANCE;
	}
}
