package heaps;
import java.util.*;
class Pair implements Comparable<Pair>
{
    int ele;
    int freq;
    Pair(int ele, int freq)
    {
        this.ele = ele;
        this.freq = freq;
    }

    public int compareTo(Pair p)
    {
        if(this.freq == p.freq) return this.ele - p.ele;
        return this.freq - p.freq;
    }
}
public class kFreqElement {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele:nums) map.put(ele,map.getOrDefault(ele,0)+1);

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int ele: map.keySet())
        {
            int freq = map.get(ele);
            pq.add(new Pair(ele,freq));
            if(pq.size()>k) pq.poll();
        }
        int [] arr = new int[k];
        int idx = 0;
        while(!pq.isEmpty())
            arr[idx++] = pq.poll().ele;
        return arr;
    }
    public static void main(String[] args) {
        int [] arr = {1,1,1,2,2,3};
        int k = 2;
        topKFrequent(arr,k);
    }
}
