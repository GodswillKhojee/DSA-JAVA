package Arrays.twoDarray;

public class baseToStart {
    public static void main(String[] args) {
        int [] arr = {1,0,15,-2,-3,6};
        int max = Integer.MIN_VALUE;
        for(int ele:arr) max = Math.max(max,ele);

        for(int ele: arr)
        {
            if(ele<0) System.out.println('x');
            else
            {
                for(int i = 0; i < ele;i++)
                {
                    System.out.println('*');
                    if(i< ele) System.out.print("*");
                }
            }
        }
    }
}
