package com.university.lab3;

/**
 * Круглая деталь. Наследует Detail.
 */
public class CircleDetail extends Detail {

    public CircleDetail(Material material, double size) {
        super(new Circle(), material, size);
    }
}
