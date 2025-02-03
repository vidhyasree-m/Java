package com.wipro.java.oops.polymorphism;

public class MaruthiSuzuki extends Car {
	
	
	
	public void carName() {
		System.out.println("The Car Name is Maruthi Suzuki");
	}
	public void carColor() {
		System.out.println("The car color is red");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj1 = new MaruthiSuzuki();
		obj1.setBrand("Maruti Suzuki Swift");
		obj1.setColor("Red");
		
		System.out.println(obj1.getBrand());
		System.out.println(obj1.getColor());
		
        
        
	}

}
