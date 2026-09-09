// Last updated: 09/09/2026, 15:20:27
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