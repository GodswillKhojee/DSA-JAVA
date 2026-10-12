// Last updated: 12/10/2026, 16:57:11
class Solution {
    public int countSegments(String s) {
        s = s.trim();

        if(s.isEmpty()) return 0;
        String [] words = s.split("\\s+");
        return words.length;
    }
}