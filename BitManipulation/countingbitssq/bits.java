package BitManipulation.countingbitssq;

public class bits {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        for(int i =1; i <= n;i++)
        {
            sum += Integer.bitCount(i);
        }
        System.out.println(sum);
    }
}
