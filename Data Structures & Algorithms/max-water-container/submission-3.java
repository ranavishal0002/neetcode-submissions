class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;

        int maxWater =0;

        int left =0;
        int right = n-1;

        while(left < right){

            int width = right - left;

            int height = Math.min(heights[left], heights[right]);

            int water = width*height;

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
