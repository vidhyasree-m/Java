package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.List;

public class ListOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		List<Integer> list1 = new ArrayList<Integer>();
		//Adding vlaue's to the list
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		//printing the values of the list1
		System.out.println(list1);
		
		//creating another integer list
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(0,5);
		list2.add(1,6);
		list2.add(2,7);
		
		System.out.println(list2);
		//adding all elements from list2 to list1
		list1.addAll(list2);
		//printing the list1 after adding all the elements in list2
		System.out.println(list1);
		
		//removing element from the list
		list1.remove(4);
		//after removing element in index 4 printing the result
		System.out.println(list1);
		
		//changing the value from the list1 
		list1.set(0, 6);
		//printing the list1 after changing the value of index 0
		System.out.println(list1);

	}

}
