class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int countLess= 0, countEqual= 0;

        for (int num: nums){
            if (num <target)countLess++;
            else if(num== target)countEqual++;
        }

        List<Integer> result =new ArrayList<>();
        for (int i = 0;i< countEqual;i++) {
            result.add(countLess+i);
        }
        return result;
    }
}