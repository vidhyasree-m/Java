//create a pojo class for animal
package com.wipro.java.oops;

/** No constructor
 * getters have return value
 * setters have no return value
 * properties are determined using private fields
 * values or behaviour's are determined through setters
 * toString will convert the entire animal class with properties and behaviour's
 * @author vidhyasree
 */
public class Animal {
	
	//private properties 
	private String animalName;// This is animal name
	private String animalColor;// This is animal color
	private String animalType;// This is animal type
	
   //getter for animal name
	public String getAnimalName() {
		return animalName;
	}
    //setter for animal name
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	//getter for animal color
	public String getAnimalColor() {
		return animalColor;
	}

	//setter for animal color
	public void setAnimalColor(String animalColor) {
		this.animalColor = animalColor;
	}
	
	//getter for animal type
	public String getAnimalType() {
		return animalType;
	}

	//setter for animal type
	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}
	
}
