class Solution {
   public boolean rotateString(String s, String goal) {
        // ham kisi ek repeat karke ye pata kar sakte hain ki wo dusre ka rotate version hai ki nhi 
        if(s.length()!=goal.length()) return false;
        
        return (s+s).contains(goal);
    }
}