package com.wipro.java.java8;

/**
 * 
 */
public class StringApi {

	public StringApi() {
		
	}

	public static void main(String[] args) {
         String str1 = "vidhya sree";
         //using length() method to get length of str1
         System.out.println(str1.length());
         //to get the particular character based on index
         System.out.println(str1.charAt(4));
         //using substring method
         System.out.println(str1.substring(3)); //only starting index
         System.out.println(str1.substring(2, 7)); // both start index and end index
         //to check whether a character is present in the string or not
         System.out.println(str1.contains("s"));

	}

}
