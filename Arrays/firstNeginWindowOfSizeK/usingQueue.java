package Arrays.firstNeginWindowOfSizeK;

import java.util.*;

public class usingQueue {
    static List<Integer> firstNegInt(int arr[], int k) {
        // code here
        int n = arr.length;
        Queue<Integer> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++)
        {
            while(!q.isEmpty() && q.peek() <= i-k) q.poll();


            if(arr[i] < 0) q.offer(i);

            if(i >= k-1)
            {
                if(q.isEmpty()) list.add(0);
                else list.add(arr[q.peek()]);
            }
        }
        return list;
    }
}
