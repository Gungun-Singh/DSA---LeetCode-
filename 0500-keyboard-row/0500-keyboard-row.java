class Solution {
    public String[] findWords(String[] words) {
        HashSet<Character> row1 = new HashSet<>();
        HashSet<Character> row2 = new HashSet<>();
        HashSet<Character> row3 = new HashSet<>();

        for(char ch: "qwertyuiop".toCharArray()){
            row1.add(ch);
        }
        
        for(char ch: "asdfghjkl".toCharArray()){
            row2.add(ch);
        }

        for(char ch: "zxcvbnm".toCharArray()){
            row3.add(ch);
        }

    ArrayList<String> list =new ArrayList<>();

        for(String word: words){
           String lower = word.toLowerCase();
            char fir =lower.charAt(0);

            HashSet<Character> currSet;

            if(row1.contains(fir)){
                currSet = row1;
            }else if(row2.contains(fir)){
                currSet =row2;
            }else{
                currSet =row3;
            }

            boolean valid= true;

            for(char ch: lower.toCharArray()){
                if(!currSet.contains(ch)){
                    valid= false;
                    break;
                }
            }

            if(valid == true){
                list.add(word);
            }
        }

        return list.toArray(new String[0]);
     }
}