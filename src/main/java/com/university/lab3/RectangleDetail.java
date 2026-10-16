package com.university.lab3;

/**
 * Прямоугольная деталь. Наследует Detail.
 */
public class RectangleDetail extends Detail {

    public RectangleDetail(Material material, double size) {
        super(new Rectangle(), material, size);
    }
}