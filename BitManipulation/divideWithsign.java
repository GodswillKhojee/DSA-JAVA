//package BitManipulation;
//
//public class divideWithsign {
//    public static int Divide(int dividend, int divisor)
//    {
//        if(dividend == divisor) return 1;
//        boolean sign = true;
//        if(dividend >= 0 && divisor < 0) sign = false;
//        if(dividend < 0 && divisor > 0) sign = false;
//
//        int n = Math.abs(dividend);
//        int d = Math.abs(divisor);
//        int ans = 0;
//        while (n >= d)
//        {
//            int cnt = 0;
//            while (n >= (d<<(cnt +1)))
//            {
//                cnt++;
//                ans += (1<<cnt);
//                n = n -(d << cnt);
//            }
//            if(ans >= Integer.MAX_VALUE && sign == true) return Integer.MAX_VALUE;
//            if(ans >= Integer.MIN_VALUE && sign == false) return Integer.MIN_VALUE;
//        }
//        return ans;
//    }
//    public static void main(String[] args) {
//        int dividend = 22;
//        int divisor = 3;
//        Divide(dividend, divisor);
//    }
//}
//
package BitManipulation;

public class divideWithsign {
    public static int Divide(int dividend, int divisor)
    {
        if(dividend == divisor) return 1;

        // Edge case
        if(dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        boolean sign = true;
        if(dividend >= 0 && divisor < 0) sign = false;
        if(dividend < 0 && divisor > 0) sign = false;

        long n = Math.abs((long)dividend);
        long d = Math.abs((long)divisor);

        int ans = 0;

        while (n >= d)
        {
            int cnt = 0;

            // find max power
            while (n >= (d << (cnt + 1)))
            {
                cnt++;
            }

            // update AFTER inner loop (your main bug)
            ans += (1 << cnt);
            n -= (d << cnt);
        }

        // apply sign
        if(!sign) ans = -ans;

        return ans;
    }

    public static void main(String[] args) {
        int dividend = 22;
        int divisor = 3;

        System.out.println(Divide(dividend, divisor));
    }
}