class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int n = nums.length;

        int result[] = new int[n-k+1];

        Deque<Integer> dq = new ArrayDeque<>();
        for(int right =0; right <n; right++){
            
            // removing from the back Smaller element
            while(!dq.isEmpty() && nums[right]> nums[dq.peekLast()]){
                dq.pollLast();
            }

            dq.addLast(right);

            // remove from front if outside the window size
            if(dq.peekFirst() < right -k+1){
                dq.pollFirst();
            }

            if(right>= k-1){
                result[right-k+1] = nums[dq.peekFirst()];
            }
        }

        return result;
    }
}
