// Last updated: 03/08/2026, 21:14:03
class Solution {
    public int findKthPositive(int[] arr, int k) {
        for(int i = 0; i< arr.length;i++)
        {
            if(arr[i] <= k) k++;
            else break;
        }
        return k;
        // TC = o(n)
        // SC = o(1)
    }
}