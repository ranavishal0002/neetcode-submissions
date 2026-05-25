class Solution {
    public boolean isPalindrome(String s) {

        // reverse the original string

        String str = s.replaceAll("[^a-zA-Z]", "").toLowerCase();

        int start = 0;
        int end = str.length()-1;

        while(start<=end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }
} 