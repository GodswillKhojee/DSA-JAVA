// Last updated: 03/08/2026, 21:13:28
class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int l = 0, h = n-1;
        int neg = 0, pos = 0;
        if(nums[0] > 0) return n;
        else if(nums[n-1] < 0) return n;
        while(l<=h)
        {
            int m = l+(h-l)/2;
            
            if(nums[m]>= 0) h = m-1;
            else l = m + 1;
        }
        neg = l;
        l = 0;
        h = n-1;
        while(l<=h)
        {
            int m = l+(h-l)/2;
            
            if(nums[m]<= 0) l = m+1;
            else h = m -1;
        }
        pos = n - l;
        
        int max = neg > pos ? neg : pos;
        return max;
    }
}