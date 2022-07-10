// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
// Notice that the solution set must not contain duplicate triplets.
// Time O(n^2), Space O(n)

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
          if (i > 0 && nums[i] == nums[i - 1])
            continue;

          int left = i + 1, right = nums.length - 1;
          while (left < right) {
            int threeSum = nums[i] + nums[left] + nums[right];
            if (threeSum == 0) {
              triplets.add(Arrays.asList(nums[i], nums[left++], nums[right--]));
              while (left < right && nums[left] == nums[left - 1])
                left++;
              while (left < right && nums[right] == nums[right + 1])
                right--;
            } else if (threeSum < 0)
              left++;
            else
              right--;
          }
        }

        return triplets;
    }
}