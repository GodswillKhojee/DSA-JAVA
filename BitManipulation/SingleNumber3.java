package BitManipulation;

public class SingleNumber3 {
    public static void main(String[] args) {
        int [] nums = {2,3,2,4,3,5,1,4};
        int n = nums.length;
        int xor = 0;
        int b1 = 0;
        int b2 = 0;
        for(int i = 0; i < n;i++) xor ^=  nums[i];

        int right = xor & -xor;
        for(int i = 0; i < n;i++)
        {
            if((nums[i] & right) == 0)
            {
                b1 ^= nums[i];
            }
            else b2 ^=  nums[i];
        }

        System.out.println(b1+" "+b2);

    }
}
