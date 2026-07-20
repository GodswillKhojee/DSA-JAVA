package DynamicProgramming;

public class bestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int ele:prices)
        {
            if(min>ele) min = ele;
            else max = Math.max(max,ele-min);
        }
        return max;
    }
}
