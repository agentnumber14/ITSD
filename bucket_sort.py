from typing import List


def insertion_sort(arr: List[float]) -> List[float]:
#Сортировка вставками для сортировки внутри корзин.
    for i in range(1, len(arr)):
        key = arr[i]
        j = i - 1
        while j >= 0 and arr[j] > key:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = key
    return arr


def bucket_sort(data: List[float], bucket_count: int = 10) -> List[float]:
    """
    Блочная сортировка.
    
    :param data: список чисел для сортировки
    :param bucket_count: количество корзин
    :return: отсортированный список
    """
    if not data:
        return []
    
    min_val = min(data)
    max_val = max(data)
    
# Если все элементы одинаковые
    if min_val == max_val:
        return data.copy()
    
# Создаём пустые корзины
    buckets: List[List[float]] = [[] for _ in range(bucket_count)]
    
# Распределяем элементы по корзинам
    for value in data:
# Нормализуем значение в диапазон [0, bucket_count - 1]
        index = int((value - min_val) * (bucket_count - 1) / (max_val - min_val))
        buckets[index].append(value)
    
# Сортируем каждую корзину и собираем результат
    result = []
    for bucket in buckets:
        if bucket:
            insertion_sort(bucket)
            result.extend(bucket)
    
    return result