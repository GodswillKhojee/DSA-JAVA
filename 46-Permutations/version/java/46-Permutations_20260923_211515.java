// Last updated: 23/09/2026, 21:15:15
class Solution {
    public void check(int [] num,List<List<Integer>> outer, List<Integer> inner, boolean []used)
    {
        if(inner.size() >= num.length)
        {
            outer.add(new ArrayList<>(inner));
            return;
        }
        for(int i = 0; i<num.length;i++)
        {
            if(used[i]) continue;
            used[i] = true;
            inner.add(num[i]);
            check(num,outer, inner,used);
            inner.remove(inner.size()-1);
            used[i] = false;
        }
        
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        boolean [] used = new boolean[nums.length];
        check(nums,outer,inner, used);
        return outer;
    }
}