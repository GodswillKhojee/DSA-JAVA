// Last updated: 03/08/2026, 21:13:06
class Solution {
    public int minRemoval(int[] nums, int k) {

        Arrays.sort(nums);
        int n = nums.length;
        int i = 0;
        int max = 1;
       for(int j = 0;j<n;j++)
       {
            long vi = nums[i];
            long vj = nums[j];
            while(i<j && vj > (long) k * vi)
            {
                i++;
                vi = nums[i];
            }
            max = Math.max(max,j-i+1);
       }
        return n - max;
    }
}