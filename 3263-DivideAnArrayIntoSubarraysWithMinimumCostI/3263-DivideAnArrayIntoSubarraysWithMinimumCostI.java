// Last updated: 03/08/2026, 21:13:17
class Solution {
    public int minimumCost(int[] nums) {
        int sum = nums[0];

        int fm = Integer.MAX_VALUE;
        int sm = Integer.MAX_VALUE;

        for(int i = 1; i < nums.length;i++)
        {
            if(nums[i]<fm)
            {
                sm = fm;
                fm = nums[i];
            }
            else if(nums[i] < sm) sm = nums[i];
        } 

        return sum + fm + sm;       
    }
}