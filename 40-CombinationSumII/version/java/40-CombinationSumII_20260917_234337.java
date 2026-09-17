// Last updated: 17/09/2026, 23:43:37
class Solution {
    public void check(int idx, int sum, List<Integer> inner , List<List<Integer>> outer, int []arr, int target)
    {
        if(idx == arr.length)
        {
            if(sum == target) outer.add(new ArrayList<>(inner));
            return ;
        }

        if(sum + arr[idx] <= target)
        {
            inner.add(arr[idx]);
            check(idx+1,sum+arr[idx],inner,outer,arr, target);
            inner.remove(inner.size()-1);
        }
        int nextIdx = idx + 1;
        while (nextIdx < arr.length && arr[nextIdx] == arr[idx]) nextIdx++;
        check(nextIdx, sum, inner, outer, arr, target);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> outer = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        Arrays.sort(candidates);
        check(0,0,inner,outer,candidates, target);
        return outer;
    }
}