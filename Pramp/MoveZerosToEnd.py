# Given a static-sized array of integers arr, move all zeroes in the array to the end of the array. You should preserve the relative order of items in the array.

def moveZerosToEnd(array):
    write = 0
    for read in range(len(array)):
        if array[read] != 0:
            array[read], array[write] = array[write], array[read]
            write += 1

    return array