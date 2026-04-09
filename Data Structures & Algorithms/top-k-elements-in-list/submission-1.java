class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i: nums){
            map.merge(i, 1, Integer::sum);
        }
        int[] arr = new int[k];

        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b) ->b.getValue() - a.getValue());
        pq.addAll(map.entrySet());
        for (int i = 0; i < k; i++ ){
            arr[i] = pq.poll().getKey();
        }

        return  arr;


        
    }
}
