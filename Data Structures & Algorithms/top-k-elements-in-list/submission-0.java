class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int x:nums) 
            m.put(x,m.getOrDefault(x,0)+1);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->b[1]-a[1]);
        
        for(Map.Entry<Integer,Integer> e:m.entrySet())
            pq.add(new int[]{e.getKey(),e.getValue()});
        
        int[] ans = new int[k];
        for(int i = 0; i < k; i++) 
            ans[i] = pq.poll()[0];
        return ans;
    }
}
