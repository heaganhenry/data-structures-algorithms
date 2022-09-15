// Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:
// 1. Integers in each row are sorted from left to right. 2. The first integer of each row is greater than the last integer of the previous row.
// Time O(log(m * n), Space O(1)

object Solution {
    def searchMatrix(matrix: Array[Array[Int]], target: Int): Boolean = {
        val rows = matrix.length
        val cols = matrix.head.length

        @annotation.tailrec
        def searchRec(left: Int, right: Int): Boolean = {
            val mid = (left + right) / 2
            if (left == right) false
            else if (matrix(mid / cols)(mid % cols) > target) searchRec(left, mid)
            else if (matrix(mid / cols)(mid % cols) < target) searchRec(mid + 1, right)
            else true
        }

        searchRec(0, cols * rows)
    }
}