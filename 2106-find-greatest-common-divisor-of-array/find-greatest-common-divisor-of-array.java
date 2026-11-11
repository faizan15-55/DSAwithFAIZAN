class Solution {
//        private int GCD(int a, int b) {
//         a = Math.abs(a);
//         b = Math.abs(b);
// //        case -1
//         if(a==0 && b==0) return 0;
//         if(a==0) return b;
//         if(b==0) return a;
//         int min = Math.min(a,b);

//         int res =1;
//         for(int i = 2;i<=min;i++){
//             if(a % i==0 && b%i==0){
//                 res = i;
//             }
//         }
//         return res;
//     }
  private int EvalGCD(int a, int b) {
        if(b>a) {
            return EvalGCD(b,a);
        }
        while (b>0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<min) {
               min = nums[i];
            }
            if(nums[i]>max){
                max = nums[i];

            }
        }
        int a = max ;
        int b = min;
         return  EvalGCD(a, b);
    }
}