package com.wipro.java.designpattern.singleton;
/*
 * Singleton pattern in java ensures that a class has only one instance and provides a global access
 * to that instance. This pattern is commonly used for logging, database connections and thread pools.
 * 
 * Singleton single-threaded
 */
public final class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton(String value) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
