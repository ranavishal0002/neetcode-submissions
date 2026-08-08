class Solution {
    public int maxArea(int[] heights) {

        int maxWater = 0;

        int n = heights.length;

        int left=0;
        int right = n-1;

        while(left < right){
            int depth = Math.min(heights[left], heights[right]);
            int  width = right-left;
            int water = depth*width;

            maxWater = Math.max(water, maxWater);

            if(heights[left]< heights[right]){
                left++;
            } else {
                right--;
            }
        }   
        return maxWater;
    }
}
