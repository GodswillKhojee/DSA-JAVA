package hash.map;

import java.util.HashMap;

public class MostFreqEle {

    public char getMaxOccuringChar(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        char c = '{'; // character after 'z' in ASCII

        for (char ch : map.keySet()) {
            if (map.get(ch) > max ||
                    (map.get(ch) == max && ch < c)) {
                max = map.get(ch);
                c = ch;
            }
        }

        return c;
    }

    public static void main(String[] args) {
        MostFreqEle obj = new MostFreqEle();

        String s = "aabbccddd";

        char result = obj.getMaxOccuringChar(s);

        System.out.println("Maximum occurring character: " + result);
    }
}