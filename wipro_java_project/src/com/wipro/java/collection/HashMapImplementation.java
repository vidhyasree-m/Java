package com.wipro.java.collection;

import java.util.HashMap;
import java.util.Map.Entry;
/*
 * HashMap stores elements in key:value pairs. Keys are unique identifiers used to associate
 * each value on a map.
 * The HashMap class implements the Map interface
 */


public class HashMapImplementation {
	
	public static void main(String[] args) {
		//creating a hashmap
		HashMap<Integer, String> animals = new HashMap<>();
		
		//1-Adding elements to a hashmap
		//using put() method
		animals.put(1, "lion");
		animals.put(2, "tiger");
		animals.put(3, "rabbit");
		System.out.println("HashMap: " +animals);
		
		/*using putAll() : It takes a single parameter which is map
		 * map: map that contains mappings to be inserted into the hashmap
		 */ 
		HashMap<Integer, String> mammals = new HashMap<>();
		mammals.put(4, "cow");
		mammals.put(5, "goat");
		mammals.put(6, "dog");
		
		System.out.println("Using putAll() method: ");
		animals.putAll(mammals);
		System.out.println(animals);
		
		//using putIfAbsent()
		animals.putIfAbsent(7, "monkey");
		animals.putIfAbsent(5,"cat"); //in index 5 already value is mapped so adding is not possible it return old value
		System.out.println(animals);
		
		//2-Accessing elements in hashmap
		//using get() method
		
		System.out.println("Accessing element based on key:" +animals.get(3));
		System.out.println("Accessing element using getOrDefault(): "); 
		System.out.println(mammals.getOrDefault(9, "giraffe"));//there is no index 9 but i gave value so it returns that value
		//Accessing keys
		System.out.println("keys " +mammals.keySet());
		//Accessing values
		System.out.println("values " +mammals.values());
		//Accessing key-value pairs
		System.out.println("key:value " + animals.entrySet());
		
		//3- changing values in hashamp
	    System.out.println("changing vlaue in hashmap based on key");
	    System.out.println(animals.replace(2, "bear")); //changing tiger to bear
	    System.out.println(animals.replace(3, "rabbit", "rat"));
	   
	    //4- Removing elements from hashmap
	    System.out.println("Removing vlaues based on key: " + animals.remove(5));
	    System.out.println("After removing: " +animals.entrySet());
	    
	    //other methods
	    System.out.println("checking if a key 2 exist or not: " +animals.containsKey(2));
	    //apple is not present so it returns false
	    System.out.println("checking if a value exist or not: " + animals.containsValue("apple"));
	    
	    //Iterating using for-each loop
	    System.out.println("Iterating using for-each loop:");
	    for(Entry<Integer, String> entry : animals.entrySet()) {
	    	System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	    }
	    
	    //Iterating using forEach() method
	    System.out.println("Iterating using forEach method: ");
	    animals.forEach((key, value)-> System.out.println("Key: " + key + ", Value: " + value));
	    
	    //size() 
        System.out.println("Size of HashMap: " + animals.size());

        //isEmpty()
        System.out.println("Is HashMap empty: " + mammals.isEmpty());
		
		
		
 		
	}

}
