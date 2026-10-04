class Solution {   // USING DYNAMIc PROGRAMMING

//    static int[] dp;
//     public int nthfibo(int n) {
//         if(n<=1) return n;
//         if(dp[n]!=0) return dp[n];  // extra
//        int ans = nthfibo(n-1)+nthfibo(n-2);
//        dp[n] = ans;  // extra
//         return ans;
//     }
//     public int fib(int n){
//      dp = new int[n+1];
//      return nthfibo(n);
//     }

public static int fib(int n) {
    int[] dp = new int[n + 1];
    if(n>=1)  dp[1] = 1;
    for (int i = 2; i <= n; i++) {
        dp[i] = dp[i - 1] + dp[i - 2];
    }

    return dp[n];


}
}
// class Solution {
//     public int fib(int n) {
//         if(n==0) return 0;
//         if(n==1) return 1;
//         return fib(n-1)+fib(n-2);
//     }
// }