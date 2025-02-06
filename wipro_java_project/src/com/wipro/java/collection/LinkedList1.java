package com.wipro.java.collection;

import java.util.LinkedList;
import java.util.List;


/**
 * 
 */
public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating a variable n assigning the value 
		int n=5;
		//declaring list and performing type casting
		List<Integer> ll1 = new LinkedList<Integer>();
		for(int i=1;i<=n;i++) {
			ll1.add(i);
		}
		//printing elements in list
		System.out.println(ll1);
		//removing element at index 2
		ll1.remove(3);
		//after removing printing the list
		System.out.println(ll1);
		
		//printing elements using loops
		for(int i=0;i<ll1.size();i++) {
			
			System.out.println(ll1.get(i) + " ");
		}
		
		
		

	}

}
