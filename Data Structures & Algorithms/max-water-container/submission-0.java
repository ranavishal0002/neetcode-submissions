class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;

        while (left < right) {
            // Width = distance between lines, Height = shorter of the two lines
            int width = right - left;
            int h = Math.min(height[left], height[right]);
            int water = width * h;

            maxWater = Math.max(maxWater, water);

            // Move the shorter line inward — only way to potentially find more water
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }
}