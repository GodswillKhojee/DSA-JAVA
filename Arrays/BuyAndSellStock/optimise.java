package Arrays.BuyAndSellStock;

public class optimise {
    public static int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;

        for(int p:prices)
        {
            if(min > p) min = p;
            else
            {
                max =Math.max(max, p-min);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}
