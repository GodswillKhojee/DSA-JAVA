// Last updated: 17/11/2026, 20:34:32
class Solution {
    public int countPrimes(int n) {
        // Sieve of Eratosthenes 
        if(n <= 2) return 0;
        boolean [] prime = new boolean[n];
        for (int i = 2; i < n; i++) {
            prime[i] = true;
        }

        for(int i = 2; i*i < n;i++)
        {
            for(int j = i*i; j< n;j+=i)
            {
                prime[j] = false;
            }
        }
        int count = 0;
        for(int i = 0;i<n;i++)
        {

            if(prime[i]) count++;
        } 
        return count;

    }
}