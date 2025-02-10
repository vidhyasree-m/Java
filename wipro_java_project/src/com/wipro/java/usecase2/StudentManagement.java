package com.wipro.java.usecase2;

public class StudentManagement {
	
    public static void main(String[] args) {
        StudentManagementSystem system = new StudentManagementSystem();

        // Adding Students
        system.addStudent(new DayScholar("Gloria", 601, 88.5));
        system.addStudent(new HostelStudent("Manny", 602, 93.0));
        system.addStudent(new DayScholar("Alex", 603, 75.0));
        system.addStudent(new HostelStudent("Luke", 604, 87.5));
        system.addStudent(new DayScholar("Jay", 605, 80.0));
        system.addStudent(new HostelStudent("Joe", 606, 78.5));

        System.out.println("All Students");
        system.displayAllStudents();

        System.out.println("Additional Fees");
        system.displayAdditionalFees();

        System.out.println("Top Performers (Marks > 85)");
        system.topPerformers(85).forEach(System.out::println);

        System.out.println("Average Marks: " + system.averageMarks());
        
        system.removeStudentById(555); // Tries to remove the student with ID 555

    }
}

