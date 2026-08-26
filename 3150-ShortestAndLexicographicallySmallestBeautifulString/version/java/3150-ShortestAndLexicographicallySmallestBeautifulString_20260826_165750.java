// Last updated: 26/08/2026, 16:57:50
// used sliding window for solving this
class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String ans = "";
        int l = 0;
        int cnt  = 0;

        for(int r = 0; r < s.length();r++)
        {
            if(s.charAt(r) == '1') cnt++;
            while(cnt > k)
            {
                if(s.charAt(l) == '1') cnt--;
                l++;
            }
            if(cnt == k)
            {
                while(l<r && s.charAt(l) == '0') l++;
                String c = s.substring(l,r+1);
                if(ans.isEmpty() || c.length()<ans.length() || (c.length() == ans.length() && c.compareTo(ans) < 0)) ans = c;
            }
        }
        return ans;
    }
}