class Solution {
    public int findPeakElement(int[] nums) {
         
         int n = nums.length;

         /*
       if(n==1){
           return 0;
       }

       for(int i = 0;i<n;i++){
           if(i==0){
               if(nums[i]>=nums[i+1]){
                   return i;
               }
           }

          else if(i==n-1){
               if(nums[i]>=nums[i-1]){
                   return i;
               }
           }
           else 
           if(nums[i]>=nums[i-1] && nums[i]>=nums[i+1]){
               return i;
           }
       }
       return -1;
    }
}

}

*/

int start =0;
int end = n-1;

while(start<end){
    int mid = start + (end-start)/2;

    if(nums[mid]>nums[mid+1]){
        end = mid;
    } 
    else{
        start = mid +1;
    }
}
    return start;
         }
    }
    
