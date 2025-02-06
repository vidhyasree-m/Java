package com.wipro.java.collection;

//MoviePojoClass - POJO class for storing movie details
class MoviePojoClass {
 private String name;
 private int releaseYear;
 private double rating;

 // Constructor
 public MoviePojoClass(String name, int releaseYear, double rating) {
     this.name = name;
     this.releaseYear = releaseYear;
     this.rating = rating;
 }

 // Getters
 public String getName() {
     return name;
 }

 public int getReleaseYear() {
     return releaseYear;
 }

 public double getRating() {
     return rating;
 }
}
