/**
 * 
 */
package com.wipro.java.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 */
//check the exception in compile time

public class CheckedException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath="";
		//BufferedReader reads entire line at a time
		//FileReader reads characters from a file
		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			
			String str;
			//readLine() belongs to BufferedReader class reads characters until it encounters new line
 			while((str=br.readLine())!= null) {
				System.out.println(str);
			}
			
		}
		catch(IOException e) {
			System.out.println(e);
		}

	}

}
