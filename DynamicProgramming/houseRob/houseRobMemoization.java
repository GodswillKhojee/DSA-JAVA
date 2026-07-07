package DynamicProgramming.houseRob;

import java.util.*;
public class houseRobMemoization {
    public int robi(int [] nums, int i, int [] dp)
    {
        if(i >= nums.length) return 0;
        if(dp[i] != -1) return dp[i];
        int take = nums[i] + robi(nums,i+2, dp);
        int skip = robi(nums,i+1,dp);
        return dp[i] =  Math.max(take,skip);
    }
    public int rob(int[] nums) {
        int [] dp = new int [nums.length];
        Arrays.fill(dp,-1);
        return robi(nums,0,dp);
    }
}
