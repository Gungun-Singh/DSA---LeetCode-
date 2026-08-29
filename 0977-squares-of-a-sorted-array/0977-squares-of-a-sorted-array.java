class Solution {
    public int[] sortedSquares(int[] nums) {
        int l =0;
        int r= nums.length-1;

        int j= nums.length-1;

        int[] arr = new int[nums.length];

        while(l<=r){
            if(Math.abs(nums[r])>Math.abs(nums[l])){
                arr[j] = nums[r]*nums[r];
                j--;
                r--;
            }
            else{
                arr[j]= nums[l]*nums[l];
                j--;
                l++;
            }
        }
        return arr;
    }
}