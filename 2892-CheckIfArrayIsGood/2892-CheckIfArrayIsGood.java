// Last updated: 04/08/2026, 18:59:49
class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length-1;
        for(int i = 1; i < n;i++) if(i!=nums[i-1]) return false;
        if(nums[n] == n && nums[n-1] == n) return true;
       
        return false;
        
    }
}