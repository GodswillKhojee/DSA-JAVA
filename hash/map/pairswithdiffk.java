package hash.map;

import java.util.HashMap;

public class pairswithdiffk {
    class Solution {
        int countPairs(int[] nums, int k) {
            // code here
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int ele: nums) map.put(ele,map.getOrDefault(ele,0)+1);
            int pairs = 0;
            for(int ele: map.keySet())
            {
                int rem1 = ele-k;
                int rem2 = ele+k;
                if(map.containsKey(rem1)) pairs += (map.get(ele))*(map.get(rem1));
                if(map.containsKey(rem2)) pairs += (map.get(ele))*(map.get(rem2));
            }
            return pairs/2;
        }

    }
}
