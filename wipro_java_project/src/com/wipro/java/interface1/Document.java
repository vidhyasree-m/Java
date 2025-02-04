package com.wipro.java.interface1;

public class Document implements Showable, Printable {
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("print");
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("show");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Document d = new Document();
		d.show();
		d.print();

	}



}
