package com.wipro.java.oops;

//Abstract class
abstract class LibraryBooks {
	//private variables
	//achieving encapsulation by declaring variables as private
	private String bookName;
	private String author;
	private int bookId;
	
	//parameterized constructor
	public LibraryBooks(String bookName, String author, int bookId) {
		//this keyword represents the instance variables of  the current class
		this.bookName = bookName;
		this.author = author;
		this.bookId = bookId;
	}

	
	
	//getter and setter methods
	public String getBookName() {
		return bookName;
	}
    public void setBookName(String bookName) {
		this.bookName = bookName;
	}

    public String getAuthor() {
		return author;
	}

    public void setAuthor(String author) {
		this.author = author;
	}

    public int getBookId() {
		return bookId;
	}


    public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
	//abstract method
	abstract void displayBookDetails();
	
}

//class Book1 inherits LibraryBooks
class Book1 extends LibraryBooks {
	
	private int pages;
	
	//parameterized constructor
	public Book1(String bookName, String author, int bookId, int pages) {
		//super keyword is used to access the parent class variables
		super(bookName, author, bookId);
		this.pages = pages;
		
	}
	//implementing the abstract method
	void displayBookDetails() {
		System.out.println("Book Name: " +getBookName());
		System.out.println("Author of the book: " +getAuthor());
		System.out.println("Book Id: " +getBookId());
		System.out.println("Number of pages: " + pages);
	}
}
//Achieving inheritance
//child class Book2 inherit LibraryBooks class
class Book2 extends LibraryBooks {
   private int pages;
	
	//parameterized constructor
	public Book2(String bookName, String author, int bookId, int pages) {
		super(bookName, author, bookId);
		this.pages = pages;
		
	}
	//implementing the abstract method
	void displayBookDetails() {
		System.out.println("Book Name: " +getBookName());
		System.out.println("Author of the book: " +getAuthor());
		System.out.println("Book Id: " +getBookId());
		System.out.println("Number of pages: " + pages);
	}
}

//Achieving inheritance
public class Library {
	public static void main(String args[]) {
		
		//Achieving polymorphism
		LibraryBooks lb1 = new Book1("The Miracle Morning", "Hal Elrod", 123, 200);
		LibraryBooks lb2 = new Book2("The Girl With No Dreams","Deepak Gupta", 456, 170);
		
		
		//displaying the details of the books using override methods in classes Book1 and Book2
		lb1.displayBookDetails();
		lb2.displayBookDetails();
	}

}
