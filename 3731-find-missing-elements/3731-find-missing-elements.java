class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);

        ArrayList<Integer> list = new ArrayList<>();
        
        if(nums[nums.length-1] - nums[0] +1 == nums.length){
            return list;
        }

        int curr= nums[0];

        for(int i=0;i< nums.length;curr++, i++){
            if(curr < nums[i]){
                list.add(curr);
                i--;
            }
        }
        return list;
    }
}