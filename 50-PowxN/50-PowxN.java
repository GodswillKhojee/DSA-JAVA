// Last updated: 04/08/2026, 00:21:01
class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if(N<0)
        {
            x = 1/x;
            N = -N;
        }
        return Power(x,N);
    }
    public double Power(double x, long n)
    {
        if(n == 0) return 1;
        double call = Power(x,n/2);

        if(n%2==0) return call*call;
        else return x*call*call;
    }
}