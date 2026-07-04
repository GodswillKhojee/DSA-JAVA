package DynamicProgramming;

public class fibonacciMemo
{
    public int fibo(int n, int [] lookUp)
    {
        if(n <= 1) return n;
        if(lookUp[n] != 0) return lookUp[n];
        int ans = fibo(n-1,lookUp) + fibo(n-2,lookUp);
        lookUp[n] = ans;
        return ans;
    }
    public int fib(int n) {
        int [] lookUp = new int[n+1];
        return fibo(n,lookUp);
    }
}
