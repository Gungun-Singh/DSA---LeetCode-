class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;

        Arrays.sort(nums);

        int[] arr = new int[n];

        int temp = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != val) {
                arr[temp] = nums[i];
                temp++;
            }
        }

        for (int j = 0; j < n; j++) {
            nums[j] = arr[j];
        }

        return temp;

    }
}