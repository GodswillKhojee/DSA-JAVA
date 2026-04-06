package Arrays.longestSubarraySumK;

public class OptimalSol {
    public static int LongestSubarray(int[] nums, int k)
    {
        int left = 0;
        int sum = nums[0];
        int right = 0;
        int maxl = 0;
        int n = nums.length;
        while(right < n)
        {
            while(left <= right && sum > k)
            {
                sum -= nums[left];
                left++;
            }
            if(sum == k)
                maxl = Math.max(maxl, right-left+1);
            right++;
            if(right < n)
             sum += nums[right];

        }
        return maxl;

    }
    public static void main(String[] args) {
//        int [] nums = {-3, 2, 1};
        int [] nums = {1,2,3,1,1,1,1,3,3};
        int k = 6;
        int len = LongestSubarray(nums,k);
        System.out.println(len);
    }
}
