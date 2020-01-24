package com.nirakar.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class CarVehicle {
	
	private List<String> brandNames = new ArrayList<String>();;
	private List<String> carBrandNames;

	public CarVehicle() {
	}

	public List<String> prepareNameList() {

		brandNames.add("Maruti");
		brandNames.add("Hyundai");
		brandNames.add("Honda");
		brandNames.add("Toyota");
		return brandNames;
	}

	public CarVehicle(List<String> carBrandNames) {
		this.carBrandNames = carBrandNames;
	}

	public List<String> getBrandNames(List<String> brandnames) {
		return brandnames;
	}

	public void printBrandDetails(List<String> brandList) {
		brandList.forEach(brand -> {
			System.out.print(brand +"\t");
			
		});
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> tempBrandName = new ArrayList<String>();

		brandNames.forEach(brandName -> {
			tempBrandName.add(brandName);
		});

		return new CarVehicle(tempBrandName);
	}

}
