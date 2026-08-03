// Last updated: 03/08/2026, 21:14:43
class Range implements Comparable<Range>
{
    int element;
    int listIdx;
    int elementIdx;

    Range(int ele, int listIdx, int elementIdx)
    {
        this.element = ele;
        this.listIdx = listIdx;
        this.elementIdx = elementIdx;
    }

    @Override
    public int compareTo(Range r)
    {
        return this.element - r.element; // Min Heap
    }
}

class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {

        int max = Integer.MIN_VALUE;
        int k = nums.size();

        PriorityQueue<Range> pq = new PriorityQueue<>();

        for(int i = 0; i < k; i++)
        {
            int val = nums.get(i).get(0);
            pq.offer(new Range(val, i, 0));
            max = Math.max(max, val);
        }

        int[] minRange = {0, Integer.MAX_VALUE};

        while(true)
        {
            Range top = pq.poll();

            int minElement = top.element;
            int listIndex = top.listIdx;
            int elementIndex = top.elementIdx;

            if(max - minElement < minRange[1] - minRange[0])
            {
                minRange[0] = minElement;
                minRange[1] = max;
            }

            if(elementIndex == nums.get(listIndex).size() - 1)
                break;

            int next = nums.get(listIndex).get(elementIndex + 1);

            max = Math.max(max, next);

            pq.offer(new Range(next, listIndex, elementIndex + 1));
        }

        return minRange;
    }
}