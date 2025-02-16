package com.wipro.java.designpattern.singleton;
//Singleton Multi-threaded
public final class SingletonMT {
    private static SingletonMT instance;
    public String value;

    private SingletonMT(String value) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static SingletonMT getInstance(String value) {
        if (instance == null) {
            instance = new SingletonMT(value);
        }
        return instance;
    }
}