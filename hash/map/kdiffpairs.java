package hash.map;

import java.util.HashMap;

public class kdiffpairs {
    class Solution {
        public int findPairs(int[] nums, int k) {
            if(k < 0) return 0;
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int ele: nums) map.put(ele,map.getOrDefault(ele,0)+1);

            int pairs = 0;
            if(k==0)
            {
                for(int ele: map.values())
                {
                    if(ele>1)pairs++;
                }
            }
            else
            {
                for(int ele:map.keySet())
                {
                    if(map.containsKey(ele+k)) pairs++;
                }
            }
            return pairs;
        }
    }
}
