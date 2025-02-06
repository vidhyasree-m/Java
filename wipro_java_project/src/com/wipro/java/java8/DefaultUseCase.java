package com.wipro.java.java8;


//interface 1
interface InterfaceOne {
 //default method
	default void display() {
		System.out.println("Interface one display method");
	}
}
//interface 2
interface InterfaceTwo {
	//default method with same name as interface one
	default void display() {
		System.out.println("Interface two display method");
	}
}
public class DefaultUseCase implements InterfaceOne, InterfaceTwo {
	
	//overriding the default methods in interfaceOne and InterfaceTwo
	public void display() {
		System.out.println("calling both interface methods");
		//using super keyword to call the default methods of both interfaces
		InterfaceOne.super.display();//calling interface one default method
		InterfaceTwo.super.display();//calling interface two default method
	}
	

	public static void main(String[] args) {
		//creating object and calling the method
		DefaultUseCase obj = new DefaultUseCase();
		obj.display();

	}

}
