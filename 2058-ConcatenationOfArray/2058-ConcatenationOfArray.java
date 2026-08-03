// Last updated: 03/08/2026, 21:13:52
class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] ans = new int[nums.length * 2];
        int i = 0 ;
        while(i<nums.length)
        {
            ans[i] = nums[i];
            i++;
        }
        int j = 0;
        while(i<ans.length)
        {
            ans[i] = nums[j];
            i++;
            j++;
        }
        return ans;
    }
}