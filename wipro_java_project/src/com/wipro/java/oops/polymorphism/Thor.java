/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * 
 */
public class Thor extends Car {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj1 = new Thor();
		obj1.setBrand("thor");
		obj1.setColor("Black");
		
		System.out.println(obj1.getBrand());
		System.out.println(obj1.getColor());
		

	}

}
