// Last updated: 13/11/2026, 11:48:09
class Solution {
    int solve(int m, int n, int[][] dp)
    {
        if(m == 0 && n == 0) return 1;
        if(dp[m][n] != 0) return dp[m][n];
        int up = 0,left = 0;
        if(m!=0)
        up = solve(m-1,n,dp);
        if(n!=0)
        left = solve(m,n-1,dp);

        return dp[m][n] = up+left;
    }

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i < m; i++)
            dp[i][0] = 1;
        for (int i = 0; i < n; i++)
            dp[0][i] = 1;
        solve(m, n, dp);
        return dp[m - 1][n - 1];

    }
}