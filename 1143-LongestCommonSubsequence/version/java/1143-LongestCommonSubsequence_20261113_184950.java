// Last updated: 13/11/2026, 18:49:50
class Solution {
    int solve(int m, int n, String t1, String t2, int [][] dp)
    {
        if(m==0 || n==0) return 0;

        if(dp[m][n] != -1) return dp[m][n];
        if(t1.charAt(m-1) == t2.charAt(n-1)) 
           return dp[m][n] = solve(m-1,n-1,t1,t2,dp)+1;
        else
            return dp[m][n] = Math.max(solve(m-1,n,t1,t2,dp), solve(m,n-1,t1,t2,dp));

    }
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int [][] dp = new int[m+1][n+1];

        for(int [] fill:dp) Arrays.fill(fill,-1);
        return solve(m,n,text1,text2,dp);
    }
}