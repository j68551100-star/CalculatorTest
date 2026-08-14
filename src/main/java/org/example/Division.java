package org.example;

public class Division {

    public float divide(float a, float b) {

        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        return a / b;
    }
}
