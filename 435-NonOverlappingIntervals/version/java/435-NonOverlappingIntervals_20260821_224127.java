// Last updated: 21/08/2026, 22:41:27
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[1] - b[1]);
        int overLap = 0;
        int lastDay = intervals[0][1];
        for(int i = 1; i < intervals.length;i++)
        {
            int newDay = intervals[i][0];
            if(newDay >= lastDay) lastDay = intervals[i][1];
            else overLap++;
        }
        return overLap;
    }
}