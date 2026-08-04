// Last updated: 04/08/2026, 21:01:49
1class Solution {
2    public int lengthOfLastWord(String s) {
3        String [] words = s.trim().split("\\s+");
4        String ss = words[words.length-1];
5        return ss.length();
6    }
7}