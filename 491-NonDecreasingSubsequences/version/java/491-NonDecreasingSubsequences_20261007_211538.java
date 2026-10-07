// Last updated: 07/10/2026, 21:15:38
class Solution {
    public void check(int idx, int[] nums, List<List<Integer>> outer, List<Integer> inner) {
        if (inner.size() >= 2 ){
            outer.add(new ArrayList<>(inner));

        }
        if (idx >= nums.length)
            return;

        HashSet<Integer> set = new HashSet<>();

        for(int i = idx; i < nums.length;i++)
        {
            if (!set.contains(nums[i]) && (inner.isEmpty() || nums[i] >= inner.get(inner.size() - 1))) {

                inner.add(nums[i]);
                check(i + 1, nums, outer, inner);
                inner.remove(inner.size() - 1);
                set.add(nums[i]);
            }
        }

    }

    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        check(0, nums, outer, inner);
        return outer;
    }
}