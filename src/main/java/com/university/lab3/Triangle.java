package com.university.lab3;

/**
 * Треугольная форма (равносторонний треугольник).
 */
public class Triangle extends Shape {

    public Triangle() {
        super("Треугольник");
    }

    @Override
    public double getArea(double size) {
        // size здесь выступает как длина стороны
        return (Math.sqrt(3) / 4) * size * size;
    }
}
