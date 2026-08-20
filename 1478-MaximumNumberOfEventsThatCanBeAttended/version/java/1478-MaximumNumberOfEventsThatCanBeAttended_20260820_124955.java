// Last updated: 20/08/2026, 12:49:55
// This solution first sorts the events by their start day and uses a PriorityQueue to store the end days of events that are currently available. For each day, it adds all events that have started, removes events that have already expired, and attends the event with the earliest ending day because this gives more opportunities to attend other events later. After attending one event, the day is increased by one since only one event can be attended per day. The process continues until all events are processed and the priority queue is empty.
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