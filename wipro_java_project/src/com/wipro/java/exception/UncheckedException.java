package com.wipro.java.exception;

public class UncheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 6, num2 = 0;
		String str = null;
		//Arithmetic exception
		try {
			int c = num1 / num2;
			System.out.println(c);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		//NullPointerException
		try {
			int len = str.length();
			System.out.println(len);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		//ArrayIndexOutOfBoundException
		try {
			int[] nums = {1,2,3,4,5};
			System.out.println(nums[6]);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
