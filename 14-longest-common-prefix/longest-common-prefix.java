class Solution {
        public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        Arrays.sort(strs);
        
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();
        
        int length = Math.min(first.length, last.length);

        for (int i = 0; i < length; i++){
            if(first[i] != last[i])
               
                break;
            result.append(first[i]);
        }
        return result.toString();

    }
}