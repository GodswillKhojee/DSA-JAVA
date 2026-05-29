package heaps;

import java.util.PriorityQueue;
import java.util.Arrays;

public class kthclosestpoint {
    public static void main(String[] args) {

        int[][] points = {
                {1, 3},
                {-2, 2},
                {5, 8},
                {0, 1}
        };

        int k = 2;

        Solution sol = new Solution();
        int[][] ans = sol.kClosest(points, k);

        System.out.println("K Closest Points:");
        for (int[] point : ans) {
            System.out.println(Arrays.toString(point));
        }
    }
}

class Triplet implements Comparable<Triplet> {
    int dist;
    int x;
    int y;

    Triplet(int dist, int x, int y) {
        this.dist = dist;
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Triplet t) {
        return t.dist - this.dist; // Max Heap
    }
}

class Solution {
    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<Triplet> pq = new PriorityQueue<>();

        for (int[] ele : points) {
            int x = ele[0];
            int y = ele[1];
            int dist = x * x + y * y;

            pq.add(new Triplet(dist, x, y));

            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[][] ans = new int[k][2];

        int i = 0;
        while (!pq.isEmpty()) {
            Triplet top = pq.poll();
            ans[i][0] = top.x;
            ans[i][1] = top.y;
            i++;
        }

        return ans;
    }
}