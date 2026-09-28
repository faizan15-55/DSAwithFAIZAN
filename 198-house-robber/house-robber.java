class Solution {
      static int[] dp;

    public int rob(int[] nums) {
        
       int n = nums.length;
       dp = new int[n];
       Arrays.fill(dp,-1); // mark;
        return loot(0,nums);
    }

    private int loot(int i,int[] nums){  // i is comes from 0 and moves toward n-1

        if(i>=nums.length) return 0;
        if(dp[i]!=-1) return dp[i];  // call se pehle check and then moves
        int pick =nums[i]+ loot(i+2,nums);
        int skip= loot(i+1,nums);
        int ans =  Math.max(pick,skip);
        dp[i] = ans;  // if not in dp
       
        return  ans;
    }
}