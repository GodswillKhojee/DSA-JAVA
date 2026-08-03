package Arrays.twoDarray;

public class printDiag {
    public static void main(String[] args) {
        int r = 3;
        int c = 4;
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c;j++)
            {
                if(i ==j || i+j == arr.length-1) System.out.print(arr[i][j]+" ");
                else System.out.print('x'+" ");
            }
            System.out.println();
        }
    }
}
