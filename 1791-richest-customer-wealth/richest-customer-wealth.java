class Solution {
       public int maximumWealth(int[][] accounts) {
        int maximumWealth = Integer.MIN_VALUE;
        
        for(int person = 0; person< accounts.length;person++) {
            // when you start a new column , take a new sum for that row
            int rowSum = 0;
            for(int wealth = 0; wealth<accounts[person].length;wealth++) {
                rowSum+=accounts[person][wealth];
            }
            // now we have sum of person's wealth
            // check for overal ans
            if(rowSum>maximumWealth){
                maximumWealth = rowSum;
            }
            
        }
        return maximumWealth;
       
    }
}