class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] result = new int[nums.length];

        result[0] = 1; // remember 
        for(int i=1; i<nums.length; i++){ 
            result[i] = result[i-1] * nums[i-1];  //result[1] = 1*1 = 1 , res[2] = 1*2 =2, res[3] = 2*2=4 , res[4]=6*4 24 
            // [1, 2, 4, 24]
        }

        int right = 1;
        for(int i=nums.length-1; i>=0; i--){
            result[i] *= right; // result[4] = 24*1 =24, 4*6 24 
            right *= nums[i]; // 6*1= 6
        }

        return result;
    }
}  
