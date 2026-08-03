// Last updated: 04/08/2026, 00:20:54
class Solution {
    public int mySqrt(int n) {
        if(n == 0) return 0;
        int l = 1;
        int h = n;
        while(l <= h)
        {
            int m = l + (h-l)/2;
            if(m ==n/m) return m;
            else if(m>n/m) h = m -1;
            else l = m +1;
        }
        return h;
    }
}