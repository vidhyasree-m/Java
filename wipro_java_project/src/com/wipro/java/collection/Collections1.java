package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

//collections is a framework in java used to store and manipulate groups of objects
/**
 * 
 */
public class Collections1 {

	public static void main(String[] args) {
		//List - Maintains ordered collection 
		//ArrayList implements List Interface
		List<Integer> list1 = new ArrayList<Integer>();
		//adding elements into the list based on index value
		list1.add(0,1);
		list1.add(1,2);
		//adding elements into the list1 
		list1.add(3);
		list1.add(4);
		//Displaying the elements present in the list1
		System.out.println(list1);
		//removing first element from the list1
		list1.remove(0);
		System.out.println("After removing element at index 0");
		System.out.println(list1);
		//changing the value from the list1
		list1.set(2, 1);
		System.out.println("After changing the value of index 2");
		System.out.println(list1);
		
		//LinkedList - in this each element is treated as node
		List<String> ll = new LinkedList<String>();
		
		//adding elements into the list based on index value
		ll.add(0, "cat");
		ll.add(1,"dog");
		//adding elements into the list
		ll.add("rat");
		ll.add("lion");
		System.out.println("LinkedList: " +ll);
		//removing elements from LinkedList
		ll.remove(3);
		System.out.println("After removing the value present in index 3: "+ll);
		
		//HashMap : store the data in key value pairs and the keys should be unique
		Map<Integer, String> map1 = new HashMap<>();
		
		//adding values into map based on key
		map1.put(1,"gloria");
		map1.put(2, "jay");
		map1.put(3, "manny");
		map1.put(4, "lilly");
		
		//Displaying the HashMap
		System.out.println("HashMap "+ map1);
		
		//accessing elements based on key
		System.out.println("Accessing values of map based on key");
		System.out.println(map1.get(4));
		System.out.println(map1.get(2));
		
		//removing element from HashMap
		map1.remove(3);
		System.out.println("After removing value from HashMap: " +map1);
		
		//Iterating over HashMap
		for(Integer key : map1.keySet()) {
			System.out.println("ID: " + key + ":" + map1.get(key));
		}
		
		//checking if the key is present in the map
		//returns true if key is present
		System.out.println(map1.containsKey(5));
		
		
		
		
		
		
		
		
		
		
		

	}

}
