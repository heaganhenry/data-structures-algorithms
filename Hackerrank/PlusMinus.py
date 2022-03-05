# Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. 
# Print the decimal value of each fraction on a new line with  places after the decimal.

def plusMinus(arr):
    pos, neg, zero = 0, 0, 0
    total = len(arr)
    
    for num in arr:
        if num > 0: pos += 1
        elif num < 0: neg += 1
        else: zero += 1
    
    pratio, nratio, zratio = pos/total, neg/total, zero/total
    print(f"{pratio:.6f}\n{nratio:.6f}\n{zratio:.6f}")