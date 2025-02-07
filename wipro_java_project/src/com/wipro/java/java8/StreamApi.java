package com.wipro.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 */
public class StreamApi {

	public StreamApi() {
		
	}

	public static void main(String[] args) {
		List<String> list = Arrays.asList("manny", "gloria", "jay", "haley");
		List<String> stream1 = list.stream().
				filter(name->name.startsWith("m")).
				collect(Collectors.toList());
		System.out.println(stream1);
		List<String> stream2 = list.stream().
				map(String::toUpperCase).
				collect(Collectors.toList());
		System.out.println(stream2);
		
		//to sort the integer list
		 List<Integer> numbers = Arrays.asList(29,12,49,56,23,69);

	     List<Integer> sortedNumbers = numbers.stream()
	                                             .sorted()
	                                             .collect(Collectors.toList());

	        System.out.println("Sorted List: " + sortedNumbers);
	    //to get maximum and minimum value from integer list
	        List<Integer> nums = Arrays.asList(9,16,82,12,45);

	        int min = nums.stream().min(Integer::compare).orElseThrow();
	        int max = nums.stream().max(Integer::compare).orElseThrow();

	        System.out.println("Minimum: " + min);
	        System.out.println("Maximum: " + max);
		

	}

}
