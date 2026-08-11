// Last updated: 11/08/2026, 20:11:01
class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        int idx = 1;
        while(idx < nums.length && nums[idx] == nums[idx-1]+1) 
        {
            sum += nums[idx];
            idx++;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int ele:nums) set.add(ele);
        while(set.contains(sum)) sum++;        
        
        return sum;
    }
}