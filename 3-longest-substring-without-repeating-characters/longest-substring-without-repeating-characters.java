class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, maxLen = 0;   // letf as i
        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {  // right as j and do as sliding windows
            char c = s.charAt(right);

            // Remove characters until duplicate is gone
            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(c);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
