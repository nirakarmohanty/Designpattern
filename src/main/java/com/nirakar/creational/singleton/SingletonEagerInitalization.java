package com.nirakar.creational.singleton;

public class SingletonEagerInitalization {
	// Eager intialization
	private static SingletonEagerInitalization INSTANCE;

	static {
		try {
			INSTANCE = new SingletonEagerInitalization();
		} catch (Exception e) {
			System.out.println("Error catched ");
		}
	}

	private SingletonEagerInitalization() {
	}

	public static SingletonEagerInitalization getInstance() {
		return INSTANCE;
	}
	public static void main(String[] args) {
		System.out.println(" *** "+SingletonEagerInitalization.INSTANCE);
	}
}
