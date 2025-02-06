package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieSorting {

	public static void main(String[] args) {
		//creating a list of movies
	   List<Movie> movies = new ArrayList<>();
	   
	   //adding movies to the list
	   movies.add(new Movie("RRR", 2022, 8.4));
       movies.add(new Movie("Baahubali", 2015, 8.0));
       movies.add(new Movie("Eega", 2012, 7.7));
       movies.add(new Movie("Devera", 2024, 9.1));

       // Sorting movies by rating
       Collections.sort(movies);

       // Display sorted movies
       System.out.println("Movies sorted by rating (descending order):");
       for (Movie movie : movies) {
           System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getReleaseYear());
       }

	}

}
