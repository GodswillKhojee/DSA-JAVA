// Last updated: 03/08/2026, 21:15:07
class Solution {
    public int sqrt(long n)
    {
        if(n == 0) return 0;
        long l = 1, h = n;
        while(l<=h)
        {
            long m = l + (h-l)/2;
            if(m == n/m) return (int)m;
            else if(m>n/m) h = m-1;
            else l = m+1;
        }
        return (int)h;
    }
    public int arrangeCoins(int n) {
        // not good solution by used math
        long m = (long)n;
        return (sqrt(8*m+1)-1)/2;
    }
}