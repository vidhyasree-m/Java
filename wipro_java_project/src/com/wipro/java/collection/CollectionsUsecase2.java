package com.wipro.java.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* usecase2 - Develop a collections based application that shall fetch the data from 
 * a tree map and store it in hash map. 
 * TreeMap stores key-value pairs in sorted order based on keys
 * HashMap did not maintain order and follows unordered storing for faster retrieval
 */
public class CollectionsUsecase2 {
	
	public static void main(String[] args) {
		//creating tree map
		TreeMap<Integer, String> colorMap = new TreeMap<>();
		
		//adding elements to tree map
		colorMap.put(1, "skyblue");
		colorMap.put(5, "blue");
		colorMap.put(3, "orange");
		colorMap.put(2, "white");
		colorMap.put(4, "green");
		colorMap.put(6, "teal");
		
		//displaying color Map
		System.out.println("In sorted order it stores: " +colorMap);
		
		//Fetching the data from TreeMap and store in HashMap
		HashMap<Integer, String> hashmap = new HashMap<>(colorMap);
		System.out.println("HashMap unordered: " +hashmap);
		
		//Adding element 
		hashmap.put(7, "pink");
		System.out.println("After adding: " +hashmap);
		colorMap.put(7, "red");
		System.out.println("After adding: " +colorMap);
		
		//Removing an element
		colorMap.remove(2);
		System.out.println("After removing value at index 2: " +colorMap);
		hashmap.remove(4);
		System.out.println("After removing value at index 4:  " +hashmap);
		
		//searching an element
		System.out.println("returns boolean value: " +colorMap.containsKey(2));
		System.out.println("return boolean value: "+ hashmap.containsValue("pink"));
		
		//Iterating over TreeMap
		System.out.println("Iterating over TreeMap");
		for(Map.Entry<Integer, String> entry : colorMap.entrySet()) {
			System.out.println(entry.getKey() + "->"+entry.getValue());
		}
		
		//Iterating over HashMap
				System.out.println("Iterating over HashMap");
				for(Map.Entry<Integer, String> entry : hashmap.entrySet()) {
					System.out.println(entry.getKey() + "->"+entry.getValue());
				}
		
	    
	    
		
	}
	

}
