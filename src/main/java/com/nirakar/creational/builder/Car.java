package com.nirakar.creational.builder;

public class Car {
	private String brand;
	private String colour;
	private String year;// Year of Manufacture
	private String review;// Great,Average,Lower
	private String isManual;// Manula or Automatic
	private String type;// HatchBack, Sedan, SUV
	private boolean newOrOld;

	public Car(String brand, String colour, String year, String review, String isManual, String type,
			boolean newOrOld) {
		super();
		this.brand = brand;
		this.colour = colour;
		this.year = year;
		this.review = review;
		this.isManual = isManual;
		this.type = type;
		this.newOrOld = newOrOld;
	}

	@Override
	public String toString() {
		return "Car Object - Brand " + this.brand + " Colour " + this.colour + " Year of Manufacture " + this.year
				+ " user Review " + this.review + " Manual or Automatic " + this.isManual + " Type of car is "
				+ this.type + "  New or Old " + this.newOrOld;
	}
}
