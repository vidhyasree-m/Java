/**
 * 
 */
package com.wipro.java.oops;

/**
 * parent class = Employee
 * child class = ProjectLead
 * Extends = is a keyword
 */
public class ProjectLead extends Employee {

	/**
	 * 
	 */
	public ProjectLead() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ProjectLead pl1 = new ProjectLead();
		Employee emp1 = new ProjectLead();
		emp1.setEmpId(123);
		emp1.setEmpName("gloria");
		emp1.setEmpSalary(25000f);
		
		System.out.println(emp1.getEmpId());
		System.out.println(emp1.getEmpName());
		System.out.println(emp1.getEmpSalary());

	}

}
