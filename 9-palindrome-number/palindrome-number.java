class Solution {
     public boolean isPalindrome(int x) {
         if( x< 0) return false;
        int res = 0;
        int copy = x;
        while(x != 0){
            int digit = x % 10;
            res = res*10 + digit;
             x = x/10;
        }
        return (copy==res);
    }
    // public boolean isPalindrome(int x) {
    //       String str = String.valueOf(x);
    //     int i = 0, j = str.length()-1;
    //     while(i<=j){
    //         if(str.charAt(i)!=str.charAt(j)) return false;
    //         i++;
    //         j--;
    //     }
    //     return true;
    // }
}