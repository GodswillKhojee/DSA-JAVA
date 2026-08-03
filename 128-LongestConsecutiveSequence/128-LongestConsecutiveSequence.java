// Last updated: 03/08/2026, 21:16:43
class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int count = 1;
        int max = 1;
        if(n==0) return 0;
        for(int i = 0; i < n-1;i++)
        {
            if(nums[i] == nums[i+1])continue;
            if(nums[i]+1 == nums[i+1]) count++;
            else {
                count = 1;
            }
            max = Math.max(max,count);
        }
        return max;
    }
}