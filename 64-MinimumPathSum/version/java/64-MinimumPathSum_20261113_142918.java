// Last updated: 13/11/2026, 14:29:18
class Solution {
    int solve(int m, int n, int [][] grid, int [][] dp)
    {
        if(m<0 || n<0) return Integer.MAX_VALUE;
        if(m==0&& n==0) return grid[m][n];
        if(dp[m][n] != -1) return dp[m][n];

        int up = solve(m-1,n,grid,dp);
        int left = solve(m,n-1,grid,dp);
        return dp[m][n] = grid[m][n] + Math.min(up,left);
    }
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int [][] dp = new int[m][n];
        for(int [] fill:dp) Arrays.fill(fill,-1);
        return solve(m-1,n-1,grid,dp);
    }
}