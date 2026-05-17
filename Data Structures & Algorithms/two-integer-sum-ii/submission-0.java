class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1}; // 1-indexed answer

            } else if (sum < target) {
                left++;  // need a bigger sum → move left pointer right

            } else {
                right--; // need a smaller sum → move right pointer left
            }
        }

        return new int[]{}; // guaranteed a solution exists, never reached
    }
}