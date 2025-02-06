/**
 * 
 */
package com.wipro.java.collection;

/**
 * 
 */


//class Movie implements Comparable
class Movie implements Comparable<Movie> {
	
	//private instance variables
	private String name;
	private int releaseYear;
	private double rating;
	
	//constructor
	public Movie(String name, int releaseYear, double rating) {
		this.name = name;
		this.releaseYear = releaseYear;
		this.rating = rating;
	}
	
	//getter methods
	public String getName() {
		return name;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public double getRating() {
		return rating;
	}
	
	//using compareTo method to sort the movie based on rating
	public int compareTo(Movie m) {
		return Double.compare(m.rating, this.rating);
	}
	
	

}
