from typing import List


def input_data() -> List[float]:
#Получение данных от пользователя.
    print("Введите числа через пробел:")
    raw = input().strip()
    try:
        return [float(x) for x in raw.split()]
    except ValueError:
        print("Ошибка: введите только числа")
        return input_data()


def input_bucket_count() -> int:
#Получение количества корзин.
    print("Введите количество корзин (по умолчанию 10):")
    raw = input().strip()
    if not raw:
        return 10
    try:
        count = int(raw)
        return count if count > 0 else 10
    except ValueError:
        print("Ошибка: введите целое положительное число")
        return input_bucket_count()


def output_result(result: List[float]) -> None:
#Вывод результата.
    print("\nОтсортированный массив:")
    print(" ".join(str(x) for x in result))