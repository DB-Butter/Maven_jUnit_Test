/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mavenproject1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author devanbabcock
 */
public class Mavenproject1Test {
    private final Mavenproject1 calculator = new Mavenproject1();

    
    public Mavenproject1Test() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
        app = new Mavenproject1();
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }

    /**
     * Test of main method, of class Mavenproject1.
     */
    @org.junit.jupiter.api.Test
    public void testAdd() {
        assertEquals(20, calculator.add(5, 15));
    }
    
    @org.junit.jupiter.api.Test
    public void testSubtract1() {
        assertEquals(5, calculator.subtract(10, 5));
    }
    
    @org.junit.jupiter.api.Test
    public void testSubtract2() {
        assertEquals(5, calculator.subtract(5, 10));
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
    }
}
