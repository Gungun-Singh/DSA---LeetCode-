class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> map = new HashMap<>();
        ArrayList<String> res = new ArrayList<>();

        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }

        int minInd = Integer.MAX_VALUE;

        for(int i=0;i<list2.length;i++){
            if(map.containsKey(list2[i])){
                if(i + map.get(list2[i]) < minInd){
                    minInd = i + map.get(list2[i]);
                    res = new ArrayList<>();
                    res.add(list2[i]);
                }
                else if (i + map.get(list2[i]) == minInd){
                    res.add(list2[i]);
                }
            }
        }

        String[] arr = new String[res.size()];
        for(int i=0;i<res.size();i++){
            arr[i] = res.get(i);
        }
        return arr;
    }
}