/**
 * 
 */
package com.wipro.java.oops;

/** 
 * parent class = Employee
 * child class = Manager
 * Extends = is a keyword
 * 
 */
public class Manager extends Employee {

	/**
	 * 
	 */
	public Manager() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Manager();
		emp1.setEmpId(789);
		emp1.setEmpName("alex");
		emp1.setEmpSalary(50000f);
		
		System.out.println(emp1.getEmpId());
		System.out.println(emp1.getEmpName());
		System.out.println(emp1.getEmpSalary());

	}

}
