class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        char[] ch = s.toCharArray();

        int start = 0;
        int end = n - 1;

        while (start < end) {

            while (start < end && !isVowel(ch[start])) {
                start++;
            }

            while (start < end && !isVowel(ch[end])) {
                end--;
            }

            // Swap vowels
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;

            start++;
            end--;
        }

        return new String(ch);
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' ||
               ch == 'O' || ch == 'U';
    }
}