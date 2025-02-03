/**
 * 
 */
package com.wipro.java.oops.inheritance;

/**
 * parent class = Employee
 * child class = Developer
 * Extends = is a keyword
 */
public class Developer extends Employee {

	/**
	 * 
	 */
	public Developer() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Developer dp1 = new Developer();
		Employee emp1 = new Developer();
		emp1.setEmpId(456);
		emp1.setEmpName("clarie");
		emp1.setEmpSalary(32000f);
		
		System.out.println(emp1.getEmpId());
		System.out.println(emp1.getEmpName());
		System.out.println(emp1.getEmpSalary());

	}

}
