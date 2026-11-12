// Last updated: 13/11/2026, 00:45:16
class Solution {
    int solve(int[]nums,int[] dp, int idx,int start)
    {
        if(idx<start) return 0;
        if(idx==0) return nums[0];
        if(dp[idx] != -1) return dp[idx];
        int skip = solve(nums,dp,idx-1,start);
        int take = nums[idx]+solve(nums,dp,idx-2,start);
        return dp[idx] =  Math.max(skip,take);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        int [] dp = new int[n+1];
        Arrays.fill(dp,-1);
        int first = solve(nums,dp,n-2,0);
        Arrays.fill(dp,-1);
        int second = solve(nums,dp,n-1,1);
        return Math.max(first,second);
    }
}