class Solution {
   public int[] singleNumber(int[] arr) {
      
        int xor = 0;
        for(int ele : arr){
            xor^=ele;
        }
        
        int rightSetBitMask = (xor&(xor-1))^xor; // rigthmost setbit mask of xor
        int b1 = 0, b2 = 0;
        for(int ele : arr){
            if((ele&rightSetBitMask)!=0) b1^=ele;
            else b2^=ele;
        }
        
        int[] ans ={b1,b2} ;
         return ans;
        

    }
}