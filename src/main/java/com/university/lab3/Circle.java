package com.university.lab3;

/**
 * Круглая форма.
 */
public class Circle extends Shape {

    public Circle() {
        super("Круг");
    }

    @Override
    public double getArea(double size) {
        // size здесь выступает как радиус
        return Math.PI * size * size;
    }
}