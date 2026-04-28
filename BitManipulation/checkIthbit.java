package BitManipulation;

public class checkIthbit {
    public static void main(String[] args) {
        // using bitwise operator
        int n = 13;
        int i = 2;

        // left shift <<
        if((n&(1<<i)) != 0) System.out.println("yes");
        else System.out.println("no");

        // right shift
        if(((n>>i)&1) != 0) System.out.println("yes");
        else System.out.println("no");

    }
}

