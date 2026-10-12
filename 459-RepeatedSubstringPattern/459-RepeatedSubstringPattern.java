// Last updated: 12/10/2026, 16:57:06
class Solution {
    public boolean repeatedSubstringPattern(String s) {

        String doubled = s + s;
        return doubled.substring(1,doubled.length()-1).contains(s);
    }
}