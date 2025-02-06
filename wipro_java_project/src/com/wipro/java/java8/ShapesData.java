/**
 * 
 */
package com.wipro.java.java8;

/**
 * 
 */
//Should have only one abstract method and can have n number of default or/and static methods
@FunctionalInterface
interface Shape {
	
	//one abstract method
	 double area();
	 
	 //default method1
	 default void nameOfShape(String name) {
		 System.out.println("Shape: " + name);
	 }
	 
	 //default method2
	 
	 default void perimeterDetails(double perimeter){
		 System.out.println("perimeter: " + perimeter);
	 }
	 
	 //static method1
	 static double areaOfCircle(double radius) {
		 return Math.PI * radius * radius;
	 }
	 
	 //static method2
	 
	 static double areaOfRectangle(double length, double width) {
		 return length * width;
	 }
}
 class Circle implements Shape {
	 private double radius;
	 
	 public Circle(double radius) {
		 this.radius = radius;
	 }
	 
	 public double area() {
		 return Shape.areaOfCircle(radius);
	 }
	 
	 public double calculatePerimeter() {
	        return 2 * Math.PI * radius;
	    }
 }
 
 class Rectangle implements Shape {
	    private double length;
	    private double width;

	    public Rectangle(double length, double width) {
	        this.length = length;
	        this.width = width;
	    }

	    @Override
	    public double area() {
	        return Shape.areaOfRectangle(length, width);
	    }

	    public double calculatePerimeter() {
	        return 2 * (length + width);
	    }
	}

public class ShapesData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle circle = new Circle(8.0);
        circle.nameOfShape("Circle");
        System.out.println("Area: " + circle.area());
        circle.perimeterDetails(circle.calculatePerimeter());

        Rectangle rectangle = new Rectangle(12.0, 7.0);
        rectangle.nameOfShape("Rectangle");
        System.out.println("Area: " + rectangle.area());
        rectangle.perimeterDetails(rectangle.calculatePerimeter());

	}

}
