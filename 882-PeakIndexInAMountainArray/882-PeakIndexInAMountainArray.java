// Last updated: 03/08/2026, 21:14:31
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l = 1, h = arr.length-2;
        while(l<=h)
        {
            int mid = (l+h)/2;
            if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]) return mid;
            else if(arr[mid] < arr[mid+1] && arr[mid] > arr[mid-1]) l = mid+1;
            else h = mid -1;
        }
        return 0;
    }
}