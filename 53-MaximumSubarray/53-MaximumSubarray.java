// Last updated: 04/08/2026, 00:20:59
class Solution {
    public int maxSubArray(int[] nums) {
        int sum  = 0;
        int max = Integer.MIN_VALUE;
        for(int ele:nums)
        {
            sum += ele;
            if(max < sum ) max = sum;
            if(sum < 0) sum = 0;
        }
        return max;
    }
}