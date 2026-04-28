package BitManipulation;
// well this is not a bitMethod
// did it using math not bitMap
public class primeCount {
    public static int countPrimes(int n) {
        int count=0;
        if(n<=2) return 0;
        for(int i = 2; i < n;i++)
        {
            if(isPrime(i)) count++;
        }
        return count;
    }
    public static boolean isPrime(int n)
    {
        if(n<=1) return false;

        for (int i = 2; i * i <= n; i++)
        {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
}
