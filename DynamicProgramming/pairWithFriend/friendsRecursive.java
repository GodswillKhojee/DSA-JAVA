package DynamicProgramming.pairWithFriend;

public class friendsRecursive {
    public long countFriendsPairings(int n) {
        // code here
        return pair(n);
    }
    public long pair(int n)
    {
        if(n<=2) return n;
        return(int)(pair(n-1) +(n-1)*pair(n-2));
    }
}
