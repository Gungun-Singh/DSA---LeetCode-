class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> map = new HashMap<>();

        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");

        for(String word: arr1){
            map.put(word, map.getOrDefault(word, 0)+1);
        }

        for(String word: arr2){
            map.put(word, map.getOrDefault(word, 0)+1);
        }

       ArrayList<String> res = new ArrayList<>();

        for(String key: map.keySet()){
            if(map.get(key)==1){
                res.add(key);
            }
        }
        return res.toArray(new String[0]);
    }
}