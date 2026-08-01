class Solution {
    public int[] twoSum(int[] nums, int target) {
        //clone arr
        int[] arr = nums.clone();

        //sort
        Arrays.sort(arr);

        //pointers
        int left = 0;
        int rht = arr.length-1;


        //ref of ptr for orig array
        int fir=0, sec = 0;

        //sum
        while(left<rht){
            int sum = arr[left] + arr[rht];

            if(sum== target){
                fir = arr[left];
                sec = arr[rht];

                break;
            }
            else if(sum<target){
                left++;
            }else{
                rht--;
            }
        }


        //find ref in original nums
        int index1 =-1, index2 = -1;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == fir && index1 == -1){
                index1 =i;
            }
            else if(nums[i] == sec && index2 ==-1){
                index2 =i;
            }
        }

        return new int[]{index1, index2};
    }
}