/**
 * 
 */
package com.wipro.java;

/**
 * 
 */
public class MyClass {

	/**
	 * 
	 */
	int num = 5;
	public MyClass() {
		// TODO Auto-generated constructor stub
	}
	public void changeValue(int num) {
		this.num = num;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating the object
		MyClass obj = new MyClass();
		//calling the method and assigning the value of num 
		obj.changeValue(10);
		//printing the num value 
        System.out.println(obj.num);
	}

}
