package Arrays.MaximumSubarraySuminanArray;

public class optimize {
    public static void main(String[] args) {
//        int [] nums = {2, 3, 5, -2, 7, -4};
        int [] nums = {-2, -3, -7, -2, -10, -4};
        System.out.println(MaxSumeArray(nums)
        );
    }
    public static int MaxSumeArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int ele:nums)
        {
            sum += ele;
            if(max < sum) max = sum;
            if(sum < 0) sum = 0;
        }
        return max;
    }
}
