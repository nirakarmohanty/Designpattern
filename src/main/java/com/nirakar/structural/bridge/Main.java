package com.nirakar.structural.bridge;

public class Main {

	public static void main(String[] args) {
		ShowRoom c = new BangaloreShowRoom(new HondaCar(), 110);
		ShowRoom c1 = new BangaloreShowRoom(new HyundaiCar(), 190);
		c.cost();
		c1.cost();
	}

}
