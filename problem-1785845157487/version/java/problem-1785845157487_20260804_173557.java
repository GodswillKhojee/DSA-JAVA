// Last updated: 04/08/2026, 17:35:57
// solved this question using sieve of eratosthenes with TimeComplexity of O(nloglogn)
1class Solution {
2    // final int mod = (int) Math.pow(10,9)+7;
3    static final int mod = 1_000_000_007;
4    public int numPrimeArrangements(int n) {
5        boolean [] prime = new boolean[n+1];
6        Arrays.fill(prime,true);
7        if (n >= 0) prime[0] = false;
8        if (n >= 1) prime[1] = false;
9
10        for(int i = 2;i *i<=n;i++)
11        {
12            if(prime[i])
13            {
14                for(int j = i*i; j<=n;j+= i)
15                {
16                    prime[j] = false;
17                }
18            }
19        }
20        int cp = 0;
21        for(boolean ele:prime) if(ele) cp++;
22        
23        long  arrange = (facp(cp) * facp(n-cp)) % mod;
24        return (int)arrange;
25    }
26    public long facp(int x)
27    {
28        long res = 1;
29        for(int i = 2;i<=x;i++) res = (res*i) % mod;
30        return res;
31    }
32}