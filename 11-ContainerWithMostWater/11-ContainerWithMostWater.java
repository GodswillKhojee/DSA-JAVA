// Last updated: 04/08/2026, 00:21:29
class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int max = 0;
        while(i<j)
        {
            int min = Math.min(height[i],height[j]);
            int width = Math.abs(j-i);
            max = Math.max(max, min*width);
            if(height[j]<height[i]) j--;
            else i++;
        }
        return max;
    }
}