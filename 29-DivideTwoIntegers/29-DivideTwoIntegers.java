// Last updated: 04/08/2026, 00:21:14
class Solution {
    public int divide(long dividend, long divisor) {
       if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        boolean sign = (dividend >= 0) == (divisor >= 0);

        long n = Math.abs(dividend);
        long d = Math.abs(divisor);

        long ans = 0;

        while (n >= d) {
            int cnt = 0;

            while (n >= (d << (cnt + 1))) cnt++;

            ans += (1L << cnt);
            n -= (d << cnt);
        }

        return sign ? (int) ans : (int) -ans;
    
    }
}