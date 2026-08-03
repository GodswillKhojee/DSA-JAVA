// Last updated: 04/08/2026, 00:21:06
class Solution {
    public String countAndSay(int n) {
        if(n == 1) return "1";
        String s = countAndSay(n-1);
        String ns = "";
        int i =0, j = 0;
        while(j<s.length())
        {
            if(s.charAt(i) == s.charAt(j)) j++;
            else
            {
                ns += j-i;
                ns += s.charAt(i);
                i=j;
            } 
        }
        ns += j-i;
        ns += s.charAt(i);
        i=j;
        return ns;
    }
    
}