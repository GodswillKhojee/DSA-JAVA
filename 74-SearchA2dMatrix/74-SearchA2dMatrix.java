// Last updated: 04/08/2026, 00:20:48
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int l = 0, h = rows*cols - 1;
        while(l <= h)
        {
            int m = (l+h)/2;
            int midRow = m/cols, midCol = m%cols;
            if(matrix[midRow][midCol] == target) return true;
            else if(matrix[midRow][midCol] > target) h = m-1;
            else l = m + 1;
        }
        return false;
    }
}