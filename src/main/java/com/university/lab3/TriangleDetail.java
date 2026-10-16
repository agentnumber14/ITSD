package com.university.lab3;

/**
 * Треугольная деталь. Наследует Detail.
 */
public class TriangleDetail extends Detail {

    public TriangleDetail(Material material, double size) {
        super(new Triangle(), material, size);
    }
}