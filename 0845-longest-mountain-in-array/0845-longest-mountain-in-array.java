class Solution {
    public int longestMountain(int[] arr) {
        
        int up=0;
        int down=0;
        int ans=0;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                if(down>0){
                    up = 0;
                    down=0;
                }
                up++;
            }
            else if(arr[i]<arr[i-1]){
                if(up>0){
                down++;
            }
            }
            else{
                up=0;
                down=0;
            }

            if(up>0 && down>0){
                ans = Math.max(ans, up+down+1);
            }
        }

        return ans;
    }
    
}