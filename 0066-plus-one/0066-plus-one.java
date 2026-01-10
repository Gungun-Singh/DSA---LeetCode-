class Solution {
    public int[] plusOne(int[] digits) {
          for (int i = digits.length - 1; i >= 0; i--) {
            // If the current digit is less than 9, just increment it
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If the digit is 9, it becomes 0
            digits[i] = 0;
        }

        // If we exit the loop, it means all digits were 9, so we need a new array
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1; // The result is '1000...' for cases like 999 -> 1000
        return newDigits;

        }
    }
