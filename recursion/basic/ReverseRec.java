package recursion.basic;

public class ReverseRec {
    public static void swap(int i , int n, int [] nums)
    {
        int temp = nums[i];
        nums[i] = nums[n];
        nums[n] = temp;
    }
    public static void recursion(int [] nums, int i, int n)
    {
        if(i >= n) return;
        swap(i,n,nums);
        recursion(nums,i+1,n-1);
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        recursion(nums,0,nums.length-1);
        for(int ele: nums)
        {
            System.out.print(ele + " ");
        }
    }
}
