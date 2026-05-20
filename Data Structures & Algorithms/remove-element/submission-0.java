class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // points to the next position for a valid element

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // copy valid element to front
                k++;
            }
            // if nums[i] == val, just skip it (i advances, k stays)
        }

        return k; // k = count of elements that are not val
    }
}