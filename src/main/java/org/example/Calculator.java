package org.example;

public class Calculator {

    public void display(float a,float b) {

        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();

        System.out.println("Addition: " + addition.add(a, b));
        System.out.println("Subtraction: " + subtraction.subtract(a, b));
        System.out.println("Multiplication: " + multiplication.multiply(a, b));
        System.out.println("Division: " + division.divide(a, b));
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.display(20, 5);
    }
}
