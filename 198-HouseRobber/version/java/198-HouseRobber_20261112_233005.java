// Last updated: 12/11/2026, 23:30:05
class Solution {
    int solve(int[] nums,int [] dp, int i)
    {
        if(i<0) return 0;
        if(i==0) return nums[0];
        if(dp[i]!= -1) return dp[i];
        int skip = solve(nums, dp, i - 1);
        int take = nums[i] + solve(nums, dp, i - 2);
        return dp[i] = Math.max(skip,take);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int [] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(nums,dp,n-1);
    }
}