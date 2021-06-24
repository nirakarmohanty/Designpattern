package com.nirakar.creational.singleton;

import java.io.Serializable;

public class SingletonLazyInitialization implements Cloneable, Serializable {
	
	private static final long serialVersionUID = 1L;
	
	// Lazy initialization
	private static SingletonLazyInitialization INSTANCE;

	private SingletonLazyInitialization() {
		
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	public Object readResolve() {
		return INSTANCE;
	}

	public static SingletonLazyInitialization getInstance() {
		if (INSTANCE == null) {
			synchronized (SingletonLazyInitialization.class) {
				if (INSTANCE == null) {
					INSTANCE = new SingletonLazyInitialization();
				}
			}
		}
		return INSTANCE;
	}

}
