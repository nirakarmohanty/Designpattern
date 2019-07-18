package com.nirakar.design.pattern.creational.builder;

public class Pizza {
	// Mandatory
	String type;// VEG or NonVeg
	String size;// 4 or 8 or 12
	// Optional
	boolean extraCheese;
	boolean extraVegetables;
	boolean extraChiken;

	public void setType(String type) {
		this.type = type;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void setExtraCheese(boolean extraCheese) {
		this.extraCheese = extraCheese;
	}

	public void setExtraVegetables(boolean extraVegetables) {
		this.extraVegetables = extraVegetables;
	}

	public void setExtraChiken(boolean extraChiken) {
		this.extraChiken = extraChiken;
	}

	Pizza(PizzaBuilder builder) {

		this.type = builder.type;
		this.size = builder.size;
		this.extraCheese = builder.extraCheese;
		this.extraVegetables = builder.extraVegetables;
		this.extraChiken = builder.extraChiken;
	}
}
