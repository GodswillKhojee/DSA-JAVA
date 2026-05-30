package recursion;

public class generateBrackets {
    public static void bra(int n , int l, int r, String s)
    {
        if(r==n)
        {
            System.out.println(s);
            return;
        }
        if(l<n) bra(n,l+1,r,s+"(");
        if(r<l) bra(n,l,r+1,s+")");
    }
    public static void main(String[] args) {
        int n = 3;
        String s = "";
        bra(n,0,0,s);
    }
}
