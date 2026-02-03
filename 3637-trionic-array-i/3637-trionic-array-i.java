class Solution {
    public boolean isTrionic(int[] nums) {
         int n = nums.length;
        if (n < 4) return false;

        int i = 0;

        // strictly inc
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }
        if (i == 0) return false;   // no inc

        // strictly dec
        while (i + 1 < n && nums[i] > nums[i + 1]) {
            i++;
        }
        if (i == 0 || i == n - 1) return false; // no dec

        // strictly inc
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }

        return i == n - 1;
    }
}