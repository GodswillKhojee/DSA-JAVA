package Stack;

public class celebrityProblemNestedForLoop {
    public static int celebrity(int mat[][]) {
        // tc = O(n^2)
        int r = mat.length;
        int c = mat[0].length;
        for(int i = 0; i < r;i++)
        {
            int cnt = 0;
            int know = 0;
            for(int j = 0; j < c;j++)
            {
                if(mat[i][j] == 1) cnt++;
            }
            for(int j = 0; j < c;j++)
            {
                if(mat[j][i] == 1) know++;
            }

            if(cnt == 1 && know == r) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [][] mat = {{1, 1, 0},
                        {0, 1, 0},
                        {0, 1, 1}};
        System.out.println(celebrity(mat));
    }
}
