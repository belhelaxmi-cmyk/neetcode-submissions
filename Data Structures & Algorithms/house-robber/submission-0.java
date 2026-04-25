class Solution {
    public int rob(int[] nums) {
        int prev1=0;
        int prev2=0;
        int maxSum = 0; 
        for(int current: nums){
            maxSum = Math.max(current+prev2,prev1); 
            prev2 = prev1;
            prev1 = maxSum; 
        }
        return maxSum;
    }
}
