// Last updated: 03/08/2026, 21:13:12
class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int [] result = new int[nums.length];
        for(int i = 0; i < nums.length;i++)
        {
            int shift = nums[i] % nums.length;
            int ni = (i+shift) % nums.length;
            if(ni < 0) ni += nums.length;
            result[i] = nums[ni];
        }
        return result;
    }
}