package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Main class demonstrating the use of Comparable and Comparator
public class AnimalSort {

    public static void main(String[] args) {

    	 // Creating a list of animals with new names
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Penguin", 7));
        animals.add(new Animal("Kangaroo", 5));
        animals.add(new Animal("Panda", 4));
        animals.add(new Animal("Tiger", 10));
        animals.add(new Animal("Koala", 3));

        // Sorting by age using Comparable
        Collections.sort(animals);
        System.out.println("Animals sorted by age (natural order):");
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        // Sorting by name using Comparator (alphabetical order)
        Collections.sort(animals, new AnimalNameComparator());
        System.out.println("Animals sorted by name (alphabetical order):");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
