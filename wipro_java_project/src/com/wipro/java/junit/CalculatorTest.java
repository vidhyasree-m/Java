package com.wipro.java.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	//object creation of Calculator class
    private final Calculator cal = new Calculator();
    
    @Test
    public void testAdd() {
    	int result = cal.add(6, 7);
    	assertEquals(13, result);
    }
    
    @Test
    public void testSub() {
    	int result = cal.sub(6, 7);
    	assertEquals(-1, result);
    }
    
    @Test
    public void testMul() {
    	int result = cal.mul(6, 7);
    	assertEquals(42, result);
    }
    
    @Test
    public void testAddWithNegativeValues() {
    	int result = cal.add(-2, -6);
    	assertEquals(-8, result);
    }
    
    @Test
    public void testSubWithNegativeValues() {
    	int result = cal.add(-6, -7);
    	assertEquals(1, result);
    }
    
    @Test
    public void testMulWithNegativeValues() {
    	int result = cal.add(-2, 6);
    	assertEquals(-12, result);
    }
    
}
