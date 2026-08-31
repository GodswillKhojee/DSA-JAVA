// Last updated: 31/08/2026, 20:52:37
class Solution {
    public boolean repeatedSubstringPattern(String s) {

        String doubled = s + s;
        return doubled.substring(1,doubled.length()-1).contains(s);
    }
}