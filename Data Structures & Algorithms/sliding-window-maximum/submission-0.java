class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int n = nums.length;

        List<Integer> list = new ArrayList<>();
        for(int i =0; i<=n-k; i++){
            int max = nums[i];
            
            for(int j= i; j<i+k; j++){
               max = Math.max(max, nums[j]);
            }
            list.add(max);
        }

        int size = list.size();
        int result[] = new int[size];

        for(int i=0; i< size; i++){
            result[i] = list.get(i);
        }
        return result;
    }
}
