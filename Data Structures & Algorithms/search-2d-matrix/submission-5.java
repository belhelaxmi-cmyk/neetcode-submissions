class Solution {
    boolean searchMatrix(int[][] mat, int target) {

        int m = mat.length;
        int n = mat[0].length;
        int low =0; 
        int high = m*n-1;

        while(low<=high){
            int mid = low + (high - low)/2;
            int num = mat[mid/n][mid%n];
            if( num == target){
                return true;
            } else if(num < target){
                low = mid +1;
            } else {
                high = mid -1;
            }

        }
       return false;
    }
}
