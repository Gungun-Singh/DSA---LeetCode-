class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] arr = s.split(" ");

        if(pattern.length()!= arr.length){
            return false;
        }

        HashMap<Character, String> map =new HashMap<>();

        for(int i=0;i<pattern.length();i++){
        char orig = pattern.charAt(i);
        String rep = arr[i];

            if(!map.containsKey(orig)){
                if(!map.containsValue(rep)){
                    map.put(orig, rep);
                }
                else{
                    return false;
                }
            }
            else{
                String mappedSt = map.get(orig);
                if(!mappedSt.equals(rep)){
                    return false;
                }
            }
        }

        return true;
    }
}