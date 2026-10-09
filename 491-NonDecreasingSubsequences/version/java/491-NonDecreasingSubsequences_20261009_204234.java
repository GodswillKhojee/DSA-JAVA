// Last updated: 09/10/2026, 20:42:34
class Solution {
    public void check(int[] nums, int idx, List<List<Integer>> outer, List<Integer> inner) {
        if (inner.size() >= 2) {
            outer.add(new ArrayList<>(inner));
            if (inner.size() >= nums.length)
                return;
        }

        HashSet<Integer> set = new HashSet<>();

        for (int i = idx; i < nums.length; i++) {
            if (set.contains(nums[i]))
                continue;

            if (inner.isEmpty() || nums[i] >= inner.get(inner.size() - 1)) {
                set.add(nums[i]);
                inner.add(nums[i]);
                check(nums, i+1, outer, inner);
                inner.remove(inner.size() - 1);
            }
        }
    }

    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        check(nums, 0, outer, inner);
        return outer;
    }
}