package heaps;

import java.util.PriorityQueue;

public class priorityQBasicminheap {
    public static void main(String[] args) {
        // this is a min heap which store the value form small to large
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(-30);
        System.out.println(pq.peek());
        System.out.println(pq.size());
        System.out.println(pq.poll());
        System.out.println(pq.peek());
        System.out.println(pq);
    }
}
