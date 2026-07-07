package DynamicProgramming.houseRob2;

import java.util.*;
public class houseRob2Memoization {
    public int robi(int [] nums, int i,int n,int [] dp)
    {
        if(i>= n-1) return 0;
        if(dp[i] != -1) return dp[i];
        int take = nums[i] + robi(nums,i+2,n,dp);
        int skip = robi(nums,i+1,n,dp);
        return dp[i] =  Math.max(take,skip);
    }
    public int robj(int [] nums, int i,int  n, int [] dp)
    {
        if(i>= n) return 0;
        if(dp[i] != -1) return dp[i];
        int take = nums[i] + robj(nums,i+2,n,dp);
        int skip = robj(nums,i+1,n,dp);
        return dp[i] = Math.max(take,skip);
    }
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        int [] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        int f = robi(nums,0,nums.length,dp);
        Arrays.fill(dp,-1);
        int s = robj(nums,1,nums.length,dp);
        System.out.print(f+" "+s);
        return Math.max(f,s);
    }
}
