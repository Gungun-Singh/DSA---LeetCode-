class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();

        HashSet<Integer> res= new HashSet<>();

        for(int num: nums1){
            set.add(num);
        }

        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                    res.add(nums2[i]);
            }
        }

        int[] arr= new int[res.size()];

        int i=0;
        for(int n: res){
            arr[i] = n;
            i++;
        }

        return arr;
    }
}