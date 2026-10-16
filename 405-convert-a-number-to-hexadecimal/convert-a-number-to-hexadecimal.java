
 class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";

        StringBuilder result = new StringBuilder();
        char[] hex = "0123456789abcdef".toCharArray();

        while (num != 0) {
            int rem = num & 15;  // Get the last 4 bits
            result.append(hex[rem]);
            num >>>= 4;           // Unsigned right shift by 4 bits
        }

        return result.reverse().toString();
    
    }
 }