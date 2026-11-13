// Last updated: 13/11/2026, 12:45:29

class Solution {

    int solve(int m, int n, int[][] obs, int[][] dp) {

        if (m < 0 || n < 0)
            return 0;

        if (obs[m][n] == 1)
            return 0;

        if (m == 0 && n == 0)
            return 1;

        if (dp[m][n] != -1)
            return dp[m][n];

        int up = solve(m - 1, n, obs, dp);
        int left = solve(m, n - 1, obs, dp);

        return dp[m][n] = up + left;
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] dp = new int[m][n];

        for (int[] fill : dp) {
            Arrays.fill(fill, -1);
        }

        return solve(m - 1, n - 1, obstacleGrid, dp);
    }
}
