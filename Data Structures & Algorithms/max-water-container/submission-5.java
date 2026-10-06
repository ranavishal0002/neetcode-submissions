class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;

        int lt =0;
        int rt = n-1;
        int totalWater =0;
        while(lt< rt){
            int depth = Math.min(heights[lt], heights[rt]);
            int length = rt-lt;
             int water = depth*length;
             totalWater = Math.max(totalWater, water);

             if(heights[lt] < heights[rt]){
                lt++;
             }else {
                rt--;
             }
        }
        return totalWater;
    }
}
