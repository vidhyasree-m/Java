package com.wipro.java.collection;

/**
 * 
 */
public class Array {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaration and allocating memory size of an array
		int[] arr = new int[5];
		//initializing the values
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		//accessing the values based on index value
		System.out.println(arr[0]);
		System.out.println(arr[4]);
		
		//Displaying the values present in the array using for loop
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(i);
		}
		
		
		

	}

}
