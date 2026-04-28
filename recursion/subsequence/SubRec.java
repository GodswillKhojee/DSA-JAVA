package recursion.subsequence;

import java.util.ArrayList;
import java.util.List;

public class SubRec {
    public static void subs(int [] nums, int i , List<Integer> ans)
    {
        if(i == nums.length)
        {
            System.out.println(ans);
            return;
        }

        // pick
        ans.add(nums[i]);
        subs(nums,i+1,ans);

        // not pick
        ans.remove(ans.size()-1);
        subs(nums,i+1,ans);
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        List<Integer> ans = new ArrayList<>();
        subs(arr, 0, ans);
    }
}
