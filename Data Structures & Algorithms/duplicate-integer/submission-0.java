class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        boolean ans = false;
        for (int dig: nums){
            map.put(dig, map.getOrDefault(dig, 0)+1);
        }

        for(Map.Entry<Integer, Integer>entry :map.entrySet()){
            if(entry.getValue()>1){
                ans = true;
            }
        }
        return ans;
    }
}