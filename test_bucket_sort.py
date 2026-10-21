from bucket_sort import bucket_sort


def test_empty_list():
    assert bucket_sort([]) == []


def test_single_element():
    assert bucket_sort([5]) == [5]


def test_sorted_list():
    assert bucket_sort([1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]


def test_reverse_sorted():
    assert bucket_sort([5, 4, 3, 2, 1]) == [1, 2, 3, 4, 5]


def test_duplicates():
    assert bucket_sort([3, 1, 2, 1, 3]) == [1, 1, 2, 3, 3]


def test_negative_numbers():
    assert bucket_sort([-3, -1, -2, 0, 1]) == [-3, -2, -1, 0, 1]


def test_float_numbers():
    result = bucket_sort([3.14, 1.41, 2.71, 0.57])
    assert result == [0.57, 1.41, 2.71, 3.14]


def test_all_same_elements():
    assert bucket_sort([7, 7, 7, 7]) == [7, 7, 7, 7]


def test_large_range():
    data = [100, 1, 50, 25, 75]
    assert bucket_sort(data) == [1, 25, 50, 75, 100]


def test_custom_bucket_count():
    data = [5, 3, 8, 1, 9, 2, 7, 4, 6, 0]
    result = bucket_sort(data, bucket_count=5)
    assert result == [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]