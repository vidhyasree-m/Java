//create a pojo class for employee
package com.wipro.java.oops;

/**
 * @author vidhyasree
 */
public class Employee {

	//instance variables
	private String empName; //this is employee name
	private int empId; //this is employee id
	private float empSalary; //this is employee salary
	
	//getter for employee name
	public String getEmpName() {
		return empName;
	}
    //setter for employee name
	public void setEmpName(String empName) {
		this.empName = empName;
	}
    //getter for employee id
	public int getEmpId() {
		return empId;
	}
    //setter for employee id
	public void setEmpId(int empId) {
		this.empId = empId;
	}
    //getter for employee salary
	public float getEmpSalary() {
		return empSalary;
	}
    //setter for employee salary
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
