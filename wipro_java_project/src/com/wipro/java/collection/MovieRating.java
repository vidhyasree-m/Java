package com.wipro.java.collection;

import java.util.Comparator;

//MovieRating - compares movies by rating
class MovieRating implements Comparator<MoviePojoClass> {
 @Override
 public int compare(MoviePojoClass movie1, MoviePojoClass movie2) {
     return Double.compare(movie1.getRating(), movie2.getRating());
 }
}
