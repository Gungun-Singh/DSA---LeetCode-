class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int a: nums){
            map.put(a, map.getOrDefault(a,0)+1);
        }

        ArrayList<Integer> list = new ArrayList<>(map.keySet());

        list.sort((a,b)-> map.get(b)-map.get(a));

        int[] arr = new int[k];

        for(int i=0;i<k;i++){
            arr[i]= list.get(i);
        }
        return arr;
    }
}