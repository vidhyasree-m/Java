package com.wipro.java.collection;

import java.util.*;

class Student {
    String name;
    int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll Number: " + rollNumber;
    }
}

public class StudentHashMap {

	public static void main(String[] args) {
		
		//creating studentMap
		HashMap<Integer, String> studentMap1 = new HashMap<>();
		//adding 10 students in to the studentMap
		studentMap1.put(101,"Gloria");
		studentMap1.put(102, "Manny");
		studentMap1.put(103, "Clarie");
		studentMap1.put(104, "Haley");
		studentMap1.put(105, "Alex");
		studentMap1.put(106, "Luke");
		studentMap1.put(107, "Jay");
		studentMap1.put(108,"Joe");
		studentMap1.put(109, "Mitchell");
		studentMap1.put(110, "Cam");
		System.out.println(studentMap1);
		
		//Adding duplicates names
		System.out.println("Adding duplicate names: ");
		studentMap1.put(111, "Manny");
		studentMap1.put(112, "Alex");
		System.out.println(studentMap1);
		//if you try to duplicate key then HashMap overwrite the previous value with new value
		System.out.println("Before adding duplicate key: ");
		System.out.println(studentMap1);
		System.out.println("Adding duplicate Key 101 and 107: "); 
		studentMap1.put(101, "Jisoo");
		studentMap1.put(107, "Lisa");
		System.out.println(studentMap1);
		
		 //To store duplicate values for the same key in HashMap we can use List as the value
        Map<Integer, List<Student>> studentMap2 = new HashMap<>();
        
        // Creating 10 students with duplicate roll numbers
        Student[] students = {
            new Student("Vidhya", 101),
            new Student("Pavi", 102),
            new Student("Siri", 103),
            new Student("Tharun", 102), // duplicate roll number
            new Student("Nithish", 101),    // duplicate roll number
            new Student("Divya", 104),
            new Student("Varshitha", 105),
            new Student("Vandana", 103),   // duplicate roll number
            new Student("Devika", 106),
            new Student("Kavitha", 107)
        };
        System.out.println();

        // Adding students to the HashMap
        for (Student student : students) {
            studentMap2.putIfAbsent(student.rollNumber, new ArrayList<>());
            studentMap2.get(student.rollNumber).add(student);
        }
        
        // Printing the student details
        for (Map.Entry<Integer, List<Student>> entry : studentMap2.entrySet()) {
            System.out.println("Roll Number: " + entry.getKey());
            for (Student s : entry.getValue()) {
                System.out.println("  " + s);
            }
        }
	}
}
		
		
		
		
		
		

	








