class Solution {
    public int matrixScore(int[][] arr) {


        int m = arr.length, n = arr[0].length;
        // 0th cols of matrix should have all ones
        for (int i = 0; i < m; i++) {
            if (arr[i][0] == 0) {
                // flip that row
                for (int j = 0; j < n; j++) {
//                    arr[i][j]^=1;
                    arr[i][j] = 1 - arr[i][j];

                }
            }
        }
        // har us columns ko flip kro jisme num of zero are more than ones
        for (int j = 0; j < n; j++) {

            int zeros = 0, ones = 0;

            for (int i = 0; i < m; i++) {
                if (arr[i][j] == 0) zeros++;
                else ones++;

            }
            if (zeros > ones) {
                // flip that columns
                for (int i = 0; i < m; i++) {
                    arr[i][j] ^= 1;
//                        arr[i][j] = 1-arr[i][j];
                }
            }
        }

        int sum = 0;
        int pow = 1;
        for (int j = n - 1; j >= 0; j--) {
            int ones = 0;
            for (int i = 0; i < m; i++) {
                if (arr[i][j] == 1) ones++;

            }
            sum+= pow*ones;
            pow*=2;


        }
        return sum;
    }
}