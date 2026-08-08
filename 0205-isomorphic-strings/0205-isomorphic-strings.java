class Solution {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char orig = s.charAt(i);
            char rep = t.charAt(i);

            if (!map.containsKey(orig)) {

                if (!map.containsValue(rep)) {
                    map.put(orig, rep);
                } 
                else {
                    return false;
                }

            } else {

                char mappedCh = map.get(orig);

                if (mappedCh != rep) {
                    return false;
                }
            }
        }

        return true;
    }
}