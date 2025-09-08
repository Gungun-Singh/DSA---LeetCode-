class Solution {
    public int[] getNoZeroIntegers(int n) {
        for (int X = 1; X < n; X++) {
            int Y = n - X;

            if (!String.valueOf(X).contains("0") && !String.valueOf(Y).contains("0")) {
                return new int[] { X, Y };
            }
        }

        return new int[0];
    }
}