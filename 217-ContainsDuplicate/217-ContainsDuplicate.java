// Last updated: 18/08/2026, 20:29:06
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele:nums) set.add(ele);
        // System.out.print(nums.length+" " + set.size());
        return nums.length  != set.size();
    }
}