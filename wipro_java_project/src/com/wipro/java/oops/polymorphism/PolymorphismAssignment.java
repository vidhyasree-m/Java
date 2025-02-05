/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * 
 */

//parent class
class Fruit {
    void fruitName() {
    	System.out.println("Every fruit has a name");
    }
    void fruitColor() {
    	System.out.println("Every fruit has a color");
    }
}
//child class 1
class Apple extends Fruit {
	//overriding the parent class methods
	void fruitName() {
		System.out.println("The name of the fruit is Apple");
		
	}
	void fruitColor() {
		System.out.println("Apple is in red color");
	}
}
//child class 2
class Lemon extends Fruit {
	//overriding the parent class methods
	void fruitName() {
		System.out.println("The name of the fruit is Lemon");
	}
	void fruitColor() {
		System.out.println("Lemon is in yellow color");
	}
}
public class PolymorphismAssignment {
	public static void main(String args[]) {
		Fruit f1 = new Apple();
		f1.fruitName();
		f1.fruitColor();
		
		Fruit f2 = new Lemon();
		f2.fruitName();
		f2.fruitColor();
	}
}
