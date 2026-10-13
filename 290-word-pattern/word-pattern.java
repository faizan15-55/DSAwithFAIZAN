import java.util.*;

class Solution {
public boolean wordPattern(String pattern, String s) {
String[] words = s.split(" ");


    if (pattern.length() != words.length) {
        return false;
    }

    Map<Character, String> map = new HashMap<>();
    Map<String, Character> reverseMap = new HashMap<>();

    for (int i = 0; i < pattern.length(); i++) {
        char ch = pattern.charAt(i);
        String word = words[i];

        if (map.containsKey(ch)) {
            if (!map.get(ch).equals(word)) {
                return false;
            }
        } else {
            map.put(ch, word);
        }

        if (reverseMap.containsKey(word)) {
            if (reverseMap.get(word) != ch) {
                return false;
            }
        } else {
            reverseMap.put(word, ch);
        }
    }

    return true;
}

}
