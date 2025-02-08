/**
 * 
 */
package com.wipro.java.java8.usecase;

/**
 * 
 */
import java.time.LocalDate;
import java.util.InputMismatchException; //Handles exception when input types doesn't match expected types
import java.util.List; 
import java.util.Optional; //wraps nullable values to avoid NullPointerException
import java.util.Scanner; //Scanner is used to read input from console


public class EmployeeManagement {  
	 public static void main(String[] args) {
		    
		    //creating object of EmployeeService to manage employee operations
	        EmployeeService service = new EmployeeService();
	        Scanner scanner = new Scanner(System.in);

	        //pre-added employee data
	        service.addEmployee(new Employee(1, "Vidhya", "IT", 50000, LocalDate.of(2024, 5, 10)));
	        service.addEmployee(new Employee(2, "Pavithra", "Data Analyst", 45000, LocalDate.of(2023, 3, 15)));
	        service.addEmployee(new Employee(3, "Tharun", "Editor", 60000, LocalDate.of(2020, 8, 22)));

	        while (true) {
	            try {
	                System.out.println("\n------ Employee Management System ------");
	                //Each option indicates specific feature
	                System.out.println("1. Add Employee");
	                System.out.println("2. Remove Employee");
	                System.out.println("3. Search Employee");
	                System.out.println("4. Update Salary");
	                System.out.println("5. Display All Employees");
	                System.out.println("6. Filter by Department");
	                System.out.println("7. Sort by Name");
	                System.out.println("8. Get Average Salary");
	                System.out.println("9. Exit");
	                System.out.print("Enter your choice: ");

	                int choice = scanner.nextInt();
	                //Added exception handling for every case 
	                switch (choice) {
	                    case 1:
	                        try {
	                        	//Add employee
	                            System.out.print("Enter ID: ");
	                            int id = scanner.nextInt();
	                            scanner.nextLine(); // Consume newline
	                            System.out.print("Enter Name: ");
	                            String name = scanner.nextLine();
	                            System.out.print("Enter Department: ");
	                            String dept = scanner.nextLine();
	                            System.out.print("Enter Salary: ");
	                            double salary = scanner.nextDouble();
	                            service.addEmployee(new Employee(id, name, dept, salary, LocalDate.now()));
	                        } catch (IllegalArgumentException e) { //handles exceptions for invalid or duplicate ID's
	                            System.out.println(e.getMessage());
	                        }
	                        break;
	                    case 2:
	                        try {
	                        	//Remove employee
	                            System.out.print("Enter Employee ID to Remove: ");
	                            int removeId = scanner.nextInt();
	                            service.removeEmployee(removeId);
	                        } catch (IllegalArgumentException | EmployeeNotFoundException e) { //throws EmployeeNotFoundException if the ID is not found
	                            System.out.println(e.getMessage());
	                        }
	                        break;
	                    case 3:
	                        try {
	                        	//Search Employee
	                            System.out.print("Enter Employee ID to Search: ");
	                            int searchId = scanner.nextInt();
	                            Optional<Employee> emp = service.searchEmployee(searchId);
	                            System.out.println(emp.orElseThrow(() -> new EmployeeNotFoundException("Employee not found.")));
	                        } catch (IllegalArgumentException | EmployeeNotFoundException e) {
	                            System.out.println(e.getMessage());
	                        }
	                        break;
	                    case 4:
	                        try {
	                        	//Update salary
	                            System.out.print("Enter Employee ID to Update Salary: ");
	                            int updateId = scanner.nextInt();
	                            System.out.print("Enter New Salary: ");
	                            double newSalary = scanner.nextDouble();
	                            service.updateSalary(updateId, newSalary);
	                        } catch (IllegalArgumentException | EmployeeNotFoundException e) {
	                            System.out.println(e.getMessage());
	                        }
	                        break;
	                    case 5:
	                        try {
	                        	//Display all employees
	                            service.displayEmployees();
	                        } catch (IllegalStateException e) {
	                            System.out.println(e.getMessage());
	                        }
	                        break;
	                    case 6:
	                        try {
	                        	//Filter by department
	                            System.out.print("Enter Department: ");
	                            scanner.nextLine();
	                            String department = scanner.nextLine();
	                            List<Employee> filtered = service.filterByDepartment(department);
	                            filtered.forEach(System.out::println);
	                        } catch (IllegalArgumentException e) {
	                            System.out.println(e.getMessage());
	                        }
	                        break;
	                    case 7:
	                        try {
	                        	//sort by name
	                            List<Employee> sorted = service.sortByName();
	                            sorted.forEach(System.out::println);
	                        } catch (IllegalStateException e) {
	                            System.out.println(e.getMessage());
	                        }
	                        break;
	                    case 8:
	                        try {
	                        	//get average salary
	                            System.out.println("Average Salary: " + service.getAverageSalary());
	                        } catch (IllegalStateException e) {
	                            System.out.println(e.getMessage());
	                        }
	                        break;
	                    case 9:
	                    	//exit
	                        System.out.println("Exiting...");
	                        scanner.close();
	                        return;
	                    default:
	                        System.out.println("Invalid choice! Try again.");
	                }
	            } catch (InputMismatchException e) { //Exception Handling
	                System.out.println("Invalid input. Please enter valid data.");
	                scanner.nextLine(); // Clear invalid input
	            }
	        }
	    }
}

		 


	
	
	          
              