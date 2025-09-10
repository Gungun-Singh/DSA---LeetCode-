class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n= numbers.length;
        int left =0, right = n-1;

        

        while(left< right){
            if(numbers[left] + numbers[right] == target){
                int arr[] = { left+1, right+1 };
                return arr;
            }
            else if(numbers[left] + numbers[right] > target){
                    right--;
            }
            else{
                left++;
            }

        }

        return null;






        // //    O(N2) solution
        // for (int i = 0; i < numbers.length; i++) {
        //     for (int j = i + 1; j < numbers.length; j++) {
        //         if (numbers[i] + numbers[j] == target) {
        //             int arr[] = { i+1, j+1 };
        //             return arr;
        //         }

        //     }
        // }
        // return null;
    }
}