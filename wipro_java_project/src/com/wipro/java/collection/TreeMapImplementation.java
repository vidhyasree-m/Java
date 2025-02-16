package com.wipro.java.collection;
/*
 * TreeMap implements Map Interface. It stores keys in sorted order 
 */
import java.util.*;

public class TreeMapImplementation {
    public static void main(String[] args) {
    	
        // Creating a TreeMap to store animals
        TreeMap<Integer, String> animalsMap = new TreeMap<>();

        // Adding elements  
        animalsMap.put(5, "Lion");
        animalsMap.put(2, "Elephant");
        animalsMap.put(4, "Tiger");
        animalsMap.put(3, "Giraffe");
        animalsMap.put(1, "Bear");
        
        System.out.println("animalsMap: " +animalsMap);

        //putIfAbsent() - Inserts only if key is absent
        animalsMap.putIfAbsent(4, "Zebra");
        animalsMap.putIfAbsent(2, "Monkey"); // Won't update since key 2 already exists

        //get() - Retrieve value by key
        System.out.println("Animal with key 2: " + animalsMap.get(2));

        //containsKey() - Check if a key exists
        System.out.println("Contains key 3? " + animalsMap.containsKey(3));

        //containsValue() - Check if a value exists
        System.out.println("Contains animal 'Tiger'? " + animalsMap.containsValue("Tiger"));

        //remove() - Remove based by key
        animalsMap.remove(5);
        System.out.println("After removing key 5: " + animalsMap);

        //remove() - Remove if both key and value match
        animalsMap.remove(4, "Zebra");
        System.out.println("After removing key 4 with value Zebra: " + animalsMap);

        //replace() - Update value based on key
        animalsMap.replace(2, "Panda");
        System.out.println("After replacing key 2 value: " + animalsMap);

        //replace(key,oldValue,newValue)
        boolean replaced = animalsMap.replace(3, "Lion", "sloth");
        System.out.println("Was key 3 replaced? " + replaced);
        System.out.println("Updated AnimalsMap: " + animalsMap);

        //keySet() - Give all keys 
        System.out.println("Animal Keys: " + animalsMap.keySet());

        //values() - Give all values
        System.out.println("Animals values: " + animalsMap.values());

        //entrySet() - Give all key-value pairs 
        System.out.println("Animal Entries: " + animalsMap.entrySet());

        //firstKey() & lastKey() - Give first and last keys
        System.out.println("First Animal key: " + animalsMap.firstKey());
        System.out.println("Last Animal key: " + animalsMap.lastKey());

        //firstEntry() & lastEntry() - Give first and last entries
        System.out.println("First Animal Entry: " + animalsMap.firstEntry());
        System.out.println("Last Animal Entry: " + animalsMap.lastEntry());

        //higherKey() & lowerKey() - Give next and previous animal IDs
        System.out.println("Higher key than 3: " + animalsMap.higherKey(3));
        System.out.println("Lower key than 3: " + animalsMap.lowerKey(3));

        //descendingMap() - Reverse order map
        System.out.println("Reverse Order Map: " + animalsMap.descendingMap());

        //Iterating using forEach
        System.out.println("Iterating using forEach:");
        animalsMap.forEach((key, value) -> System.out.println("Animal ID: " + key + ", Animal: " + value));

        //size() - Give size of the map
        System.out.println("Size of AnimalsMap: " + animalsMap.size());

        //isEmpty() - Check if the map is empty or not
        System.out.println("Is AnimalsMap empty: " + animalsMap.isEmpty());

       
    }
}
