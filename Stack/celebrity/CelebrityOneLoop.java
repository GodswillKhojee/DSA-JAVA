package Stack.celebrity;

public class CelebrityOneLoop {
    public static int celebrity(int mat[][]) {
        // tc = O(n)
        int a = 0;
        int b = mat.length -1;
        while(a < b)
        {
            if(mat[a][b] == 1) a++;
            else if(mat[b][a] == 1) b--;
            else{ a++;b--;}
        }
        if(a > b) return -1;
        for(int i = 0; i < mat.length;i++)
        {
            if(i != a && ( mat[i][a] == 0|| mat[a][i] == 1)) return -1;
        }
        return a;
    }
    public static void main(String[] args) {
        int [][] mat = {{1, 1, 0},
                {0, 1, 0},
                {0, 1, 1}};
        System.out.println(celebrity(mat));
    }
}
