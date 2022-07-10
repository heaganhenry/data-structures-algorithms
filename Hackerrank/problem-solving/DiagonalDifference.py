# Given a square matrix, calculate the absolute difference between the sums of its diagonals.

def diagonalDifference(arr):
    left_sum = 0
    right_sum = 0
    
    for i in range(len(arr)):
        left_sum += arr[i][i]
        right_sum += arr[i][-i-1]
        
    return abs(left_sum - right_sum)