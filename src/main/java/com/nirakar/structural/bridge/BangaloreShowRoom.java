package com.nirakar.structural.bridge;

public class BangaloreShowRoom extends ShowRoom {
	Car veCar;
	int value;

	public BangaloreShowRoom(Car vehicle, int value) {
		super(vehicle);
		this.veCar = vehicle;
		this.value = value;
	}

	@Override
	public void cost() {
		veCar.value(value);
	}

}
