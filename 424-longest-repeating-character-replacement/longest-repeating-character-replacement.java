class Solution {

    public int characterReplacement(String s, int k) {
       int[] freq = new int[26];
       int left = 0;
       int maxFreq = 0;
       int maxWindow = 0;
       
       for(int right = 0;right<s.length();right++){
            // update the freq of current character
           freq[s.charAt(right)-'A']++;
             
           // update the max freq 
           maxFreq = Math.max(maxFreq,freq[s.charAt(right)-'A']);
           
           int windowLenght = right-left+1;
           
           // agr jab windowLenght - mxFreq > k,
           // then we need to shrink the window
           if(windowLenght-maxFreq > k){
               freq[s.charAt(left) - 'A']--;
left++;
           }
           
           windowLenght = right-left+1;
           maxWindow = Math.max(maxWindow,windowLenght);
           
       }
       return maxWindow;
    }
}