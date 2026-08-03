// Last updated: 03/08/2026, 21:13:21
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int m = 0;
        for(int i = 0; i < nums.length;i++)
        {
            if(m < nums[i]) m = nums[i];
        }
        int [] hash = new int[m+1];
        for(int i = 0; i < nums.length;i++)
        {
            hash[nums[i]] += 1;
        }
        int max = 0;
        for(int i = 0; i < hash.length;i++)
        {
            if(max < hash[i]) max = hash[i]; 
        }

        int count = 0 ;
        for(int i = 0; i < hash.length;i++) 
        {
            if(hash[i] == max) count++;
        }
        return count*max;
    }
}