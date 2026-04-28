package BitManipulation;

public class XORrange {
    public static int xorN(int L,int R)
    {
        return XORpat(L-1) ^ XORpat(R);
    }
    public static int XORpat(int n)
    {
        if(n%4 == 1) return 1;
        else if(n%4 ==2) return n+1;
        else if(n%4 == 3) return 0;
        else return n;
    }
    public static void main(String[] args) {
        System.out.println(xorN(4,9));
        int [] nums = {1, 3, 5, 7, 9, 11};
        System.out.println(SimpleXorRange(nums,2,5));
    }
    public static int SimpleXorRange(int [] nums, int a, int b)
    {
        int xor = 0;
        for(int i = a;i<=b;i++)
        {
            xor ^= nums[i];
        }
        return xor;
    }

}
