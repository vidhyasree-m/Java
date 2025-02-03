package com.wipro.java.oops.abstraction;

public class Toyota extends Car {
	@Override
	//implementing the abstract methods
	void carBrand() {
		System.out.println("Car brand:Toyota");
		
	}

	@Override
	void year() {
		System.out.println("Year:2024");
		
	}

	@Override
	void fuelType() {
		System.out.println("Fuel Type:Hybrid");
		
	}

	public static void main(String[] args) {
		Car obj1 = new Toyota();
		obj1.carBrand();
		obj1.year();
		obj1.fuelType();
	

	}

	

}
