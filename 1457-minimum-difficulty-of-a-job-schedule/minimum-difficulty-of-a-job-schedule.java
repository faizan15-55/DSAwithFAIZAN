class Solution {

    int[][] dp = new int[301][11];

    int solve(int[] jd, int n, int idx, int d) {

        // Base case: Only one day remains
        if (d == 1) {
            int maxD = jd[idx];

            for (int i = idx; i < n; i++) {
                maxD = Math.max(maxD, jd[i]);
            }

            return maxD;
        }

        // Check if the result is already calculated
        if (dp[idx][d] != -1) {
            return dp[idx][d];
        }

        int maxD = jd[idx];
        int finalRes = Integer.MAX_VALUE;

        for (int i = idx; i <= n - d; i++) {

            maxD = Math.max(maxD, jd[i]);

            int result = maxD + solve(jd, n, i + 1, d - 1);

            finalRes = Math.min(finalRes, result);
        }

        // Store the result before returning
        return dp[idx][d] = finalRes;
    }

    public int minDifficulty(int[] jd, int d) {

        int n = jd.length;

        if (n < d) {
            return -1;
        }

        // Initialize DP array with -1
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(jd, n, 0, d);
    }
}