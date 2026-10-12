// Last updated: 12/10/2026, 16:56:43
class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int [] location = new int[1001]; 
        for(int [] ele:trips)
        {
            int pas = ele[0];
            int from = ele[1];
            int to = ele[2];

            location[from] += pas;
            location[to] -= pas;
        }
        int current = 0;
        for(int i = 0; i < location.length;i++)
        {
            current += location[i];
            if(current > capacity) return false;
        }
        return true;
    }
}