package heaps;

import java.util.PriorityQueue;

public class minCostRope {
    public static int minCost(int[] arr) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int sum = 0;
        for(int ele:arr) pq.add(ele);
        while(pq.size()>1)
        {
            int a = pq.poll();
            int b = pq.poll();
            pq.add(a+b);
            sum += a+b;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 15};
        System.out.println(minCost(arr));
    }
}
