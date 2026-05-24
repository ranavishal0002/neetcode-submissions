class Solution {
    public int trap(int[] height) {
        
        int n = height.length;

        // left_max array

        int left_max[] = new int[n];

        int right_max[] = new int[n];
        
        left_max[0] = height[0]; // the left most element has no left max

        for(int i =1; i<n; i++){
            left_max[i] = Math.max(left_max[i-1], height[i]);
        }

        right_max[n-1] = height[n-1]; // right most element has no right max

        for(int i = n-2; i>=0; i--){
            right_max[i] = Math.max(right_max[i+1], height[i]);
        }

        int ans = 0;
        int depth =0;

        for(int i =0; i<n; i++){
            depth = Math.min(left_max[i], right_max[i]);
            if(height[i]< depth){
                ans+=depth-height[i];
            }
        }

        return ans;
        
    }
}
