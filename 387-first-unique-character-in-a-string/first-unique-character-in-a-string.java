class Solution {
       
   public static int firstUniqChar(String s) {

    HashMap<Character, Integer> map = new HashMap<>();

    // Count frequency of each character
    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);

        if (map.containsKey(ch)) {
            map.put(ch, map.get(ch) + 1);
        } else {
            map.put(ch, 1);
        }
    }

    // Find the first character whose frequency is 1
    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);

        if (map.get(ch) == 1) {
            return i;
        }
    }

    return -1;
}
  
}