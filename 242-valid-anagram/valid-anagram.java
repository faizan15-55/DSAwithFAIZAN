class Solution {
    public boolean isAnagram(String s, String t) {

        // Step 1: Different lengths cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Create HashMap
        HashMap<Character, Integer> map = new HashMap<>();

        // Step 3: Count characters of s
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 4: Remove/decrease characters using t
        for (char ch : t.toCharArray()) {

            // Character doesn't exist in s
            if (!map.containsKey(ch)) {
                return false;
            }

            map.put(ch, map.get(ch) - 1);

            // Frequency became negative
            if (map.get(ch) < 0) {
                return false;
            }
        }

        // Step 5: Everything matched
        return true;
    }
}