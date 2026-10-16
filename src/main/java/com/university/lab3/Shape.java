package com.university.lab3;

/**
 * Абстрактный класс, представляющий форму детали.
 * Демонстрирует полиморфизм.
 */
public abstract class Shape {
    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * Вычисляет площадь формы.
     * @param size линейный размер формы
     * @return площадь
     */
    public abstract double getArea(double size);

    @Override
    public String toString() {
        return name;
    }
}