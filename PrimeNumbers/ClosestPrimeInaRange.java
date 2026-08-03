package PrimeNumbers;
import java.util.*;
public class ClosestPrimeInaRange {
    public int[] closestPrimes(int left, int right) {
        boolean [] prime = new boolean[right+1];
        Arrays.fill(prime, true);
        prime[0] = false;prime[1]=false;
        for(int i = 2;i*i<=right;i++)
        {
            if(prime[i])
            {
                for(int j = i*i; j <=right;j+=i)
                {
                    prime[j] = false;
                }
            }
        }

        int[] ans = {-1,-1};
        int minDiff = Integer.MAX_VALUE;
        int  prev = -1;
        for (int i = left; i <= right; i++) {
            if (prime[i]) {
                if (prev != -1) {
                    int diff = i - prev;
                    if (diff < minDiff) {
                        minDiff = diff;
                        ans[0] = prev;
                        ans[1] = i;
                    }
                }
                prev = i;
            }
        }
        return ans;
    }
}
