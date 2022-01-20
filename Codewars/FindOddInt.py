# Given an array of integers, find the one that appears an odd number of times.
# There will always be only one integer that appears an odd number of times.

def findOdd(seq):
    freq = {}

    for num in seq:
        freq[num] = freq.get(num, 0) + 1

    for num in seq:
        if freq[num] % 2 != 0:
            return num