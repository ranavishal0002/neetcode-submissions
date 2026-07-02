class Solution {


    public static boolean canEatAllBanana(int []piles, int mid, int h){
        int actualHours =0;

        for(int x : piles){
            actualHours+=x/mid;
            if(x%mid !=0){
                actualHours++;
            }
        }
        return actualHours<= h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int left =1; 
        int right =0;
        for(int pile: piles)
        {
        right = Math.max(right, pile);
        }
        while(left< right)
        {
            int mid= left + (right- left)/2;
            if(canEatAllBanana(piles, mid, h)){
                right = mid;
            }else
            {
                left = mid+1;
            }
        }
        return left;
    }
}
