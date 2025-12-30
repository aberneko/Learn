package com.aberneko.learning.Abstract.Interfaces.TaskInterfaceOne;

public class Circle {
    // Радиус круга
    private final double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getArea() {
        return Math.PI * r * r;
    }
}