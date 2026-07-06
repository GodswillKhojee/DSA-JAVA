package Arrays;

public class primeArrangement {
    int mod = (int) Math.pow(10,9) + 7;
    public boolean isPrime(int num)
    {
        if(num <= 1) return false;
        for(int i = 2; i * i<= num;i++)
        {
            if(num%i == 0) return false;
        }
        return true;
    }
    public long fact(int n)
    {
        long res = 1;
        for (int i = 1; i <= n; i++) {
            res = (res * i) % mod;
        }
        return res;
    }
    public int numPrimeArrangements(int n) {
        int c = 0;
        for(int i = 1; i <= n ;i++)
        {
            if(isPrime(i)) c++;
        }
        long ff = (fact(c) * fact(n-c)) % mod;
        return (int) ff;
    }
}
