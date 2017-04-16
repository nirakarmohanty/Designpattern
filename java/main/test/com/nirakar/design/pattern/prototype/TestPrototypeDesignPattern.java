package com.nirakar.design.pattern.prototype;

import com.nirakar.design.pattern.creational.prototype.PrototypeDesignPattern;

public class TestPrototypeDesignPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		PrototypeDesignPattern object = new PrototypeDesignPattern();
		try {
			System.out.println(object.getInstance());
			System.out.println(object);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
