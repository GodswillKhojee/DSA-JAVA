// Last updated: 03/08/2026, 21:12:56
class Solution {
    public boolean checkBalance(int [] f)
    {
        int count = 0;
        for(int i = 0;i< 26; i++)
        {
            if(f[i] == 0) continue;
            if(count == 0)
            {
                count = f[i];
            }
            else if(f[i] != count) return false;

        }
        return true;
    }
    public int longestBalanced(String s) {
        int n = s.length();
        int max = 0;
        for(int i = 0; i < n; i++)
        {
            int [] f = new int[26];
            for(int j = i; j < n;j++)
            {
                f[s.charAt(j) - 'a']++;
                if(checkBalance(f)) max = Math.max(max, j-i+1);
            }
        }
        return max;
    }
}