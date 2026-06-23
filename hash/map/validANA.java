package hash.map;

import java.util.HashMap;

public class validANA {
    class Solution {
        public boolean isAnagram(String s, String t) {
            if(s.length() != t.length()) return false;
            HashMap<Character,Integer> ss = new HashMap<>();
            for(char ch :s.toCharArray()) ss.put(ch,ss.getOrDefault(ch,0)+1);

            for(char ch : t.toCharArray())
            {
                if(!ss.containsKey(ch)) return false;
                int freq = ss.get(ch);
                if(freq == 0) return false;
                ss.put(ch,freq-1);
            }
            return true;

        }
    }
}
