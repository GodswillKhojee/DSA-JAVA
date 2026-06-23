package hash.map;

import java.util.HashMap;

public class majorityCharGroup {
    static class Solution {
        public String majorityFrequencyGroup(String s) {
            HashMap<Character, Integer> map = new HashMap<>();
            String ss = "";
            for(char ch : s.toCharArray()) map.put(ch, map.getOrDefault(ch,0)+1);
            HashMap<Integer,Integer> freqCount = new HashMap<>();
            for(int freq:map.values())
            {
                freqCount.put(freq,freqCount.getOrDefault(freq,0)+1);
            }
            int majorityFreq = -1;
            int maxCount = 0;
            for(int freq : freqCount.keySet())
            {
                if(freqCount.get(freq) > maxCount ||
                        (freqCount.get(freq) == maxCount && freq > majorityFreq))
                {
                    maxCount = freqCount.get(freq);
                    majorityFreq = freq;
                }
            }
            for(char ch : map.keySet())
            {
                if(map.get(ch) == majorityFreq) ss+= ch;
            }
            return ss;
        }
    }
}
