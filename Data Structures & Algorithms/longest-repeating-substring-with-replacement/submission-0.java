class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];   // frequency of each char in window
        int left = 0;
        int maxFreq = 0;            // highest freq of any single char in window
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            freq[c - 'A']++;

            // track the most dominant character in window
            maxFreq = Math.max(maxFreq, freq[c - 'A']);

            // replacements needed = windowSize - maxFreq
            int windowSize = right - left + 1;
            if (windowSize - maxFreq > k) {
                // window invalid — shrink from left
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}