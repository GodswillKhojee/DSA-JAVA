package recursion.basic;

import java.sql.SQLOutput;

public class printNtimeNames {
    public static void Print(String x,int n)
    {
        if(n==0) return;
        System.out.println(x);
        Print(x,n-1);
    }
    public static void main(String[] args) {
        Print("hello", 3);
    }
}
