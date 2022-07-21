// You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
// Merge nums1 and nums2 into a single array sorted in non-decreasing order.
// Time O(m + n), Space O(1)

object Solution {
    def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
        (m + n - 1 to 0 by -1).foldLeft(m - 1, n - 1) {
            case ((i, j), k) =>
                if (i < 0) {
                    nums1(k) = nums2(j)
                    i -> (j - 1)
                } else if (j < 0) {
                    nums1(k) = nums1(i)
                    (i - 1) -> j
                } else {
                    if (nums1(i) > nums2(j)) {
                        nums1(k) = nums1(i)
                        (i - 1) -> j
                    } else {
                        nums1(k) = nums2(j)
                        i -> (j - 1)
                    }
                }
        }
    }
}