package com.university.lab3;

/**
 * Класс, описывающий материал детали.
 */
public class Material {
    private final String name;
    private final double density; // плотность в кг/м^3

    public Material(String name, double density) {
        this.name = name;
        this.density = density;
    }

    public String getName() {
        return name;
    }

    public double getDensity() {
        return density;
    }

    @Override
    public String toString() {
        return name;
    }
}
