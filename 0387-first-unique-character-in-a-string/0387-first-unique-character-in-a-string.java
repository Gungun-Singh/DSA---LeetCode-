class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch:s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i]) ==1){
                return i;
            }
        }
        return -1;

    }
}