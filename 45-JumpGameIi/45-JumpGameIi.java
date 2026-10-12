// Last updated: 12/10/2026, 16:58:46
class Solution {
    public int jump(int[] nums) {
        int maxr = 0;
        int currentJump = 0;
        int jump = 0;
        for(int i = 0; i < nums.length-1;i++)
        {
            // if(i < maxr) return maxr;
            maxr = Math.max(maxr,i+nums[i]);
            if(i == currentJump)
            {
                jump++;
                currentJump = maxr;
            }
        }
        return jump;
    }
}