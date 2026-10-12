// Last updated: 12/10/2026, 16:56:35
class Solution {
    public String longestPrefix(String s) {
         int[] lps = new int[s.length()];
        int i = 0;
        int j = 1;
        while(j < s.length())
        {
            if(s.charAt(i) == s.charAt(j)) lps[j++] = ++i;
            else if(i>0) i = lps[i-1];
            else if(i==0) j++;
        }
        return s.substring(0,lps[s.length() - 1]);
    }
}