package Arrays.NextPermutation;

public class nextPermutation {
    public static int [] permutation(int [] nums)
    {
        int n = nums.length;
        int idx = -1;
        for(int i = n-2;i>=0;i--)
        {
            if(nums[i] < nums[i+1])
            {
                idx = i;
                break;
            }
        }
        if(idx == -1)
        {
            reverse(nums,0,n-1);
            return nums;
        }
        for(int i = n - 1; i > idx; i--)
        {
            if(nums[i] > nums[idx])
            {
                swap(nums,i , idx);
                break;
            }
        }
        reverse(nums, idx+1, n-1);
        return nums;
    }
    public static void swap(int [] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int [] nums, int i,int j)
    {
        while(i<j)
        {
            swap(nums,i++,j--);
        }
    }
    public static void main(String[] args) {
        // observation of this how to get the list
        // 1. longer prefix matches ->  a[i] < a[i+1] this will be the break point
        // 2. find > a[i]    but small one  so that you stay close
        // 3. try to place remaining in a sorted order

//        int [] arr = {2,1,5,4,3,0,0};
        int [] arr = {1,2,3,4,5,6,7};
        int [] ans = permutation(arr);

        for(int ele:ans) System.out.print(ele+" ");
    }
}
