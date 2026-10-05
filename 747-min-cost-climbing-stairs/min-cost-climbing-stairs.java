class Solution {
    public int minCostClimbingStairs(int[] cost) {
            int n = cost.length;
            int[] dp = new int[n];
            dp[0] = cost[0];
            dp[1] = cost[1];
            for(int i = 2;i<n;i++){
                dp[i] = cost[i] +Math.min(dp[i-1],dp[i-2]);
                
            }
            
            return Math.min(dp[n-1],dp[n-2]);
    //     int n = cost.length;
    //     int[] dp = new int[n];

    //     Arrays.fill(dp, -1);

    //     return Math.min(minCost(0, cost, dp),
    //                     minCost(1, cost, dp));
    // }

    // private int minCost(int i, int[] cost, int[] dp) {
    
        // if (i >= cost.length) {
        //     return 0;
        // }

        // if (dp[i] != -1) {
        //     return dp[i];
        // }

        // dp[i] = cost[i] + Math.min(
        //     minCost(i + 1, cost, dp),
        //     minCost(i + 2, cost, dp)
        // );

        // return dp[i];
    }
}