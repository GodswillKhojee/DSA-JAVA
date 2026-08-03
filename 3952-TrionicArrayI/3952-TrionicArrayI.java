// Last updated: 03/08/2026, 21:13:10
class Solution {
    public boolean isTrionic(int[] nums) {
       int x = nums.length -1;
        boolean p = false;
        boolean q = false;
        boolean n = false;
        int i = 0;
        while(i < x && nums[i] < nums[i+1])
        {
            p = true;
            i++;
        }

        while(i < x && nums[i] > nums[i+1])
        {
            q = true;
            i++;
        }
        while(i < x && nums[i] < nums[i+1])
        {
            n = true;
            i++;
        }
        if(q && p && n && i == x) return true;
        else return false;
    }
}