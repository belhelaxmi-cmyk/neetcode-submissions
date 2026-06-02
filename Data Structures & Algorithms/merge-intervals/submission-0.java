class Solution {
    public int[][] merge(int[][] intervals) {

       Arrays.sort(intervals, (a,b) -> Integer.compare(a[0] , b[0])); 
       List<int[]> result = new ArrayList<>();
       result.add(intervals[0]);

       for(int i=1; i<intervals.length;i++){
        int[] lastIntervalEnd = result.get(result.size() -1); 
        if(intervals[i][0] <= lastIntervalEnd[1]){
            // overlap
            lastIntervalEnd[1] = Math.max(lastIntervalEnd[1],intervals[i][1] );
        } else {
            // non overlap
            result.add(intervals[i]);
        }
        
       }
        return result.toArray(new int[result.size()][]);
    }
}
