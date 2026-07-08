package DynamicProgramming.countDerange;

import java.util.*;

public class countDerangeMemoization {
    public int derange(int n, int [] dp)
    {
        if(n<=3) return n-1;
        if(dp[n] != -1) return dp[n];
        return dp[n] = (n-1) * (derange(n-1,dp)+derange(n-2,dp));
    }
    public int derangeCount(int n) {
        int [] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return derange(n,dp);
    }
}
