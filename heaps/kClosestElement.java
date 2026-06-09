package heaps;

import java.util.*;

class Duo implements Comparable<Duo> {
    int ele;
    int dist;

    Duo(int ele, int dist) {
        this.ele = ele;
        this.dist = dist;
    }
    public int compareTo(Duo d) {
        if (this.dist == d.dist)
            return this.ele - d.ele;
        return this.dist - d.dist;
    }
}

public class kClosestElement {

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Duo> pq = new PriorityQueue<>();

        for (int ele : arr) {
            pq.add(new Duo(ele, Math.abs(ele - x)));
        }

        List<Integer> ls = new ArrayList<>();

        while (k > 0 && !pq.isEmpty()) {
            ls.add(pq.poll().ele);
            k--;
        }

        Collections.sort(ls);
        return ls;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 4;
        int x = 3;

        List<Integer> result = findClosestElements(arr, k, x);

        System.out.println(result);
    }
}