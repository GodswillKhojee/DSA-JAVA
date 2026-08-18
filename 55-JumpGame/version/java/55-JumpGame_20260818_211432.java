// Last updated: 18/08/2026, 21:14:32
/*
 * this is the greedy solution
 * getting the best outcome of the nums ele
*/

class Solution {
    public boolean canJump(int[] nums) {
        int maxr = 0;
        for(int i = 0; i < nums.length;i++)
        {
            if(i>maxr) return false;
            maxr = Math.max(maxr, i+ nums[i]);
            if(maxr > nums.length -1) return true;
        }
        return true;
    }
}