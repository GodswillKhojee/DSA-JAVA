package Arrays.maxSumOfDistinctSubArraysWithLengthK;

import java.util.HashSet;

public class bruteForce {
    public long maximumSubarraySum(int[] nums, int k) {
        long max = 0;
        int n = nums.length;
        for(int ele:nums)
            for(int i = 0; i < n-k+1;i++)
            {
                int sum = 0;
                HashSet<Integer> set = new HashSet<>();
                for(int j = i; j < i+k;j++)
                {
                    if(set.contains(nums[j]))
                    {
                        sum = 0;
                        break;
                    }
                    set.add(nums[j]);
                    sum += nums[j];
                }
                max = Math.max(max,sum);
            }
        return max;
    }
}
