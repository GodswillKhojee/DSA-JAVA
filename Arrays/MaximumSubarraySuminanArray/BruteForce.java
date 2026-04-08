package Arrays.MaximumSubarraySuminanArray;

public class BruteForce {
    public static int MaxSumeArray(int [] nums)
    {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            int sum = 0;
            for(int j = i;j<n;j++)
            {
                sum += nums[j];
                if(max < sum) max = sum;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] nums = {2, 3, 5, -2, 7, -4};
//        int [] nums = {-2, -3, -7, -2, -10, -4};
        System.out.println(MaxSumeArray(nums)
        );
    }
}
