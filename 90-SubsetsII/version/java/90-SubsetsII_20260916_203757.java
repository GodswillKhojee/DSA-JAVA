// Last updated: 16/09/2026, 20:37:57
class Solution {
    void check(int idx, int[] nums, List<Integer> inner, List<List<Integer>> outer)
    {
        if(idx == nums.length)
        {
            outer.add(new ArrayList<>(inner));
            return;
        }
        inner.add(nums[idx]);
        check(idx+1,nums,inner,outer);
        inner.remove(inner.size()-1);
        int nextIdx = idx+1;
        while(nextIdx < nums.length  && nums[nextIdx] == nums[idx]) nextIdx++;
        check(nextIdx,nums,inner,outer);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> inner = new ArrayList<>();
        List<List<Integer>> outer = new ArrayList<>();
        Arrays.sort(nums);
        check(0,nums,inner,outer);
        return outer;
    }
}