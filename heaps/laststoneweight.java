package heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class laststoneweight {
    public static int lastStoneWeight(int[] stones) {
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
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        System.out.println(lastStoneWeight(arr));
    }
}
