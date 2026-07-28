package PrimeNumbers;

public class SeiveOfEratosthanes {
    public static void main(String[] args) {
        // this is the technique of finding the prime number in the TC of o(n)
        int n = 10;
        // 1st make a boolean array of n size
        boolean [] prime = new boolean[n];
        // 2nd fill if with true from 2 to n
        for(int i = 2; i < n;i++)
        {
            prime[i] = true;
        }

        // now sieve of Eratosthenes
        for(int i = 0;i*i<n;i++)
        {
            if(prime[i]) {
                for(int j = i*i;j<n;j+=i) prime[j] = false;
            }
        }
        for(int i = 2;i<n;i++)
        {
            if(prime[i]) System.out.println(i);
        }
    }


}
