class Solution {


        public int uniquePaths(int m, int n) {  // m to n and nto 1
       int[][] dp = new int[m][n];
       
       for(int i =0;i<m;i++){
           for(int j = 0; j<n;j++){
               if(i==0 || j==0){
                   dp[i][j] = 1;
               }
               else{
                   dp[i][j] = dp[i-1][j] + dp[i][j-1];
               }
           }
           
       }
       return dp[m-1][n-1];
    }

    //     static int[][] dp;
    // public int uniquePaths(int m, int n) {  // m to n and nto 1
    //     dp = new int[m+1][n+1];
        
        
    //    return paths(m,n);
    // }
    // public int paths(int m, int n) {  // m to n and nto 1
    //     if(n==1 || m==1) return 1;
    //     if(dp[m][n]!=0) return dp[m][n];
    //     return dp[m][n] =  paths(m,n-1) + paths(m-1,n);

    // }
//   public int uniquePaths(int m, int n) {
//         if(n==1 || m==1) return 1;
          
//         return uniquePaths(m,n-1) + uniquePaths(m-1,n);

//     }
}