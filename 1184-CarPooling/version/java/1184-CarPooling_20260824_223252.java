// Last updated: 24/08/2026, 22:32:52
/*
 * here we are making an array of length 1001 which is the length of constrains naming location
 * we are using location to put from and to of the passenger and adding the passenger count in the location array
 * then after that we are traversing through the this array for counting the current passenger and if the current is greater then the capacity then the output will be false otherwise true
*/

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