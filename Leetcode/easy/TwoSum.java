// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// Time O(n), Space O(n)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (hashMap.containsKey(diff))
                return new int[]{hashMap.get(diff), i};
            hashMap.put(nums[i], i);
        }

        return new int[]{0, 0};
    }
}