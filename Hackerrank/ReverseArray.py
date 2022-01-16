# Reverse an array of integers

def reverseArray(array):
    output = []
    for i in range(len(array) - 1, -1, -1):
        output.append(array[i])
    
    return output