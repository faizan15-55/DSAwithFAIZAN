class Solution {
    // It gives TLE error
    // public boolean isPrime(int n ){
    //     if(n<=1){
    //         return false;
    //     }
    //     int sqrt = (int)Math.sqrt(n);
    //     for(int i = 2; i<=sqrt;i++){
    //         if(n%i==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public int countPrimes(int n ){
    //     int count = 0;
    //     if(n<=2) return 0;
    //     for(int i = 2; i<n ;i++){
    //         if(isPrime(i)){
    //             count++;
    //         }
    //     }
    //     return count;
    // }
   
    //    public boolean  isPrime(int n){
    //     for(int i =2;i*i<=n;i++){
    //         if(n % i == 0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public int countPrimes(int n) {
    //        if (n<=0) return n;
    // int count = 0;    
    //     for(int i = 2; i<n;i++){
    //         if(isPrime(i)){
    //             count++;
    //         }
            
    //     }
    //     return count;
    // }
    public int countPrimes(int n) {
       if(n<=1) return 0;
        boolean[] isComposite = new boolean[n];

        for(int i =2;i<=Math.sqrt(n);i++){
            if(isComposite[i]){
                continue;
            }

            for(int j = i*2; j<n;j = j+i ){
                isComposite[j] = true;
            }
        }
        int count = 0;

        for(int i = 2;i<n;i++){
            if(!isComposite[i]){
                count++;
            }

        }
        return count;
    }

}