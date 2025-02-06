package com.wipro.java.collection;

import java.util.Comparator;

//MovieReleaseYear - compares movies by release year
class MovieReleaseYear implements Comparator<MoviePojoClass> {
 @Override
 public int compare(MoviePojoClass movie1, MoviePojoClass movie2) {
     return Integer.compare(movie1.getReleaseYear(), movie2.getReleaseYear());
 }
}
