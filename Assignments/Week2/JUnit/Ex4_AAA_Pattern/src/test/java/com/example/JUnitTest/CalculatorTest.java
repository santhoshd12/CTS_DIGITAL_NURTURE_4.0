package com.example.JUnitTest;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calc;  // Shared for all tests

    // ✅ Setup - runs before each @Test method
    @Before
    public void setUp() {
        System.out.println("Setting up...");
        calc = new Calculator();
    }

    // ✅ Teardown - runs after each @Test method
    @After
    public void tearDown() {
        System.out.println("Cleaning up...");
        calc = null;
    }

    @Test
    public void testAdd() {
        // Arrange: (Setup done in @Before)

        // Act:
        int result = calc.add(10, 5);

        // Assert:
        assertEquals(15, result);
    }

    @Test
    public void testSubtract() {
        // Arrange:

        // Act:
        int result = calc.subtract(20, 8);

        // Assert:
        assertEquals(12, result);
    }
}
