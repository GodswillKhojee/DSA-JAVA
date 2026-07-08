package DynamicProgramming.climbingStairs;

import java.util.*;

public class CBusingMemoization {
    public int oneOrTwo(int n, int[]dp)
    {
        if(n <= 2) return n;
        if(dp[n]!= -1) return dp[n];
        return dp[n] = oneOrTwo(n-1,dp) + oneOrTwo(n-2,dp);
    }

    public int climbStairs(int n) {
        int [] dp = new int [n+1];
        Arrays.fill(dp,-1);
        return oneOrTwo(n,dp);
    }
}
