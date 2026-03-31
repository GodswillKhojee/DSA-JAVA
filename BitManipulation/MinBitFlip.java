package BitManipulation;

public class MinBitFlip {
    public static void main(String[] args) {
        int start = 13;
        int goal = 7;
        int ans = start ^ goal;
        System.out.println(Integer.bitCount(ans));
    }
}
