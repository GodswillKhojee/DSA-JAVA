package TwoSum;

import java.util.HashMap;

public class betterHashMap {
    public static int[] twoSum(int [] nums, int target)
    {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n;i++)
        {
            int comp = target-nums[i];
            if(map.containsKey(comp)) return new int[]{map.get(comp),i};

            map.put(nums[i],i);
        }
        return nums;
    }
    public static void main(String[] args) {
        int [] nums = {2,6,5,8,11};
        int target = 14;
        int [] index = twoSum(nums, target);
        for(int ele: index) System.out.print(ele+" ");
    }
}
