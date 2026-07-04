class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer> set = new HashSet<>();

       // add all the elements in set witwhout repeating
       for(int num: nums)
       {
        set.add(num);
       }
       int maxLen=0;
       for(int num: set)
       {
        if(!set.contains(num-1))
        {
            int currNum =num;
            int length =1;
            while(set.contains(currNum+1))
            {
                currNum++;
                length++;
            }
            maxLen= Math.max(length, maxLen);
        }
  }
       return maxLen;

    }
}