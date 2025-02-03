package com.wipro.java.oops.abstraction;

public class Tesla extends Car {
	@Override
	//implementing the abstract methods
	void carBrand() {
		System.out.println("Car brand:Tesla");
		
	}

	@Override
	void year() {
		System.out.println("Year:2025");
		
	}

	@Override
	void fuelType() {
		System.out.println("Fuel Type:Electric");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj = new Tesla();
		obj.carBrand();
		obj.year();
		obj.fuelType();

	}

	

}
