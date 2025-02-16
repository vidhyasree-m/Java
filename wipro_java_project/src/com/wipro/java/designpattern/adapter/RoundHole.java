package com.wipro.java.designpattern.adapter;

/* The Adapter Pattern is a structural design pattern that allows incompatible interfaces to work together.
 * It acts as a bridge between two incompatible classes by converting one interface into another.
 * RoundHoles are compatible with RoundPegs.
 */
public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }
}