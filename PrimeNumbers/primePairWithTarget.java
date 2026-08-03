package PrimeNumbers;

import java.util.*;

public class primePairWithTarget {
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> bhai = new ArrayList<>();

        boolean [] prime = new boolean[n+1];

        Arrays.fill(prime,true);
        prime[0] = false;
        prime[1] = false;
        for(int i = 2; i *i<= n;i++)
        {
            if(prime[i])
            {
                for(int j = i*i;j<=n;j+=i)
                {
                    prime[j] = false;
                }
            }
        }
        int i = 0; int j = n;
        while(i<=j)
        {
            if(prime[i] && prime[j] )
            {
                if(i+j == n) bhai.add(Arrays.asList(i++,j--));
                else if(i+j > n) j--;
                else i++;
            }
            i++;j--;
        }
        // for(int i = 2; i <=n/2;i++)
        // {
        //     if(prime[i]&&prime[n-i]) bhai.add(Arrays.asList(i,n-i));
        // }
        return bhai;
    }
}
