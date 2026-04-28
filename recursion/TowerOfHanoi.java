package recursion;

public class TowerOfHanoi {
    public static void toh(int n,char from,char to,char mid)
    {
        if (n==0) return;
        toh(n-1,from,mid,to);
        System.out.print(from + " -> "+ mid);
        System.out.println();
        toh(n-1,to,from,mid);
    }
    public static void main(String[] args) {
        int n = 2;
        char from = 'a';
        char to = 'b';
        char mid = 'c';

        toh(n,from,to,mid);
    }
}
