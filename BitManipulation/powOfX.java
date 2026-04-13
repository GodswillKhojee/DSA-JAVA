package BitManipulation;

public class powOfX {
    public static void main(String[] args) {
        System.out.println(myPow(2,3));
    }
    public static double myPow(double x, int n) {
        // for negative and int overflow
        long N = n;

        if(N < 0) {
            x = 1 / x;
            N = -N;
        }

        return power(x, N);
    }

    public static double power(double x, long n) {
        if(n == 0) return 1;

        double call = power(x, n/2);

        if(n % 2 == 0) return call * call;
        else return x * call * call;
    }
}
