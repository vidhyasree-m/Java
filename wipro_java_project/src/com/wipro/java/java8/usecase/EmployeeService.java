package com.wipro.java.java8.usecase;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

// Custom Exception Class 
class EmployeeNotFoundException extends RuntimeException {
	//The constructor takes a String argument, which serves as the custom error message
    public EmployeeNotFoundException(String message) {
    	//It passes this message to the super class which is RuntimeException constructor using super(message)
        super(message);
    }
}

public class EmployeeService {
    private List<Employee> employees = new ArrayList<>();

    // Add an Employee
    public void addEmployee(Employee emp) {
        if (emp == null) {
            throw new IllegalArgumentException("Employee cannot be null.");
        }
        employees.add(emp);
        System.out.println("Employee added: " + emp);
    }

    // Remove an Employee by ID
    public void removeEmployee(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Invalid Employee ID: " + id);
        }
        boolean removed = employees.removeIf(emp -> emp.getId() == id); //used lambda expression
        if (!removed) {
            throw new EmployeeNotFoundException("Employee with ID " + id + " not found.");
        }
        System.out.println("Employee with ID " + id + " removed.");
    }

    // Search Employee by ID
    public Optional<Employee> searchEmployee(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Invalid Employee ID: " + id);
        }
        return employees.stream().
        		filter(emp -> emp.getId() == id).
        		findFirst();
    }

    // Update Employee Salary
    public void updateSalary(int id, double newSalary) {
        if (id <= 0 || newSalary < 0) {
            throw new IllegalArgumentException("Invalid input for ID or Salary.");
        }
        Employee employee = searchEmployee(id)
            .orElseThrow(() -> new EmployeeNotFoundException("Employee with ID " + id + " not found."));
        employee.setSalary(newSalary);
        System.out.println("Updated salary for Employee ID: " + id);
    }

    // Display All Employees
    public void displayEmployees() {
        if (employees.isEmpty()) {
            throw new IllegalStateException("No employees to display.");
        } else {
            employees.forEach(System.out::println);
        }
    }

    // Filter Employees by Department
    public List<Employee> filterByDepartment(String department) {
        if (department == null || department.trim().isEmpty()) {
            throw new IllegalArgumentException("Department cannot be empty.");
        }
        return employees.stream()
            .filter(emp -> emp.getDepartment().equalsIgnoreCase(department))
            .collect(Collectors.toList());
    }

    // Sort Employees by Name
    public List<Employee> sortByName() {
        if (employees.isEmpty()) {
            throw new IllegalStateException("No employees to sort.");
        }
        return employees.stream().
        		sorted(Comparator.comparing(Employee::getName)).
        		collect(Collectors.toList());
    }

    // Get Average Salary
    public double getAverageSalary() {
        if (employees.isEmpty()) {
            throw new IllegalStateException("No employees to calculate average salary.");
        }
        return employees.stream().
        		mapToDouble(Employee::getSalary).
        		average().orElse(0.0);
    }
}

   	   