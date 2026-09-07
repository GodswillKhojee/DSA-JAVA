// Last updated: 07/09/2026, 19:36:10
class Solution {
    public int countSegments(String s) {
        s = s.trim();

        if(s.isEmpty()) return 0;
        String [] words = s.split("\\s+");
        return words.length;
    }
}