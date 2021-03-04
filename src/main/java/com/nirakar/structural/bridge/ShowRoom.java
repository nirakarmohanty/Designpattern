package com.nirakar.structural.bridge;

public abstract class ShowRoom {

	protected Car vechicle;

	protected ShowRoom(Car vehicle) {
		this.vechicle = vehicle;
	}

	public abstract void cost();
}
