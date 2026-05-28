package heaps;

import java.util.PriorityQueue;

public class nearlySorted {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        int idx = 0;
        // using min heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele:arr)
        {
            pq.add(ele);
            if(pq.size()>k) arr[idx++] = pq.remove();
        }
        while(pq.size()>0) arr[idx++]  = pq.remove();
        for(int ele:arr) System.out.print(ele+" ");
    }
}
