package recursion.basic;

public class palindromeString {
    public static boolean reverse(String s,int i,int n)
    {
        if(i >= n) return true;
        if(s.charAt(i) != s.charAt(n)) return false;
        return reverse(s,i+1,n-1);
    }
    public static void main(String[] args) {
        String s = "helloolleh";
        System.out.println(reverse(s,0,s.length()-1));
    }
}
