package com.exampleJUnitDemo;


import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    @Test
    public void testAdd() {
    	System.out.println("hell");
        Calculator calc = new Calculator();
        int result = calc.add(5, 3);
        assertEquals(8, result);
    }

    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        int result = calc.subtract(10, 4);
        assertEquals(6, result);
    }
}