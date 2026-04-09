package Arrays.arrangeNegPos;

public class solution {
    public static int[] rearrangeArray(int[] nums) {
        int pos = 0;
        int neg = 1;
        int n = nums.length;

        int[] ans = new int[n];

        for(int i = 0; i < n; i++) {
            if(nums[i] < 0) {
                ans[neg] = nums[i];
                neg += 2;
            } else {
                ans[pos] = nums[i];
                pos += 2;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int [] nums = {3,1,-2,-5,2,-4};
        int [] arr = rearrangeArray(nums);
        for(int i:arr) System.out.print(i+" ");

    }
}
