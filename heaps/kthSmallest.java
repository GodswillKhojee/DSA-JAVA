package heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class kthSmallest {

    // Using Max Heap to find kth smallest element
    public static void main(String[] args) {

        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        // Max Heap
        PriorityQueue<Integer> pq =
                new PriorityQueue<>(Collections.reverseOrder());

        for (int ele : arr) {
            pq.add(ele);

            // Keep only k elements in heap
            if (pq.size() > k) {
                pq.remove();
            }
        }

        // Top element is kth smallest
        System.out.println("Kth Smallest Element: " + pq.peek());
    }
}