// Last updated: 04/08/2026, 00:21:12
class Solution {
    public void swap(int [] nums, int a, int b)
    {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public void reverse(int [] nums, int a, int b)
    {
        while(a<b)
        {
            swap(nums,a,b);
            a++;b--;
        }
    }
    // public void print(int [] nums)
    // {
    //     for(int ele: nums)
    //     {
    //         System.out.print(ele+" ");
    //     }
    // }
    public void nextPermutation(int[] nums) {
        int idx = -1;
        int n = nums.length;
        for(int i = n-2;i>= 0; i--)
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
            // print(nums);
            return;
        }
        for(int i = n-1; i > idx;i--)
        {
            if(nums[i] > nums[idx])
            {
                swap(nums,i,idx);
                break;
            }
        }
        reverse(nums,idx+1,n-1);
        // print(nums);
        return;
    }
}