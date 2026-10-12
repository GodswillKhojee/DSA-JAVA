// Last updated: 12/10/2026, 16:58:00
class Solution {
    public void check(int idx, int sum, int n, int k, List<Integer> inner, List<List<Integer>> outer) {
        if (inner.size() == k) {
            if (sum == n)
                outer.add(new ArrayList<>(inner));
            return;
        }

        if (idx > 9 || sum > n)
            return;

        inner.add(idx);
        check(idx + 1, sum + idx, n, k, inner, outer);

        inner.remove(inner.size() - 1);

        check(idx + 1, sum, n, k, inner, outer);
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> inner = new ArrayList<>();
        List<List<Integer>> outer = new ArrayList<>();
        check(1, 0, n, k, inner, outer);
        return outer;
    }
}