package edu.desu.collections.partC;

import java.util.HashMap;
import java.util.Map;

public class Problem {
    public static int characterReplacement(String s, int k) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int maxLength = 0;
        int maxCount = 0;
        int left = 0;

        // Store character frequencies
        Map<Character, Integer> charFrequency = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            charFrequency.put(rightChar, charFrequency.getOrDefault(rightChar, 0) + 1);

            // Update the maximum repeating character count
            maxCount = Math.max(maxCount, charFrequency.get(rightChar));

            // Calculate the window size
            int windowSize = right - left + 1;

            // If the window size - maxCount exceeds k, slide the window
            if (windowSize - maxCount > k) {
                char leftChar = s.charAt(left);
                charFrequency.put(leftChar, charFrequency.get(leftChar) - 1);
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
