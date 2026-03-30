package BitManipulation;

public class SwapTwoNumWithout3rdVar {
    public static void main(String[] args) {
        int a = 8;
        int b = 2;
        System.out.println("a= "+a + " "+ "b= "+ b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a= "+a + " "+ "b= "+ b);
    }
}
