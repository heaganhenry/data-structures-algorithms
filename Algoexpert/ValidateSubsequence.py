# Given two non-empty arrays of integers, write a function that determines whether the second array is a subsequence of the first one.

def isValidSubsequence(array, sequence):
    i, j = 0, 0

    while i < len(array) and j < len(sequence):
        if array[i] == sequence[j]:
            j += 1
        i += 1
		
    return j == len(sequence)