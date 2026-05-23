package recursion;

import java.util.Scanner;
public class primeFactor {
    public static void primeFactors(int n, int i)
    {
        if(n==1) return;

        if(n%i==0)
        {
            System.out.print(i +" ");
            primeFactors(n/i,i);

        }
        else primeFactors(n,i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        primeFactors(num, 2);
    }
}
