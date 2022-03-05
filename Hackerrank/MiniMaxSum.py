# Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. 
# Then print the respective minimum and maximum values as a single line of two space-separated long integers.

def miniMaxSum(arr):
    arr_sum, biggest, smallest = 0, 0, sys.maxsize
    
    for num in arr:
        biggest = max(num, biggest)
        smallest = min(num, smallest)
        arr_sum += num
    
    print(f"{arr_sum - biggest} {arr_sum - smallest}")