from bucket_sort import bucket_sort
from io_functions import input_data, input_bucket_count, output_result


def main():
    print("=== Блочная сортировка (Bucket Sort) ===\n")
    
    data = input_data()
    bucket_count = input_bucket_count()
    
    print(f"\nИсходный массив: {' '.join(str(x) for x in data)}")
    print(f"Количество корзин: {bucket_count}")
    
    result = bucket_sort(data, bucket_count)
    
    output_result(result)


if __name__ == "__main__":
    main()