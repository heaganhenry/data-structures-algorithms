# Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

class Solution(object):
    def getRow(self, rowIndex):
        triangle = [[1]]
        
        for i in range(rowIndex):
            temp = [0] + triangle[-1] + [0]
            row = []
            for j in range(len(triangle) + 1):
                row.append(temp[j] + temp[j + 1])
            triangle.append(row)
        
        return triangle[-1]