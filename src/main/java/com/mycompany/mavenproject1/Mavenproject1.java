/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

// This is a basic Maven project which exhibits the use of jUnit tests
//  to assert that the simple calculations function as intended

/**
 *
 * @author devanbabcock
 */
public class Mavenproject1 {

    public static void main(String[] args) {
    }
    
    public int multiply (int x,int y) {
        return x*y;
    }
    
    public int divide (int x,int y) {
// Solution to pass the divide test
//        if (x>y) {return x/y;}
//        if (y>x) {return y/x;}
        return x/y;
    }
 
    public int add (int x,int y) {
        return x+y;
    }
    
    public int subtract (int x,int y) {
// Solution to pass the subtract test
//        if (x>y) {return x-y;}
//        if (y>x) {return y-x;}
        return x-y;
    }
}
