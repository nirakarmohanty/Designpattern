package com.nirakar.design.pattern.singleton;

import com.nirakar.creational.singleton.Singleton;

public class TestSingleton {

	public static void main(String[] args) {
		Singleton obj = Singleton.getInstance();
		System.out.println(obj);
		
		Singleton obj1 = Singleton.getInstance();
		System.out.println(obj1);
		
		Singleton obj2 = Singleton.getInstance();
		System.out.println(obj2);
	}

}
