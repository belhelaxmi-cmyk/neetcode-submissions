class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap();
        for(int n: nums) {
            map.put(n, map.getOrDefault(n,0)+1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
           (a,b) -> a.getValue() - b.getValue());
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            minHeap.add(entry);
            if(minHeap.size() > k){
                minHeap.poll();
            }
            
        }

        int[] result = new int[k];
        int i=0;
        while(!minHeap.isEmpty()){
            result[i++] = minHeap.poll().getKey();
        }

        return result;

    }
}
