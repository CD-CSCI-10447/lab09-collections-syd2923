package edu.desu.collections.partC;

import java.util.HashMap;

public class Problem {
    public static Integer characterReplacement(String s, int k){
        if (s == null || s.length() == 0) return 0;

        HashMap<Character, Integer> charCount = new HashMap<>();
        int start = 0, maxCount = 0, maxLength = 0;

        for (int end = 0; end < s.length(); end++) {

            if(charCount.containsKey(s.charAt(end))){
                Integer currentCount = charCount.get(s.charAt(end)) + 1;
                charCount.put(s.charAt(end), currentCount);
            }else {
                charCount.put(s.charAt(end), 1);
            }

            maxCount = Math.max(maxCount, charCount.get(s.charAt(end)));

            while (end - start + 1 - maxCount > k) {
                charCount.put(s.charAt(start), charCount.get(s.charAt(start)) - 1);
                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}
