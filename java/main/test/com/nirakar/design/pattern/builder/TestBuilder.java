package com.nirakar.design.pattern.builder;

import com.nirakar.creational.builder.Car;
import com.nirakar.creational.builder.CarBuilder;

public class TestBuilder {

	public static void main(String[] args) {
		Car c = new CarBuilder().setBrand("maruti").setColour("Red").build();
		System.out.println(c);

		Car c1 = new CarBuilder().setBrand("Hyundai").setColour("Red").setReview("Very Good").setType("SUV").build();
		System.out.println(c1);

		Car c2 = new CarBuilder().setBrand("Hyundai").setColour("Red").setReview("Very Good").setType("SUV")
				.setNewOrOld(true).build();
		System.out.println(c2);
	}

}
