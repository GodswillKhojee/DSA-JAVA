// Last updated: 03/08/2026, 21:14:41
class Duo implements Comparable<Duo>
{
    int ele;
    int dist;
    Duo(int ele, int dist)
    {
        this.ele = ele;
        this.dist = dist;
    }
    public int  compareTo(Duo d)
    {
        if(this.dist == d.dist) return this.ele - d.ele;
        return this.dist - d.dist;
    }
}
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Duo> pq = new PriorityQueue<>();
        List<Integer> ls = new ArrayList<>();
        for(int ele:arr)pq.add(new Duo(ele,Math.abs(ele - x)));

        while(k > 0) 
        {
            ls.add(pq.poll().ele);
            k--;
        }
        Collections.sort(ls);
        return ls;
        
    }
}