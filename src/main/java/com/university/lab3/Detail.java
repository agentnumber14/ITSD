package com.university.lab3;

/**
 * Абстрактный класс детали.
 * Использует КОМПОЗИЦИЮ: содержит объекты Shape и Material.
 */
public abstract class Detail {
    private final Shape shape;
    private final Material material;
    private final double size;

    public Detail(Shape shape, Material material, double size) {
        this.shape = shape;
        this.material = material;
        this.size = size;
    }

    public Shape getShape() {
        return shape;
    }

    public Material getMaterial() {
        return material;
    }

    public double getSize() {
        return size;
    }

    /**
     * Вычисляет вес детали: площадь * плотность.
     * @return вес в кг
     */
    public double getWeight() {
        return shape.getArea(size) * material.getDensity();
    }

    @Override
    public String toString() {
        return String.format("Деталь [форма=%s, материал=%s, размер=%.2f м, вес=%.3f кг]",
                shape.getName(), material.getName(), size, getWeight());
    }
}
