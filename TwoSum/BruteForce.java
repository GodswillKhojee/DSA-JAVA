package TwoSum;

public class BruteForce {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i = 0; i < n;i++)
        {
            for(int j = i +1; j< n;j++)
            {
                if(nums[i] + nums[j] == target) return new int[]{i,j};
            }
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
