// Last updated: 03/08/2026, 21:15:27
class Solution {
    public int findDuplicate(int[] nums) 
    {
        int len = nums.length-1;
        int i = 0;
        Arrays.sort(nums);
        while(i<len)
        {
            if(nums[i] == nums[i+1]) return nums[i];
            i++;
        }
        return len;
    }
}