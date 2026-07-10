package DynamicProgramming.uniquePaths;

import java.util.*;

public class uniquePathMemoization {
    public int path(int m , int n, int [][] dp)
    {
        if(m == 1 || n == 1) return 1;
        if(dp[m-1][n-1] != -1) return dp[m-1][n-1];
        return dp[m-1][n-1] = path(m,n-1,dp) + path(m-1,n,dp);
    }
    public int uniquePaths(int m, int n) {
        int [][] dp = new int[m][n];
        for(int [] ele:dp)  Arrays.fill(ele,-1);
        return path(m,n,dp);
    }
}
