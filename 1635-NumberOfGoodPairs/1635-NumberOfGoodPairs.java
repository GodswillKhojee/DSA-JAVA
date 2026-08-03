// Last updated: 03/08/2026, 21:14:05
class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele: nums) map.put(ele, map.getOrDefault(ele,0)+1);
        int sum = 0;
        for(int ele: map.keySet())
        {
            int freq = map.get(ele);
            if(freq > 1) 
            {
                while(freq != 0) 
                {
                    freq--;
                    sum+=freq;
                }
            }
        }
        return sum;
    }
}