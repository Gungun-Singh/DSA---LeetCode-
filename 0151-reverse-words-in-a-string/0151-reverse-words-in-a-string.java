class Solution {
    public String reverseWords(String s) {
        String[] word= s.trim().split("\\s+");

        Stack<String> st =new Stack<>();

        for(String w:word){
            st.push(w);
        }

        StringBuilder sb = new StringBuilder();

        while(!st.isEmpty()){
            sb.append(st.pop());
            sb.append(" ");
        }
            String ans= sb.toString();
            ans = ans.trim();
        return ans;
    }
}