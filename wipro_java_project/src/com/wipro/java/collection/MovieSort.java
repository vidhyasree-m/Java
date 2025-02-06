package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// MovieSort - class with the main method to demonstrate sorting
public class MovieSort {

    public static void main(String[] args) {

        // Creating a list of movies
        List<MoviePojoClass> movies = new ArrayList<>();

        // Adding movies to the list
        movies.add(new MoviePojoClass("RRR", 2022, 8.4));
        movies.add(new MoviePojoClass("Baahubali", 2015, 8.0));
        movies.add(new MoviePojoClass("Eega", 2012, 7.7));
        movies.add(new MoviePojoClass("Devera", 2024, 9.1));

        // Sorting movies by name using MovieName comparator
        Collections.sort(movies, new MovieName());
        System.out.println("Movies sorted by name:");
        for (MoviePojoClass movie : movies) {
            System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getReleaseYear());
        }

        // Sorting movies by rating using MovieRating comparator
        Collections.sort(movies, new MovieRating());
        System.out.println("\nMovies sorted by rating:");
        for (MoviePojoClass movie : movies) {
            System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getReleaseYear());
        }

        // Sorting movies by release year using MovieReleaseYear comparator
        Collections.sort(movies, new MovieReleaseYear());
        System.out.println("\nMovies sorted by release year:");
        for (MoviePojoClass movie : movies) {
            System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getReleaseYear());
        }
    }
}

