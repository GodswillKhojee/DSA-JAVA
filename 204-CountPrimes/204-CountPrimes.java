// Last updated: 03/08/2026, 21:16:03
class Solution {
    public int countPrimes(int n) {
        if(n<=2) return 0;
        boolean [] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        for(int i = 2;i*i< n;i++){
            if(isPrime[i])
            {
                for(int j = i*i;j<n;j+=i)
                {
                    isPrime[j] = false;
                }
            }
        }
        int count =0;
        for(boolean ele:isPrime)
        {
            if(ele) count++;
        }
        return count;
    }
}