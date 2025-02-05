package com.wipro.java.collection;

import java.util.HashMap;
import java.util.Map;
/**
 * 
 */
public class MapImplementation {

	public static void main(String[] args) {
		
		//creating a HashMap where id as key and string value as value
		Map<Integer, String> map = new HashMap<>();
		
		//adding the key-value pairs to the map
		map.put(0, "orange");
		map.put(1, "grapes");
		map.put(2, "strawberry");
		map.put(3, "mango");
		
		//accessing values using key
		System.out.println(map.get(2));
		System.out.println(map.get(0));
		
		//checking if the key exists in the map and if exists printing that key value
		if(map.containsKey(1)) {
			System.out.println(map.get(1));
		}
		
		//iterating over the map using for-each loop
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" +entry.getValue());
		}
		
		//removing a key-value
		map.remove(3);
		//displaying the map after removal of a key-value pair
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" +entry.getValue());
		}
		

	}

}
