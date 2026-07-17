package DynamicProgramming.countSqSubmatricsWithAllOnes;

public class tabulation {
    public int countSquares(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int count = 0;
        for(int i = 0; i < n;i++)
        {
            for(int j = 0;j<m;j++)
            {
                if(arr[i][j] == 0) continue;
                if(i>0 && j>0) {
                    arr[i][j] =1+ Math.min(arr[i-1][j],Math.min(arr[i][j-1], arr [i-1][j-1]));
                }
                count+=arr[i][j];
            }
        }
        return count;
    }
}
