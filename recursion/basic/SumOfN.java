package recursion.basic;

public class SumOfN {
    public static int NnumbersSum(int N) {
        if(N==1) return 1;
        return N + NnumbersSum(N-1);
    }
    public static void main(String[] args) {
        System.out.println(NnumbersSum(10));;
    }
}
