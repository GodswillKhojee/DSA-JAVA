// Last updated: 30/08/2026, 08:21:39
class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashSet<Integer> already = new HashSet<>();
        HashSet<Integer> notYet = new HashSet<>();

        int old = nums[0];
        for(int i = 1;i<nums.length;i++)
            {
                if(nums[i] != old)
                {
                    if(already.contains(nums[i])) notYet.add(nums[i]);
                }
                already.add(old);
                old = nums[i];
            }
        already.add(old);
        return already.size()-notYet.size();
    }
}