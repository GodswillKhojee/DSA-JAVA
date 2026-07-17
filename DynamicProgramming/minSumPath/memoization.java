package DynamicProgramming.minSumPath;

import java.util.*;

public class memoization {
    public int path(int [][] grid, int n, int m,int [][]dp)
    {
        if(n==0 && m== 0) return grid[0][0];
        if(n < 0 || m < 0)
            return Integer.MAX_VALUE;
        if(dp[n][m] != -1) return dp[n][m];
        int up = path(grid,n-1,m,dp);
        int left = path(grid,n,m-1,dp);

        return dp[n][m] = grid[n][m] + Math.min(up,left);
    }
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int [][] dp = new int[n][m];
        for(int [] ele:dp)  Arrays.fill(ele,-1);
        return path(grid,n-1,m-1,dp);
    }
}
