class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int freq[] = new int[26];

        for(int i =0; i< s1.length(); i++){
            char ch = s1.charAt(i);
            freq[ch-'a']++;
        }

        int winSize = s1.length();

        for(int i =0; i<s2.length(); i++){
            int idx =i; 
            int winIdx =0;
            int[] winFreq = new int[26];

            while(winIdx< winSize && idx < s2.length()){
                winFreq[s2.charAt(idx) - 'a']++;
                winIdx++;
                idx++;
            }
            if(isFreqSame(winFreq, freq)){
                return true;
            }
        }
        return false;
    }

   public static boolean isFreqSame(int[] winFreq, int[] freq) {
    for (int i = 0; i < 26; i++) {
        if (winFreq[i] != freq[i]) return false;
    }
    return true;  // ← inside the method
 }
}
