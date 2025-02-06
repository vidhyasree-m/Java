package com.wipro.java.collection;

//Animal class implementing Comparable to sort by age
class Animal implements Comparable<Animal> {
 private String name;
 private int age;

 // Constructor
 public Animal(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Getters
 public String getName() {
     return name;
 }

 public int getAge() {
     return age;
 }

 // Implementing the compareTo method to compare by age 
 @Override
 public int compareTo(Animal other) {
     return Integer.compare(this.age, other.age);
 }

 @Override
 public String toString() {
     return name + " (" + age + " years old)";
 }
}