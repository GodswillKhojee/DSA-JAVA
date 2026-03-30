package sorts012;

public class dutchFlagMethod {
    public static void sortZeroOneTwo(int [] nums)
    {
        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n-1;

        while(mid <= high)
        {
            if(nums[mid] == 0)
            {
                swap(mid,low,nums);
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                swap(mid, high, nums);
                high--;
            }
        }
    }
    public static void swap(int a, int b, int[]nums)
    {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 2, 0, 1};
        sortZeroOneTwo(nums);

        System.out.println("After sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
