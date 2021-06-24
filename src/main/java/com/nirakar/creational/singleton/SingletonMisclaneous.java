package com.nirakar.creational.singleton;

public class SingletonMisclaneous {

	private static final SingletonMisclaneous INSTANCE=new SingletonMisclaneous();

	private SingletonMisclaneous() {
	}

	public static SingletonMisclaneous getInstance() {
		return INSTANCE;
	}
}
