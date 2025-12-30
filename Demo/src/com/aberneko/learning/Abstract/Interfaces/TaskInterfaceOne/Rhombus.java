package com.aberneko.learning.Abstract.Interfaces.TaskInterfaceOne;

public class Rhombus {
    // Длина стороны ромба
    private final double a;
    // Высота ромба
    private final double h;

    public Rhombus(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public double getArea() {
        return a * h;
    }
}