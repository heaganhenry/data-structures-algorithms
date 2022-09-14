// Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:
// 1. Integers in each row are sorted from left to right. 2. The first integer of each row is greater than the last integer of the previous row.
// Time O(n), Space O(1)

object Solution {
    def searchMatrix(matrix: Array[Array[Int]], target: Int): Boolean = {
        var outerIdx = 0
        while (outerIdx < matrix.length) {
            for (innerIdx <- matrix(0).indices) {
                if (matrix(outerIdx)(innerIdx) == target) return true
            }
            outerIdx += 1
        }

        return false
    }
}