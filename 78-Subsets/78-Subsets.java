// Last updated: 04/08/2026, 00:20:43
class Solution {
    public void sub(List<List<Integer>> outer, List<Integer> inner, int [] nums, int idx)
    {
        if(idx == nums.length)
        {
            outer.add(new ArrayList<>(inner));
            return;
        }

        // take
        inner.add(nums[idx]);
        sub(outer,inner,nums,idx+1);
        //skip
        inner.removeLast();
        sub(outer,inner,nums,idx+1);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        sub(outer,inner,nums,0);
        return outer;
    }
}