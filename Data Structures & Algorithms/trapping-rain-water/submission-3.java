class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];

        leftMax[0] = height[0];

        for(int i =1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        rightMax[n-1] = height[n-1];
        for(int i =n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int totalWater =0;
        int ans =0;
        int depth =0;

        for(int i =0; i<n; i++){
            depth = Math.min(rightMax[i], leftMax[i]);
            if(height[i] < depth){
                ans+=depth-height[i];
            }
        }
        return ans;
    }
}
