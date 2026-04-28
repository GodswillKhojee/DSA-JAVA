package recursion.powerOfThree;

public class linearApproach {
    public static boolean isItThree(int n)
    {
        if(n<= 0) return false;
        while(n%3==0)
        {
            n/=3;
        }
        return n==1;
    }
    public static void main(String[] args) {
        int n = 24;
        System.out.println(isItThree(n));
    }
}
