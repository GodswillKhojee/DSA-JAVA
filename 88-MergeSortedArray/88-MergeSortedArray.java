// Last updated: 04/08/2026, 00:20:35
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x = n+m;
        int [] arr = new int[x];
        int k = 0;
        for(int i = 0; i < m;i++)
        {
            arr[k++] = nums1[i];
        }

        for(int i = 0; i < n;i++)
        {
            arr[k++] = nums2[i];
        }

        Arrays.sort(arr);
        for (int i = 0; i < m + n; i++) {
            nums1[i] = arr[i];
        }

    }
}