package com.wipro.java;

/*
 * Write a program on Fibonacci seris and store it in a treemap
 */

import java.util.Scanner;
import java.util.TreeMap;

public class FibonacciSeriesTreeMap {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of fibonacci values you want: ");
        int n = sc.nextInt();
        
        //creating TreeMap
        TreeMap<Integer, Integer> fMap = new TreeMap<>();
        
        //Initializing the first two values of fibonacci series 
        if(n>0) fMap.put(0, 0);
        if(n>1) fMap.put(1, 1);
        
        int num1 =0, num2=1;
        for(int i=2;i<n;i++) {
        	int nextTerm = num1 + num2;
        	fMap.put(i, nextTerm);
        	num1 = num2;
        	num2 = nextTerm;
        }
        
        System.out.println("Fibonacci Series Stored In TreeMap: ");
        /*here used var keyword instead of writing Map.Entry<Integer, Integer> to improve readability
         * The compiler automatically infers that entry type based on fMap.entrySet()
         */
        for(var entry:fMap.entrySet()) {
        	System.out.print("{num"+entry.getKey() +" : " + entry.getValue() +"}");
        }
        sc.close();
        
    }
}

