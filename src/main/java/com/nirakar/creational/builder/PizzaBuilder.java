package com.nirakar.creational.builder;

public class PizzaBuilder {

	String type;// VEG or NonVeg
	String size;// 4 or 8 or 12

	boolean extraCheese;

	public boolean isExtraCheese() {
		return extraCheese;
	}

	public boolean isExtraVegetables() {
		return extraVegetables;
	}

	public boolean isExtraChiken() {
		return extraChiken;
	}

	boolean extraVegetables;
	boolean extraChiken;

	PizzaBuilder(String type, String size) {
		this.type = type;
		this.size = size;
	}

	public Pizza build() {
		return new Pizza(this);
	}
}
