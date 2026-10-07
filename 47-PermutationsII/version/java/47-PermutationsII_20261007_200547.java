// Last updated: 07/10/2026, 20:05:47
class Solution {
    public void check(int [] num,List<List<Integer>> outer, List<Integer> inner, boolean []used)
    {
        if(inner.size() >= num.length)
        {
            if(!outer.contains(inner))
            {
                outer.add(new ArrayList<>(inner));
                return;
            }
            
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
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        boolean [] used = new boolean[nums.length];
        check(nums,outer,inner, used);
        return outer;
    }
}