package heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class findMedianFromDataStream {

    static class MedianFinder {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        public MedianFinder() {}

        public void addNum(int num) {

            if (maxHeap.isEmpty()) {
                maxHeap.add(num);
            } else {
                if (num < maxHeap.peek()) {
                    maxHeap.add(num);
                } else {
                    minHeap.add(num);
                }
            }

            if (maxHeap.size() == minHeap.size() + 2) {
                minHeap.add(maxHeap.poll());
            }

            if (minHeap.size() == maxHeap.size() + 2) {
                maxHeap.add(minHeap.poll());
            }
        }

        public double findMedian() {

            if (maxHeap.size() == minHeap.size() + 1) {
                return maxHeap.peek();
            }

            if (minHeap.size() == maxHeap.size() + 1) {
                return minHeap.peek();
            }

            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        }
    }

    public static void main(String[] args) {

        MedianFinder mf = new MedianFinder();

        mf.addNum(1);
        System.out.println("Median = " + mf.findMedian()); // 1.0

        mf.addNum(2);
        System.out.println("Median = " + mf.findMedian()); // 1.5

        mf.addNum(3);
        System.out.println("Median = " + mf.findMedian()); // 2.0

        mf.addNum(4);
        System.out.println("Median = " + mf.findMedian()); // 2.5

        mf.addNum(5);
        System.out.println("Median = " + mf.findMedian()); // 3.0
    }
}