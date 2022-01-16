# Reverse an array of integers

def reverseArray(array):
    rev_array = []
    for i in range(len(array) - 1, -1, -1):
        rev_array.append(array[i])
    
    return rev_array