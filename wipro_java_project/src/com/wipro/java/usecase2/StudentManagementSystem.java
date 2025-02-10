package com.wipro.java.usecase2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Student Management System Class
class StudentManagementSystem {
	
 private List<Student> students;

	 public StudentManagementSystem() {
	     students = new ArrayList<>();
	 }
	
	 //method to add student
	 public void addStudent(Student student) {
	     students.add(student); 
	 }
	
	 //To display all students
	 public void displayAllStudents() {
	     students.forEach(System.out::println);//used forEach loop 
	 }

	 //To display students additional fees
	 public void displayAdditionalFees() {
	     students.forEach(student -> System.out.println( //using lambda expression
	             student.getName() + " has an additional fee of " + student.AdditionalFee() + "Rs")
	     );
	 }
	 
	 //To filter top student
	 public List<Student> topPerformers(double highestMarks) {
	     return students.stream()  //used stream, filter and collect 
	             .filter(student -> student.getMarks() > highestMarks)
	             .collect(Collectors.toList());
	 }
 
	 //To calculate Average Marks
	 public double averageMarks() {
	     return students.stream()
	             .mapToDouble(Student::getMarks)
	             .average()
	             .orElse(0.0);
	 }
	 
	 //To remove student based on id
	 public boolean removeStudentById(int id) {
	     boolean removed = students.removeIf(student -> student.getId() == id);
	     if (removed) {
	         System.out.println("Student with ID " + id + " has been removed");
	     } else {
	         System.out.println("No student found with ID " + id);
	     }
	     return removed;
    }

}
