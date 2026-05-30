package recursion;

import java.util.*;

public class generagteBinaryStringWithOutAdjacentZero {
    public static void bin(int n , List<String> ls,String s)
    {
        if(n==s.length())
        {
            ls.add(s);
            return;
        }
        bin(n,ls,s+"1");
        if(s.length() == 0 || s.charAt(s.length()-1) != '0') bin(n,ls,s+"0");
    }
    public static  List<String> validStrings(int n) {
        List<String> ls = new ArrayList<>();
        bin(n,ls,"");
        Collections.sort(ls);
        return ls;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(validStrings(n));
    }
}
