// Last updated: 03/08/2026, 21:13:40
import java.util.*;
class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        int n = nums.length;
        for(int i = 0; i < n; i++)
        {
            if(i % 2 ==0) even.add(nums[i]);
            else odd.add(nums[i]);
        }

        Collections.sort(even);
        Collections.sort(odd,Collections.reverseOrder());
        
        int e = 0; int o = 0;
        for(int i = 0 ; i < n; i++)
        {
            if(i % 2 == 0) nums[i] = even.get(e++);
            else nums[i] = odd.get(o++);
        }

        return nums;
    }
}