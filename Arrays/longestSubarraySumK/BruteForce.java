package Arrays.longestSubarraySumK;

public class BruteForce {
    public static int LongestSubarray(int [] nums, int k)
    {
        int n = nums.length;
        int maxl = 0;
        for(int s = 0; s<n;s++)
        {
            int curSum = 0;
            for(int e = s; e < n; e++)
            {
                curSum += nums[e];
                if (curSum == k) maxl = Math.max(maxl, e-s+1);
            }
        }
        return maxl;
    }
    public static void main(String[] args) {
        int [] nums = {-3, 2, 1};
        int k = 6;
        int len = LongestSubarray(nums,k);
        System.out.println(len);
    }
}
