package recursion.permutation;

import java.util.*;

public class approach1 {
    public static void rec(int [] nums, List<Integer> ds, List<List<Integer>> ans, boolean [] freq)
    {
        if(ds.size() == nums.length)
        {
            ans.add(new ArrayList(ds));
            return;
        }

        for(int i = 0; i < nums.length;i++)
        {
            if(!freq[i])
            {
                freq[i] = true;
                ds.add(nums[i]);
                rec(nums,ds,ans,freq);
                ds.remove(ds.size()-1);
                freq[i] = false;
            }
        }
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean [] freq = new boolean[nums.length];
        rec(nums,ds,ans,freq);
        return ans;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3};
        System.out.println(permute(nums));
    }
}
