package com.nirakar.creational.builder;

public class CarBuilder {
	private String brand;
	private String colour;
	private String year;
	private String review;
	private String isManual;
	private String type;
	private String newOrOld;

	public CarBuilder setBrand(String brand) {
		this.brand = brand;
		return this;
	}

	public CarBuilder setColour(String colour) {
		this.colour = colour;
		return this;
	}

	public CarBuilder setYear(String year) {
		this.year = year;
		return this;
	}

	public CarBuilder setReview(String review) {
		this.review = review;
		return this;
	}

	public CarBuilder setIsManual(String isManual) {
		this.isManual = isManual;
		return this;
	}

	public CarBuilder setType(String type) {
		this.type = type;
		return this;
	}

	public CarBuilder setNewOrOld(String newOrOld) {
		this.newOrOld = newOrOld;
		return this;
	}

	public Car build() {
		return new Car(brand, colour, year, review, isManual, type, newOrOld);
	}
}
