package com.university.lab3;

/**
 * Прямоугольная форма (квадрат для упрощения).
 */
public class Rectangle extends Shape {

    public Rectangle() {
        super("Прямоугольник");
    }

    @Override
    public double getArea(double size) {
        // size здесь выступает как сторона квадрата
        return size * size;
    }
}