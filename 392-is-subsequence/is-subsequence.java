class Solution {
     public boolean isSubsequence(String s, String t) {

     int i = 0, j = 0;  // Start kro two pointers at the first cahracter of each string

     while(i<s.length()  && j<t.length()){
         if(s.charAt(i)== t.charAt(j)){  // if both are the same then move both pointers
             i++;
             j++;

         }else{
             j++;
         }
     }

        return (i==s.length());  // i reach a very end 
    }
}