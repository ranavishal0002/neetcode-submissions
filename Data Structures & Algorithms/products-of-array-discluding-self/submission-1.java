class Solution {
    public int[] productExceptSelf(int[] nums) {

        int result[] = new int[nums.length];
        int total_product = 1;
        int total_product_withoutZero = 1;
        int zeroCount = 0;

        // Product including zero
        for(int i = 0; i < nums.length; i++) {
            total_product *= nums[i];

            if(nums[i] == 0) {
                zeroCount++;
            }
        }

        // Product excluding zero
        for(int i = 0; i < nums.length; i++) {

            int val = nums[i];

            if(val == 0) {
                val = 1;
            }

            total_product_withoutZero *= val;
        }

        for(int i = 0; i < nums.length; i++) {

            // More than one zero
            if(zeroCount > 1) {
                result[i] = 0;
            }

            // Exactly one zero
            else if(zeroCount == 1) {

                if(nums[i] == 0) {
                    result[i] = total_product_withoutZero;
                } else {
                    result[i] = 0;
                }
            }

            // No zero
            else {
                result[i] = total_product / nums[i];
            }
        }

        return result;
    }
}