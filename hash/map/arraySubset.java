package hash.map;

import java.util.HashMap;

public class arraySubset {

    class Solution {
        public boolean isSubset(int a[], int b[]) {
            // Your code here
            HashMap<Integer, Integer> aMap = new HashMap<>();
            for(int ele: a) aMap.put(ele, aMap.getOrDefault(ele,0)+1);
            HashMap<Integer, Integer> bMap = new HashMap<>();
            for(int ele: b)
            {
                if(!aMap.containsKey(ele)) return false;
                bMap.put(ele, bMap.getOrDefault(ele,0)+1);
            }

            for(int ele:bMap.keySet())
            {
                int freq = bMap.get(ele);
                int afreq = aMap.get(ele);
                if(freq>afreq) return false;
            }
            return true;
        }
    }

}
