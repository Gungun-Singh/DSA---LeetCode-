class Solution {
    public int firstUniqChar(String s) {

        //     int n = s.length();
        
        // for (int i = 0; i < n; i++) {
        //     boolean unique = true;
            
        //     for (int j = 0; j < n; j++) {
        //         if (i != j && s.charAt(i) == s.charAt(j)) {
        //             unique = false;
        //             break;
        //         }
        //     }
            
        //     if (unique) {
        //         return i;
        //     }
        // }
        
        // return -1;





        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}