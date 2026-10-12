// Last updated: 12/10/2026, 16:55:44
class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele:nums) set.add(ele);
        for(int i = 1; ;i++) if(!set.contains(i*k)) return i*k;
    }
}