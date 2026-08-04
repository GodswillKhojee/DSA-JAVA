// Last updated: 04/08/2026, 20:24:37
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length-1;
        int first = nums[0];
        int last = nums[n];
        List<Integer> ls = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int ele:nums) set.add(ele);

        for(int i = first ; i <= last;i++) 
        {
            if(!set.contains(i)) ls.add(i);
        }
        return ls;
    }
}