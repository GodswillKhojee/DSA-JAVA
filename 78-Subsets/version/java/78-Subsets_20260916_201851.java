// Last updated: 16/09/2026, 20:18:51
class Solution {
    void check(int idx , int[] nums, List<Integer> inner, List<List<Integer>> outer)
    {
        if(idx == nums.length)
        {
            outer.add(new ArrayList<>(inner));
            return;
        }

        inner.add(nums[idx]);
        check(idx+1,nums,inner,outer);
        inner.remove(inner.size()-1);
        check(idx+1,nums,inner,outer);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> inner = new ArrayList<>();
        List<List<Integer>> outer = new ArrayList<>();
        check(0,nums,inner,outer);
        return outer;
    }
}