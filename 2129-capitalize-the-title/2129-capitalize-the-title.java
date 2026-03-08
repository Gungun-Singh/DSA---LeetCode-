class Solution {
    public String capitalizeTitle(String title) {
        char[] ch = title.toCharArray();

        int len= ch.length;
        int i=0;

        while(i<len){

            int first=i;
            while(i<len && ch[i] != ' '){
            ch[i] = Character.toLowerCase(ch[i]);
            i++;
        }

        if((i-first) >2){
            ch[first] = Character.toUpperCase(ch[first]);
        }
        i++;
    }
   return new String(ch);

}
}