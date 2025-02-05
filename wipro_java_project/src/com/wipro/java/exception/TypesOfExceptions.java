package com.wipro.java.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TypesOfExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//checked exception 
		try {
			File f = new File("incorrect path");
			FileReader fr = new FileReader(f);
			
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		//unchecked exception
		try {
			int[] numbers = {4,8,9};
			System.out.println(numbers[4]);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		//Arithmetic exception
		try {
			int res = 10%0;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		//NullPointerException
		String str1 = null;
		try {
			int len = str1.length();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
        
	}

}
