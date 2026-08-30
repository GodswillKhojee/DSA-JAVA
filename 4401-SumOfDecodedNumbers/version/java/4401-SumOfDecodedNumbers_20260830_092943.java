// Last updated: 30/08/2026, 09:29:43
class Solution {
    long mod = 1000000007;
    public long power(long x, long y)
    {
        long result = 1;
        x =x %mod;
        while(y>0)
            {
                if(y%2 == 1)
                {
                    result = (result*x)%mod;
                }
                x=(x*x)%mod;
                y=y/2;
            }
        return result;
    }
    public int sumDecoded(long[] nums) {
        long sum = 0;
        for(long ele:nums)
            {
                int width = (int)(ele % 10);
                long d = ele/10;
                String s = String.valueOf(d);
                long x = Long.parseLong(s.substring(0,width));
                long y = Long.parseLong(s.substring(width));
                
                sum =(sum+power(x,y))%mod;
            }
        // System.out.print(sum%mod);
        return (int)sum;
    }
}