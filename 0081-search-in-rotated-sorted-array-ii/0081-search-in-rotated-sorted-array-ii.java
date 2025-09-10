class Solution {
    public boolean search(int[] nums, int target) {
        int n =nums.length;
        int left = 0, right = n-1;

        while(left<=right){
            int mid = left + (right-left)/2;
            if(target == nums[mid]){
                return true;
            }


             if (nums[left] == nums[mid]) {
                left++;
                continue;
            }


            if(nums[left] <= nums[mid]){
                if(target < nums[mid] && nums[left] <= target){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }
            else{
                if(target > nums[mid] && nums[right] >= target){
                    left = mid+1;
                }
                else{
                    right = mid-1;
                }
            }
                }

            return false;





       
    }
}