package BitManipulation;

public class divideWithsign {

    public static int Divide(long dividend, long divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        boolean sign = (dividend >= 0) == (divisor>=0);
        long n = Math.abs(dividend);
        long d = Math.abs(divisor);
        long ans = 0;
        while(n >= d)
        {
            int cnt = 0;
            while(n >= (d<<cnt+1)) cnt++;
            ans += (1l<<cnt);
            n -= (d<<cnt);
        }
        return  sign ? (int)ans : (int)-ans;
    }

    public static void main(String[] args) {
        long dividend = 22;
        long divisor = 3;

        System.out.println(Divide(dividend, divisor));
    }
}