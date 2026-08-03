// Last updated: 03/08/2026, 21:14:17
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:stones) pq.add(ele);
        while(pq.size() > 1)
        {
            int x = pq.poll();
            int y = pq.poll();
            if(x!=y) pq.add(x-y);
        }
        return Math.abs(pq.isEmpty()? 0 : pq.poll());
    }
}