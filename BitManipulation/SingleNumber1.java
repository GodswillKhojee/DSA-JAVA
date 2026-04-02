package BitManipulation;

public class SingleNumber1 {
    public static void main(String[] args) {
        int [] nums = {4,1,2,1,2};
        int xor = 0;
        for(int ele:nums)
        {
            xor ^= ele;
        }
        System.out.println(xor);
    }
}
