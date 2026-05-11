class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int result[]= new int[nums.length];

        int left_product =1;

        // calculate the product of all the element to the left
        for(int i =0; i<nums.length; i++){
            result[i] = left_product;
            left_product *=nums[i];
        }

        // calculate the product to the right element
        int right_product =1;
        for(int i =nums.length-1; i>=0; i--){
            result[i]*= right_product;
            right_product*=nums[i];
        }

        return result;
    }
}  
