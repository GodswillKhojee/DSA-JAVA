// Last updated: 03/08/2026, 21:16:41
class Solution {
    public int singleNumber(int[] nums) {
        // now using xor operation
        int xor = 0;
        for(int ele: nums)
        {
            xor ^= ele;
        }
        return xor;
    }
}