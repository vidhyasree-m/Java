package com.wipro.java.usecase2;

//Subclass for Day Scholars
public class DayScholar extends Student {

        //parameterized constructor
	    public DayScholar(String name, int id, double marks) {
	        super(name, id, marks); //represents the super class variables
	    }

	    @Override
	    public double AdditionalFee() {
	        return 2500; // Transport fee for day scholars
	    }
	
}
