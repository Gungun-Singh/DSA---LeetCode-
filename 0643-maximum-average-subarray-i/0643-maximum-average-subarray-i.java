class Solution {
    public double findMaxAverage(int[] nums, int k) {

    double sum=0;
   int n = nums.length;
    double avg = 0;

   for(int i=0;i<k;i++){
    sum +=nums[i];
    avg = sum/k;
   }
    double max=avg;

    for(int i=1;i<=n-k;i++){
        sum = (sum-nums[i-1] + nums[i+k-1]);
        avg = sum/k;
        if(avg>=max){
            max = avg;
        }
    }

return max;
    }
}