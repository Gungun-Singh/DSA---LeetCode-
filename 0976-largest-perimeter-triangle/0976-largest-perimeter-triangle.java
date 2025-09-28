class Solution {
    public int largestPerimeter(int[] nums) {
   Arrays.sort(nums);

        // Iterate from largest to find the largest perimeter
        for (int i = nums.length - 1; i >= 2; i--) {
            if (nums[i - 1] + nums[i - 2] > nums[i]) {
                // If inequality return perimeter
                return nums[i] + nums[i - 1] + nums[i - 2];
            }
        }

        // If no valid triangle, return 0
        return 0;     
    }
}