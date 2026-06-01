class Solution {
    public String minWindow(String s, String t) {
if (s.length() < t.length()) return "";

        Map<Character, Integer> map = new HashMap<>();
        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int count = t.length();  // total characters to match (with duplicates)
        int i = 0, j = 0, minLen = Integer.MAX_VALUE, start = 0;

        while (j < s.length()) {
            char endChar = s.charAt(j);
            if (map.containsKey(endChar)) {
                if (map.get(endChar) > 0) {
                    count--;  // only decrease count if this char was needed
                }
                map.put(endChar, map.get(endChar) - 1);
            }

            while (count == 0) {
                if (j - i + 1 < minLen) {
                    minLen = j - i + 1;
                    start = i;
                }

                char startChar = s.charAt(i);
                if (map.containsKey(startChar)) {
                    map.put(startChar, map.get(startChar) + 1);
                    if (map.get(startChar) > 0) {
                        count++;  // we now need this char again
                    }
                }
                i++;  // shrink from left
            }

            j++;  // expand to right
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
