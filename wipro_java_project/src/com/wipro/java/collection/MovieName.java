/**
 * 
 */
package com.wipro.java.collection;

import java.util.Comparator;

/**
 * 
 */
//MovieName - compares movies by name
class MovieName implements Comparator<MoviePojoClass> {
 @Override
 public int compare(MoviePojoClass movie1, MoviePojoClass movie2) {
     return movie1.getName().compareTo(movie2.getName());
 }
}
