package com.lab8.Calculator;

/**
 * Hello world!
 *
 */

public class App {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println("Add: " + c.add(5, 3));
        System.out.println("Subtract: " + c.sub(5, 3));
        System.out.println("Multiply: " + c.mul(5, 3));
        System.out.println("Divide: " + c.div(10, 2));
    }
}
