package recursion.tribonacci;

public class normal {
    public static int trib(int n)
    {
        if(n==0) return 0;
        if(n<=2) return 1;
        int a = 0; int b = 1; int c = 1;
        for(int i = 0; i < n;i++)
        {
            int cur = a+b+c;
            a=b;
            b=c;
            c=cur;
        }
        return c;
    }
    public static void main(String[] args) {
        int n = 35;
        System.out.println(trib(n));
    }
}
