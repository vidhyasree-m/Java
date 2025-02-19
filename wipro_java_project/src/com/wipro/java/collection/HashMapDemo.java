package com.wipro.java.collection;

/*HashMap Implementation in Java
 * Used linked list for handling collisions
 */
//Key-Value pair node 
class HashNode<K, V> {
	K key; //store the key
	V value; //store the value
	HashNode<K, V> next; //next node 

	// Constructor
	public HashNode(K key, V value) {
		this.key = key;
		this.value = value;
		this.next = null; //initially, no next node is present
	}
}

//Implements put(), get(), remove() and printMap() operations
class HashMapOperations<K, V> {
	private int capacity; // Size of HashMap array
	private int size; // Number of key-value pairs stored
	private HashNode<K, V>[] table; // Array of linked lists

	// Constructor - Initialize HashMap
	public HashMapOperations(int capacity) {
		this.capacity = capacity;
		this.size = 0;
		this.table = new HashNode[capacity]; // creating an array for HashNode objects
	}

	// Hash Function: Converts key into an index. To find Hash Value : sum(Key) % size 
	private int hash(K key) {
		return Math.abs(key.hashCode()) % capacity;
	}

	// PUT Method: Inserts a key-value pair
	public void put(K key, V value) {
		int index = hash(key); // Get array index
		HashNode<K, V> newNode = new HashNode<>(key, value);

		if (table[index] == null) {
			table[index] = newNode; // Insert if no collision
		} else {
			HashNode<K, V> temp = table[index];
			while (temp != null) {
				if (temp.key.equals(key)) {
					temp.value = value; // Update value if key exists
					return;
				}
				if (temp.next == null) {
					temp.next = newNode; // Append to the linked list
					break;
				}
				temp = temp.next;
			}
		}
		size++;
	}

	// GET Method: Retrieves value for a given key
	public V get(K key) {
		int index = hash(key);
		HashNode<K, V> temp = table[index];

		while (temp != null) {
			if (temp.key.equals(key)) {
				return temp.value; //returns the value if key found
			}
			temp = temp.next;
		}
		return null; //returns null if key is not found
	}

	// REMOVE Method: Deletes a key-value pair
	public void remove(K key) {
		int index = hash(key);
		HashNode<K, V> temp = table[index];
		HashNode<K, V> prev = null;

		while (temp != null) {
			if (temp.key.equals(key)) {
				if (prev == null) {
					table[index] = temp.next; //remove first node
				} else {
					prev.next = temp.next; //pass the node
				}
				size--;
				return;
			}
			prev = temp;
			temp = temp.next;
		}
	}

	// PRINT Method: Display all key-value pairs
	public void printMap() {
		for (int i = 0; i < capacity; i++) {
			HashNode<K, V> temp = table[i];
			if (temp != null) {
				System.out.print("Index " + i + " -> ");
				while (temp != null) {
					System.out.print("(" + temp.key + " : " + temp.value + ") - ");
					temp = temp.next;
				}
				System.out.println("null");
			}
		}
	}
}


public class HashMapDemo {
	public static void main(String[] args) {
		HashMapOperations<String, Integer> map = new HashMapOperations<>(10);

		map.put("Vidhya", 40000);
		map.put("Pavithra", 35000);
		map.put("Tharun", 60000);
		map.put("Nithish", 75000); 
		map.put("Nikitha", 30000);

		System.out.println("Pavithra Salary: " + map.get("Pavithra")); 
		System.out.println("Tharun Salary: " + map.get("Tharun")); 

		map.printMap(); //displays all key-value pairs

		map.remove("Nikitha");
		System.out.println("After removing Nikitha:");
		map.printMap();
	}
}
