// Last updated: 04/08/2026, 00:21:32
class Solution {
    public int reverse(int x) {
        long revnum = 0;
        boolean isneg = false;
        if(x < 0) {
            x = -x;
            isneg = true;
        } 
        while(x > 0)
        {
            int digit = x % 10;
            revnum = revnum * 10 + digit;
            x /= 10;
        }
        if(isneg) revnum = -revnum;

        if(revnum < Integer.MIN_VALUE || revnum > Integer.MAX_VALUE) return 0;

        return (int)revnum;
    }
}