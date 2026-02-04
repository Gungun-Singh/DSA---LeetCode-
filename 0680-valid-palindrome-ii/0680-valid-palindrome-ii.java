class Solution {
    public boolean validPalindrome(String s) {
        int l=0, r= s.length()-1;

        while(l<r){
            if(s.charAt(l) == s.charAt(r)){
                l++;
                r--;
            }
            else{
                return isPal(s,l+1,r) || isPal(s,l,r-1);
            }
        }
        return true;
    }

    boolean isPal(String s, int left, int right){
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}