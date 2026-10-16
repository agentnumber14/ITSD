package com.university.lab3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Главный класс для демонстрации работы иерархии.
 */
public class Main {

    public static void main(String[] args) {
        // 1. Создаем материалы
        Material steel = new Material("Сталь", 7850);
        Material aluminum = new Material("Алюминий", 2700);
        Material copper = new Material("Медь", 8960);

        // 2. Создаем 10+ объектов деталей
        List<Detail> details = new ArrayList<>();
        details.add(new CircleDetail(steel, 0.5));
        details.add(new CircleDetail(aluminum, 0.3));
        details.add(new CircleDetail(steel, 0.7));
        details.add(new RectangleDetail(copper, 0.4));
        details.add(new RectangleDetail(aluminum, 0.6));
        details.add(new RectangleDetail(steel, 0.5));
        details.add(new CircleDetail(steel, 0.8));
        details.add(new RectangleDetail(copper, 0.4));
        details.add(new CircleDetail(aluminum, 0.5));
        details.add(new RectangleDetail(steel, 0.6));
        details.add(new CircleDetail(copper, 0.2));
        details.add(new TriangleDetail(steel, 0.9));

        // 3. Выводим количество деталей
        System.out.println("=== Лабораторная работа 3. Вариант 2 ===\n");
        System.out.println("Общее количество деталей: " + details.size());

        // 4. Подсчитываем общий вес деталей с одинаковой формой
        System.out.println("\n--- Общий вес по формам ---");
        Map<String, Double> weightByShape = new HashMap<>();
        for (Detail detail : details) {
            String shapeName = detail.getShape().getName();
            weightByShape.put(shapeName, 
                weightByShape.getOrDefault(shapeName, 0.0) + detail.getWeight());
        }
        for (Map.Entry<String, Double> entry : weightByShape.entrySet()) {
            System.out.printf("%s: %.3f кг%n", entry.getKey(), entry.getValue());
        }

        // 5. Выводим деталь, которая отличается своей формой 
        // (ищем деталь, чья форма встречается в списке только 1 раз)
        System.out.println("\n--- Деталь с уникальной формой ---");
        Map<String, Integer> countByShape = new HashMap<>();
        for (Detail detail : details) {
            String shapeName = detail.getShape().getName();
            countByShape.put(shapeName, countByShape.getOrDefault(shapeName, 0) + 1);
        }

        boolean found = false;
        for (Detail detail : details) {
            if (countByShape.get(detail.getShape().getName()) == 1) {
                System.out.println("Найдена уникальная деталь: " + detail);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Деталей с уникальной формой не найдено. Выводим первую попавшуюся:");
            System.out.println(details.get(0));
        }
    }
}