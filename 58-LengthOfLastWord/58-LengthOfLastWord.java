// Last updated: 11/08/2026, 20:21:45
class Solution {
    public int lengthOfLastWord(String s) {
        String [] words = s.trim().split("\\s+");
        String ss = words[words.length-1];
        return ss.length();
    }
}