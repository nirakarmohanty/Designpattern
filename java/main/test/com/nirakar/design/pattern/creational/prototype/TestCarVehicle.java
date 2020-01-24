package com.nirakar.design.pattern.creational.prototype;

import java.util.List;

import com.nirakar.creational.prototype.CarVehicle;

public class TestCarVehicle {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		CarVehicle carVehicle = new CarVehicle();
		
		List<String> prepareNameList = carVehicle.prepareNameList();
		carVehicle.printBrandDetails(prepareNameList);
		System.out.println("\n");
		
		CarVehicle carVehicleCloneObject = (CarVehicle) carVehicle.clone();
		prepareNameList.remove(0);
		carVehicleCloneObject.printBrandDetails(prepareNameList);
		System.out.println("\n");
		carVehicle.printBrandDetails(prepareNameList);
	}

}
