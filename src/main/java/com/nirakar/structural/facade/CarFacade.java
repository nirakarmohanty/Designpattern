package com.nirakar.structural.facade;

public class CarFacade {

	private HondaCar honda;
	private MarutiCar maruti;

	public CarFacade() {
		honda = new HondaCar();
		maruti = new MarutiCar();
	}

	public HondaCar getHondaCar() {
		return honda;
	}

	public MarutiCar getMarutiCar() {
		return maruti;
	}
}
