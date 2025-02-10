package com.wipro.java.usecase2;

//Subclass for Hostel Students
public class HostelStudent extends Student {
	
	//parameterized constructor 
	 public HostelStudent(String name, int id, double marks) {
	     super(name, id, marks); //represents the super class instance variables
	 }
	
	 @Override
	 public double AdditionalFee() {
	     return 8000; // Hostel  fee
	 }
}
