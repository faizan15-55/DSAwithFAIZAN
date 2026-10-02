class Solution {
  public int maxFreqSum(String s) {
      
      int[] freq = new int[26];
      for(char ch : s.toCharArray()){
           freq[ch - 'a']++;
      }
      int vMax = 0;
      int cMax = 0;
      String vowels = "aeiou";
      for(int i =0;i< 26;i++){
          char ch = (char)(i+ 'a');
          int f = freq[i];
          
          if(vowels.indexOf(ch)!=-1){
              vMax = Math.max(vMax,f);
          }
          else{
              cMax = Math.max(cMax,f);
          }
          
      }
      return vMax+cMax;
    }
}