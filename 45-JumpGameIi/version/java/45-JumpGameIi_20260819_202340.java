// Last updated: 19/08/2026, 20:23:40
/*
 * used three variable
 * maxreach
 * currentJump
 * jump (counting the number of jumps)
 * 
 * first calculated the maxReach
 * then checking if the i == currentJump then increase the jumps then equal the currentJump and maxReach
*/

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