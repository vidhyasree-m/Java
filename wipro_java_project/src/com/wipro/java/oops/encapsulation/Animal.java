//write code for encapsulation using animal class
package com.wipro.java.oops.encapsulation;

public class Animal {
	
	//constructor
	public Animal(String name, String type, String color) {
		//calls the parent class object
		super();
		this.name = name;
		this.type = type;
		this.color = color;
	}
	//private variables
	private String name;
	private String type;
	private String color;
	
	
	//getter and setter methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calling the parameterized constructor
		Animal an = new Animal("Lion","Mammal","Golden-Yellow");
		System.out.println(an.getName());
		System.out.println(an.getType());
		System.out.println(an.getColor());
		
		
		an.setName("Elephant");
		an.setType("Mammal");
		an.setColor("Gray");
		System.out.println(an.getName());
		System.out.println(an.getType());
		System.out.println(an.getColor());
		
		

	}

}
