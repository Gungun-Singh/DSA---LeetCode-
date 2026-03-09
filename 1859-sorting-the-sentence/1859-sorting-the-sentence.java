class Solution {
    public String sortSentence(String s) {
        String[] st =s.split(" ");

        String[] word = new String[st.length];

        StringBuilder sb = new StringBuilder();
        int i=0;

        for(String a: st){
            i= (int) (a.charAt(a.length()-1)-'0');
            word[i-1] = a.substring(0,a.length()-1);
        }

        for(i=0;i<word.length-1;i++)
            sb.append(word[i]).append(" ");
            sb.append(word[i]);

        return sb.toString();
    }
}