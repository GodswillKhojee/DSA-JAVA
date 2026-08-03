// Last updated: 03/08/2026, 21:13:43
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos = 0;
        int neg = 1;
        int n = nums.length;

        int[] ans = new int[n]; // create new array

        for(int i = 0; i < n; i++) {
            if(nums[i] < 0) {
                ans[neg] = nums[i];
                neg += 2;
            } else {
                ans[pos] = nums[i];
                pos += 2;
            }
        }

        return ans;
    }
}