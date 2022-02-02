# You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
# Merge nums1 and nums2 into a single array sorted in non-decreasing order.

class Solution(object):
    def merge(self, nums1, m, nums2, n):
        last = m + n - 1
        m, n = m - 1, n - 1
        
        while m >= 0 and n >= 0:
            if nums1[m] > nums2[n]:
                nums1[last] = nums1[m]
                m -= 1
            else:
                nums1[last] = nums2[n]
                n -= 1
            last -= 1
        
        while n >= 0:
            nums1[last] = nums2[n]
            last, n = last - 1, n - 1