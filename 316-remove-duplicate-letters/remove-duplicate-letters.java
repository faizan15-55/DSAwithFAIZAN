class Solution {
    public String removeDuplicateLetters(String s) {

        int[] freq = new int[26];
        boolean[] visited = new boolean[26];

        // Count frequency of each character
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        StringBuilder stack = new StringBuilder();

        for (char ch : s.toCharArray()) {

            // Current character will be processed
            freq[ch - 'a']--;

            // Already present in stack → skip
            if (visited[ch - 'a']) {
                continue;
            }

            // Remove larger characters if they appear again later
            while (stack.length() > 0 &&
                   stack.charAt(stack.length() - 1) > ch &&
                   freq[stack.charAt(stack.length() - 1) - 'a'] > 0) {

                char removed = stack.charAt(stack.length() - 1);
                stack.deleteCharAt(stack.length() - 1);
                visited[removed - 'a'] = false;
            }

            stack.append(ch);
            visited[ch - 'a'] = true;
        }

        return stack.toString();
    }
}