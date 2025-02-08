package com.wipro.java.java8.usecase;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

/*Here Assert methods used assertTrue, assertFalse, assertEquals, fail 
 * these methods are used to verify the correctness of methods like adding, searching, removing,
 * updating and sorting employees
*/
public class EmployeeManagementTest {

    private EmployeeService service;

    //@Before executes before each test to set up necessary preconditions
    @Before
    public void setUp() {
    	//setUp() ensures a fresh setup for each test to avoid side effects
        service = new EmployeeService();
        service.addEmployee(new Employee(1, "Vidhya", "IT", 50000, LocalDate.of(2024, 5, 10)));
        service.addEmployee(new Employee(2, "Pavithra", "Data Analyst", 45000, LocalDate.of(2023, 3, 15)));
        service.addEmployee(new Employee(3, "Tharun", "Editor", 60000, LocalDate.of(2020, 8, 22)));
    }

    //@Test marks methods as test cases
    
    //Adds new employee and verifies 
    @Test
    public void testAddEmployee() {
        Employee newEmployee = new Employee(4, "Gloria", "IT", 55000, LocalDate.now());
        service.addEmployee(newEmployee);
        Optional<Employee> result = service.searchEmployee(4);  
        assertTrue(result.isPresent());
        assertEquals("Gloria", result.get().getName());
    }

    //Removes an employee and ensures they are no longer in the system
    @Test
    public void testRemoveEmployee() {
        service.removeEmployee(3);
        Optional<Employee> result = service.searchEmployee(3);
        assertFalse(result.isPresent());
    }

    //verifies that removing an invalid employee throws the expected exception
    @Test
    public void testRemoveNonExistentEmployee() {
        try {
            service.removeEmployee(6767);
            fail("Expected EmployeeNotFoundException was not thrown");
        } catch (EmployeeNotFoundException e) {
            assertEquals("Employee with ID 6767 not found.", e.getMessage());
        }
    }

    //checks if an employee with Id 1 exists and if their name is Vidhya
    @Test
    public void testSearchEmployee() {
        Optional<Employee> result = service.searchEmployee(1);
        assertTrue(result.isPresent());
        assertEquals("Vidhya", result.get().getName());
    }

    //updates an employee's salary and ensures the change is reflected
    @Test
    public void testUpdateSalary() {
        service.updateSalary(2, 73000);
        Optional<Employee> result = service.searchEmployee(2);
        assertTrue(result.isPresent());
        assertEquals(73000, result.get().getSalary(), 0.0);
    }

    //Ensures that an attempt to update salary for an invalid employee throws an exception
    @Test
    public void testUpdateSalaryForNonExistentEmployee() {
        try {
            service.updateSalary(222, 45000);
            fail("Expected EmployeeNotFoundException was not thrown");
        } catch (EmployeeNotFoundException e) {
            assertEquals("Employee with ID 222 not found.", e.getMessage());
        }
    }
    
    //check no exceptions are thrown while displaying employees
    @Test
    public void testDisplayEmployees() {
        try {
            service.displayEmployees();
        } catch (Exception e) {
            fail("Exception should not be thrown");
        }
    }
    
    //Filters employees by department and checks if Vidhya belongs to IT
    @Test
    public void testFilterByDepartment() {
        List<Employee> result = service.filterByDepartment("IT");
        assertEquals(1, result.size());
        assertEquals("Vidhya", result.get(0).getName());
    }

    //Verifies that employees are sorted alphabetically by name
    @Test
    public void testSortByName() {
        List<Employee> sortedList = service.sortByName();
        assertEquals("Pavithra", sortedList.get(0).getName());
        assertEquals("Tharun", sortedList.get(1).getName());
        assertEquals("Vidhya", sortedList.get(2).getName());
    }

    //checks if the average salary is calculated correctly
    @Test
    public void testGetAverageSalary() {
        double averageSalary = service.getAverageSalary();
        assertEquals(51666.67, averageSalary, 0.01);
    }

    //checks an exception is thrown when calculating the average salary for an empty list
    @Test
    public void testGetAverageSalaryForEmptyList() {
        service = new EmployeeService(); // Reset to an empty list
        try {
            service.getAverageSalary();
            fail("Expected IllegalStateException was not thrown");
        } catch (IllegalStateException e) {
            assertEquals("No employees to calculate average salary.", e.getMessage());
        }
    }
}

