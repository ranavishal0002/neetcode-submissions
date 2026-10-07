class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int n = numbers.length;
        int lt =0;
        int rt = n-1;

        while(lt < rt)
        {
          int sum = numbers[lt] +  numbers[rt];

          if(sum == target)
          {
            return new int[]{lt+1, rt+1};
          } 

          if(sum < target){
            lt++;
          } else 
          {
            rt--;
          }
        }
        return new int[]{};
    }
}
