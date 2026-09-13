// Last updated: 13/09/2026, 23:40:34
class Solution {
    public int countOffSet(int[][] a, int[][] b, int rowOff, int colOff)
    {
        int n = a.length;

        int count = 0;
        for(int i = 0; i < n ;i++)
        {
            for(int j = 0; j < n;j++)
            {
                int bi = i + rowOff;
                int bj = j + colOff;
                if(bi < 0 || bi >= n || bj<0 || bj>= n) continue;

                if(a[i][j] == 1 && b[bi][bj] == 1) count++;
            }
        }
        return count;
    }
    public int largestOverlap(int[][] a, int[][] b) {
        int n = a.length;
        int maxOverLap = 0;
        for(int rowOff = -n+1; rowOff < n; rowOff++)
        {
            for(int colOff = -n+1; colOff < n; colOff++)
            {
                int count = countOffSet(a,b,rowOff, colOff);

                maxOverLap = Math.max(maxOverLap,count);
            }
        }
        return maxOverLap;
    }
}