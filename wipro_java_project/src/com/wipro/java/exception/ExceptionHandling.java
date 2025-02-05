package com.wipro.java.exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=20, num2=0;
		//using try and catch block to handle the exception
		try {
			int c = num1/num2;
			System.out.println(c);
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
		//the code which we want to execute whether the exception occur or not
		finally {
			System.out.println("Code to be executed");
		}
		System.out.println("rest of code");

	}

}
