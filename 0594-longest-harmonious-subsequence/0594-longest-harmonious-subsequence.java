class Solution {
    public int findLHS(int[] nums) {

    HashMap<Integer, Integer> map =new HashMap<>();
    for(int num:nums){
        map.put(num, map.getOrDefault(num,0)+1);
    }

    int maxL =0;

    for (int num : map.keySet()) {

            if (map.containsKey(num + 1)) {

                int len = map.get(num) + map.get(num + 1);

                maxL = Math.max(maxL, len);
            }
    }
    return maxL;



        // Arrays.sort(nums);

        // int j=0;
        // int maxL =0;

        // for(int i=0;i<nums.length;i++){
        //     while(nums[i]-nums[j]>1){
        //         j++;
        //     }
        //     if(nums[i]-nums[j]==1){
        //         maxL = Math.max(maxL, i-j+1);
        //     }
        // }
        // return maxL;
    }
}