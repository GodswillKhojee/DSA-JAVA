package recursion.tribonacci;

public class recursive {
    public static int trib(int n)
    {
        if(n==0) return 0;
        if(n<=2) return 1;
        return trib(n-3) + trib(n-2) + trib(n-1);
    }
    public static void main(String[] args) {
        int n = 34;
        System.out.println(trib(n));
    }
}
