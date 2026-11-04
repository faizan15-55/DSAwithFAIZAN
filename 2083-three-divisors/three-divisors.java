class Solution {

    // TC - > O(N)
    // public boolean isThree(int n) {

    //    int count = 1;
     

    //    for (int i =1;i<n ;i++) {
    //     if(n % i == 0){
    //         count++;
    //     }
    //    }
    //    if(count!=3){
    //     return false;
    //    }
    //    return true;
    // }
   
    public boolean isThree(int n) {

        int count = 0;

        for (int i = 1; i * i <= n; i++) {

            if (n % i == 0) {

                if (i * i == n) {
                    count++;
                } 
                else {
                    count += 2;
                }
            }

            if (count > 3) {
                return false;
            }
        }

        return count == 3;
    }

}
