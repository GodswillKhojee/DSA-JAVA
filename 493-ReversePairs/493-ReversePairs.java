// Last updated: 03/08/2026, 21:15:01
class Solution {
    int count = 0;
    public int reversePairs(int[] nums) {
        mergeSort(nums);  
        return count;     
    }
    public void mergeSort(int [] nums)
    {
        int n = nums.length;
        if(n==1) return;
        int [] L = new int[n/2];
        int [] R = new int[n-n/2];
        int k = 0;
        for(int i = 0; i < L.length;i++) L[i] = nums[k++];
        for(int i = 0; i < R.length;i++) R[i] = nums[k++];

        mergeSort(L);
        mergeSort(R);


        countReverse(L,R);

        merge(L,R,nums);
    }
    public void merge(int [] L, int [] R, int[] nums)
    {
        int i = 0,j = 0, k= 0;
        while(i < L.length && j < R.length)
        {
            if(L[i] <= R[j]) nums[k++] = L[i++];
            else nums[k++] = R[j++];
        }
        while(i<L.length) nums[k++] = L[i++];
        while(j<R.length) nums[k++] = R[j++];
    }
    public void countReverse(int [] L, int [] R)
    {
        int i = 0; int j = 0;
        while(i < L.length && j < R.length)
        {
            if((long)L[i] > (long)2 * (long)R[j]) 
            {
                count += (L.length - i);
                j++;
            }
            else i++;
        }
    }
}