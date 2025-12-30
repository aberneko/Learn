package com.aberneko.learning.Abstract.Interfaces.TaskInterfaceOne;

public class Square {
    // Длина стороны квадрата
    private final double a;

    public Square(double a) {
        this.a = a;
    }

    public double getArea() {
        return a * a;
    }
}