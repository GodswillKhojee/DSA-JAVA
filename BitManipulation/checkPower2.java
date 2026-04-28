package BitManipulation;

public class checkPower2 {
    public static void main(String[] args) {
        int n = 32;
        if((n&(n-1)) == 0) System.out.println("yes");
        else System.out.println("true");

        // brute force would be to convert decimal to binary and check if it
        // only contains 1 bit
        // if yes then its power of 2
    }
}
