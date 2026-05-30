class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(nums);

        for(int i =0; i<nums.length-2; i++){
            if(i>0 && nums[i]== nums[i-1])
            continue;

            if(nums[i]>0)
                break;

            int left = i+1; 
            int right = nums.length -1;
            int target = -nums[i];
            while(left < right){
                int sum = nums[left]+ nums[right];
                if(sum == target){
                    list.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while(left< right && nums[left]== nums[left+1]) left++;
                    while(left< right && nums[right] == nums[right-1]) right--;

                    left++;
                    right--;
                } else if(sum< target){
                    left++;
                } else {
                    right--;
                }
            }
        }
        return list;
    }
}
/***
List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // sort to enable two-pointer + easy duplicate skipping

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate values for the first element
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            // Early exit: smallest possible sum is already > 0
            if (nums[i] > 0) break;

            int left = i + 1;
            int right = nums.length - 1;
            int target = -nums[i]; // we need left + right to equal this

            while (left < right) {
                int sum = nums[left] + nums[right];

                if (sum == target) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates for second and third elements
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;

                } else if (sum < target) {
                    left++;  // need a bigger sum
                } else {
                    right--; // need a smaller sum
                }
            }
        }

        return result;

*/