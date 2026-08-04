class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        // Arrays.sort(nums);

        // ArrayList<Integer> list = new ArrayList<>();
        
        // if(nums[nums.length-1] - nums[0] +1 == nums.length){
        //     return list;
        // }

        // int curr= nums[0];

        // for(int i=0;i< nums.length;curr++, i++){
        //     if(curr < nums[i]){
        //         list.add(curr);
        //         i--;
        //     }
        // }
        // return list;


        int min =Integer.MAX_VALUE;
        int maxs =Integer.MIN_VALUE;

        HashSet<Integer> set = new HashSet<>();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i< nums.length;i++){
            set.add(nums[i]);
            min= Math.min(min, nums[i]);
            maxs = Math.max(maxs, nums[i]);
        }

        for(int i=min; i<maxs;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}