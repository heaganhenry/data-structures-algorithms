// You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
// Merge nums1 and nums2 into a single array sorted in non-decreasing order.

public class Solution 
{
    public void Merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int last = m + n - 1;
        m--;
        n--;
        
        while (m >= 0 && n >= 0)
        {
            if (nums1[m] > nums2[n])
                nums1[last--] = nums1[m--];
            else
                nums1[last--] = nums2[n--];
        }
        
        while (n >= 0)
            nums1[last--] = nums2[n--];
    }
}