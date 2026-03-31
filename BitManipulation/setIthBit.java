package BitManipulation;

public class setIthBit {
    public static void main(String[] args) {
        // using left shift << and OR operator
        int n = 9;
        int i = 2;
        n = n|(1<<i);
        System.out.println(n);
    }
}
