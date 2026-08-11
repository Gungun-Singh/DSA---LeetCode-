class Solution {
    public List<String> commonChars(String[] words) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch: words[0].toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for(int i=1;i<words.length;i++){
        HashMap<Character, Integer> curr =new HashMap<>();

            for(char ch: words[i].toCharArray()){
                curr.put(ch, curr.getOrDefault(ch, 0) + 1);
            }

            for (char ch : map.keySet()) {

                if (curr.containsKey(ch)) {
                    map.put(ch, Math.min(map.get(ch), curr.get(ch)));
                } else {
                    map.put(ch, 0);
                }
            }
        }

        List<String> result = new ArrayList<>();
            for (char ch : map.keySet()) {

            int count = map.get(ch);

            while (count > 0) {
                result.add(String.valueOf(ch));
                count--;
            }
        }

        return result;
    }
}