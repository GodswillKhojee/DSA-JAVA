package BitManipulation;

public class SingleNumber2 {
    public static void main(String[] args) {
        int [] arr = {3 ,1 ,2 ,1};
        int n = arr.length;
        int xor = 0;

        for (int i = 0; i < n; i++) {
            xor ^= arr[i];
        }

        int right = xor & (-xor);

        int b1 = 0, b2 = 0;

        for (int i = 0; i < n; i++) {
            if ((arr[i] & right) != 0)
                b1 ^= arr[i];
            else
                b2 ^= arr[i];
        }

        if (b1 < b2)
            System.out.print(b1 + " " + b2);
        else
            System.out.print(b2 + " " + b1);
    }
}
