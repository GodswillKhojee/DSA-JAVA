package hash.map;

import java.util.*;

public class countNumberOfPairsInAStrign {
    long equalPairs(String s) {
        // your code here
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()) map.put(ch,map.getOrDefault(ch, 0)+1);

        long ans = 0;
        for(char ch : map.keySet())
        {
            ans += Math.pow(map.get(ch),2);
        }
        return ans;
    }
}
