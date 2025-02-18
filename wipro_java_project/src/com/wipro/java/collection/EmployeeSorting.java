package com.wipro.java.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class Employee {
	
	//private variables
	private int empId;
	private String empName;
	private String empRole;
	private double empSalary;
	
	//parameterized constructor 
	public Employee(int empId, String empName, String empRole, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empRole = empRole;
		this.empSalary = empSalary;
	}
	
	// getters
	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpRole() {
		return empRole;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empRole=" + empRole + ", empSalary=" + empSalary
				+ "]";
	}
}
//Comparator to sort employees based on salary
class SalarySorting implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		
		return Double.compare(emp1.getEmpSalary(), emp2.getEmpSalary());
	}
	
}
//Sorting based on id
class IdSorting implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		
		return Integer.compare(emp1.getEmpId(), emp2.getEmpId());
	}
	
}

//sorting based on name
class NameSorting implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		
		return emp1.getEmpName().compareToIgnoreCase(emp2.getEmpName());
	}
	
}

public class EmployeeSorting {
	
	public static void main(String[] args) {
		
		//creating LinkedList of Employees
		LinkedList<Employee> emp = new LinkedList<>();
		emp.add(new Employee(5571,"Vidhya","Developer",65000));
		emp.add(new Employee(6224,"Divya","Hardware",55000));
		emp.add(new Employee(2131,"Vandana","Tester",60000));
		emp.add(new Employee(1903,"Siri","Analyst",52000));
		
		System.out.println("Before Sorting: ");
		for(Employee e : emp) {
			System.out.println(e);
		}
		
		//sorting based on salary
		Collections.sort(emp, new SalarySorting());
		
		System.out.println("After sorting based on salary: ");
		for(Employee e : emp) {
			System.out.println(e);
		}
		
		//sorting based on id 
		System.out.println("Sorting based on Id: ");
		Collections.sort(emp, new IdSorting());
		for(Employee e : emp) {
			System.out.println(e);
		}
		
		//sorting based on name
		System.out.println("Sorting based on Name: ");
		Collections.sort(emp, new NameSorting());
		for(Employee e : emp) {
			System.out.println(e);
		}
		
		
	}

}
