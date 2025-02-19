package com.wipro.java.collection;

import java.util.Scanner;
//creating a class Node, defines a linked list node
class Node {
	//variables
    String name;
    String role;
    double salary;
    Node next; //A pointer or reference to the next node in the linked list

    // constructor to initialize a new node
    public Node(String name, String role, double salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
        this.next = null;
    }
}
//creating a class to manage linked list operations 
class LinkedList {
    private Node head; // Head of the linked list (first node)

    // Method to add a user at the end of the list
    public void addUser(String name, String role, double salary) {
    	//creating reference to the new node as newNode
        Node newNode = new Node(name, role, salary);
        if (head == null) { //if head is null the list is empty so assigning newNode as the first node
            head = newNode;
        } else { //if list has already nodes
            Node temp = head;
            while (temp.next != null) { 
                temp = temp.next;
            }
            temp.next = newNode; //adds newNode at the end of the list 
        }
        System.out.println("User added: " + name);
    }

    // Method to display all users in the linked list
    public void displayUsers() {
        if (head == null) {
            System.out.println("No users in the list.");
            return;
        }
        Node temp = head;
        System.out.println("User List:");
        while (temp != null) {
            System.out.println("Name: " + temp.name + ", Role: " + temp.role + ", Salary: " + temp.salary);
            temp = temp.next;
        }
    }

    // Method to delete a user by name
    public void deleteUser(String name) {
        if (head == null) {
            System.out.println("User list is empty.");
            return;
        }
        //if the name matches with first node
        if (head.name.equals(name)) {
            head = head.next;
            System.out.println("User " + name + " deleted.");
            return;
        }
        /* Traverses the linked list to find the node with the given name
         * prev - keep track of previous node
         */
        Node temp = head;
        Node prev = null;
        while (temp != null && !temp.name.equals(name)) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("User not found.");
            return;
        }
        prev.next = temp.next;
        System.out.println("User " + name + " deleted.");
    }
}

public class UserLinkedList {
    public static void main(String[] args) {
        LinkedList userList = new LinkedList();
        Scanner sc = new Scanner(System.in);
        //allows user to select actions
        while (true) {
            System.out.println("1. Add User");
            System.out.println("2. Display Users");
            System.out.println("3. Delete User");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            //takes integer as input
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter role: ");
                    String role = sc.nextLine();
                    System.out.print("Enter salary: ");
                    double salary = sc.nextDouble();
                    userList.addUser(name, role, salary);
                    break;
                case 2:
                    userList.displayUsers();
                    break;
                case 3:
                    System.out.print("Enter name to delete: ");
                    String deleteName = sc.nextLine();
                    userList.deleteUser(deleteName);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 4.");
            }
        }
    }
}

