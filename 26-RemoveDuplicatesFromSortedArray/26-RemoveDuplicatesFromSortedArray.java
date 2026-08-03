// Last updated: 04/08/2026, 00:21:19
class Solution {
    public int removeDuplicates(int[] nums) {
        int start = 0;
        for(int i = 0; i < nums.length;i++)
        {
            if(i<nums.length-1 && nums[i] == nums[i+1]) continue;
            else {
                nums[start] = nums[i];
                start++;
            }
        }
        return start;
    }
}