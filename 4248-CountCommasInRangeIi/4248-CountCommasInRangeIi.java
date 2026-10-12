// Last updated: 12/10/2026, 16:55:40
class Solution {
    public long countCommas(long n) {
        long ans = 0;
        long commas = 1;
        long start = 1000;
        while( start <= n)
        {
            long end = Math.min(n, start * 1000 - 1);

            ans += (end - start + 1) * commas;
            start *= 1000;
            commas++;
        }
        return ans;
    }
}