/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mavenproject1;

// junit imports 
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author devanbabcock
 */
public class Mavenproject1Test {
    // Here we create an instance of our main application named calculator
    private final Mavenproject1 calculator = new Mavenproject1();
    
    // Invoke the junit test functionality
    @org.junit.jupiter.api.Test
    // Assert that the add function from the main application returns the 
    //  expected value (20) when passed x(5) and y(15)
    public void testAdd() {
        assertEquals(20, calculator.add(5, 15));
        // When a test is run, failures will return 
        // both the expected and actual values
    }
    
    @org.junit.jupiter.api.Test
    public void testSubtract1() {
        assertEquals(5, calculator.subtract(10, 5));
    }
    
    @org.junit.jupiter.api.Test
    public void testSubtract2() {
        assertEquals(5, calculator.subtract(5, 10));
        // This test throws a failure due to a lack of fleibility in input order
    }
    
    @org.junit.jupiter.api.Test
    public void testMultiply() {
        assertEquals(20, calculator.multiply(4, 5));
    }
    
    @org.junit.jupiter.api.Test
    public void testDivide1() {
        assertEquals(5, calculator.divide(20, 4));
    }
    
    @org.junit.jupiter.api.Test
    public void testDivide2() {
        assertEquals(5, calculator.divide(4, 20));
        // This test throws a failure due to a lack of fleibility in input order
    }
}
