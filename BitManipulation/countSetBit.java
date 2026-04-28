package BitManipulation;

public class countSetBit {
    public static  int builtin(int n)
    {
        // builtin method
        return Integer.bitCount(n);
    }
    public static  int raw(int n )
    {
        int cnt = 0;
        while(n > 1)
        {
            if(n%2 == 1) cnt++;
            n /= 2;
        }
        if(n==1)cnt++;
        return cnt;
    }
    public static int bitRaw(int n)
    {
        int cnt = 0;
        while(n>1)
        {
            cnt += n&1;
            n=n>>1;
        }
        if(n==1)cnt++;
        return cnt;
    }
    public static int UsingLastBit(int n )
    {
        int cnt = 0;
        while(n!=0)
        {
            n = n & (n-1);
            cnt++;
        }
        return  cnt;
    }
    public static void main(String[] args) {
        int n = 13;
        System.out.println(builtin(n));
        System.out.println(raw(n));
        System.out.println(bitRaw(n));
        System.out.println(UsingLastBit(n));
    }
}
