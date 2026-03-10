class Solution {
    public int minIncrementForUnique(int[] nums) {

      Arrays.sort(nums);
        int res=0;

        for(int i=1;i<nums.length;i++){
            if(nums[i]<= nums[i-1]){
                res = res + nums[i-1] - nums[i]+1;
                nums[i] = nums[i-1]+1;
            }
        }
      
      return res;
    
      
        // Set<Integer> set = new HashSet<>();
        // int moves = 0;

        // for (int num : nums) {
        //     while (set.contains(num)) {
        //         num++;
        //         moves++;
        //     }
        //     set.add(num);
        // }

        // return moves;
    }
}