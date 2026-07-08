package DynamicProgramming.pairWithFriend;

import java.util.*;
public class friendsMemoization {
    public long countFriendsPairings(int n) {
        // code here
        int [] dp = new int[n+1];
        Arrays.fill(dp,-1);

        return pair(n,dp);
    }
    public long pair(int n, int [] dp)
    {
        if(n<=2) return n;
        if(dp[n] != -1) return dp[n];
        return dp[n] = (int)(pair(n-1,dp) +(n-1)*pair(n-2,dp));
    }
}
