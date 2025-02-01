/**
 * 
 */
package com.wipro.java;

/**
 * 
 */
public class Flower {

	/**
	 * 
	 */
	//instance variables
	String name;
	String color;
	
	
	//constructor
	public Flower(String name, String color) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.color = color;
		
	}
	//method 
	void display() {
		System.out.println("Flower name: "+ name +" "+ "Flower color: " + color);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object creation
		Flower obj1 = new Flower("lily","white");
		Flower obj2 = new Flower("tulips","yellow");
		Flower obj3 = new Flower("hibiscus","red");
		obj1.display();
		obj2.display();
		obj3.display();

	}

}
