class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;   // match found, advance s pointer
            }
            j++;       // always advance t pointer
        }

        return i == s.length();  // did we match all of s?
    }
}