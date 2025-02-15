package com.wipro.java.designpattern.builder;

/* Builder pattern is used to create complex objects step by step. Instead of having a
 * constructor with too many parameters, we use a builder class to set values only for 
 * required fields.
 * Common builder interface
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
	
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}