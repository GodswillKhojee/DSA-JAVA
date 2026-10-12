// Last updated: 12/10/2026, 16:56:38
class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events,(a,b) -> a[0] - b[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i = 0;
        int day = 0; 
        int attend = 0;
        while(i < events.length || !pq.isEmpty())
        {
            if(pq.isEmpty()) day = events[i][0];

            while(i < events.length && events[i][0] <= day) 
            {
                pq.add(events[i][1]);
                i++;
            }
            while(!pq.isEmpty() && pq.peek() < day) pq.poll();

            if(!pq.isEmpty())
            {
                attend++;
                pq.poll();
                day++;
            }
        }
        return attend;
    }
}