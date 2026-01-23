class Solution {
    public int[] searchRange(int[] nums, int target) {

        if (nums.length == 0) {
            return new int[] { -1, -1 };
        }

        int[] index = new int[2];
        int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        if (nums[low] != target) {
            return new int[] { -1, -1 };
        }
        index[0] = low;

        high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low + 1) / 2;
            if (nums[mid] <= target) {
                low = mid;
            } else {
                high = mid - 1;
            }
        }
        index[1] = high;

        return index;
    }
}
