// Last updated: 17/09/2026, 21:17:21
class Solution {

    public void solve(int idx, int sum, List<Integer> inner,
            List<List<Integer>> outer, int target, int[] arr) {

        if (idx == arr.length) {
            if (sum == target) {
                outer.add(new ArrayList<>(inner));
            }
            return;
        }

        if (sum + arr[idx] <= target) {
            inner.add(arr[idx]);

            // TAKE → don't increase idx
            solve(idx, sum + arr[idx], inner, outer, target, arr);

            // Backtrack
            inner.remove(inner.size() - 1);
        }

        // SKIP → increase idx
        solve(idx + 1, sum, inner, outer, target, arr);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> outer = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();

        solve(0, 0, inner, outer, target, candidates);

        return outer;
    }
}