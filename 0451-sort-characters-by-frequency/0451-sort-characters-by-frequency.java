class Solution {
    public String frequencySort(String s) {
        char[] ch = s.toCharArray();

        HashMap<Character, Integer> map = new LinkedHashMap<>();

        for(char c: ch){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        ArrayList<Character> list = new ArrayList<>(map.keySet());

        list.sort((a,b) -> map.get(b)- map.get(a));

        StringBuilder sb = new StringBuilder();

        for(char c: list){
            int freq = map.get(c);

            for(int i=0;i<freq;i++){
                sb.append(c);
            }
        }

        return sb.toString();       
    }
}