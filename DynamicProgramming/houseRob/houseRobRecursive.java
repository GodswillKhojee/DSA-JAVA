package DynamicProgramming.houseRob;

public class houseRobRecursive {
    public int robi(int [] nums, int i)
    {
        if(i >= nums.length) return 0;
        int take = nums[i] + robi(nums,i+2);
        int skip = robi(nums,i+1);
        return Math.max(take,skip);
    }
    public int rob(int[] nums) {
        return robi(nums,0);
    }
}
