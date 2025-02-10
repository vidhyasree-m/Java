/**
 * Write a program to implement OOPs with collections using java8 features
 */
package com.wipro.java.usecase2;

// Abstract Class (Abstraction)
abstract class Student {
	
	//Declaring Private Variables
	private String name;
    private int id;
    private double marks;

    //Parameterized constructor
    public Student(String name, int id, double marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }
    
    //getter and setter methods
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getMarks() {
        return marks;
    }
    
    //abstract method
    abstract double AdditionalFee();
    
    //overriding the toString() method to return the variable values
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Marks: " + marks;
    }
}



