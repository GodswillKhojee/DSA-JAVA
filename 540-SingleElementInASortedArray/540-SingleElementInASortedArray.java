// Last updated: 03/08/2026, 21:14:51
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int xor = 0;
        for(int ele:nums) xor ^= ele;
        return xor;
    }
}