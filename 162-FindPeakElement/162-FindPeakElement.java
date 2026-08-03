// Last updated: 03/08/2026, 21:16:18
class Solution {
    public int findPeakElement(int[] arr) {
        int n = arr.length;
        int l = 0;
        int h = n-1;
        if(n == 1) return 0;
        if(n <= 3)
        {
            int max = 0;
            for(int i = 1; i < n;i++)
            {
                if(arr[max] < arr[i])
                {
                    max = i;
                }
            }
            return max;
        }
        // this 
        while(l<h)
        {
            int mid = (l+h)/2;
            if(arr[mid] > arr[mid+1]) h = mid;
            else l = mid+1;
        }
        return l;
    }
}