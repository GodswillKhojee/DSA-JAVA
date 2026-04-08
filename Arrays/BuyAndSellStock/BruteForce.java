package Arrays.BuyAndSellStock;

public class BruteForce {
    public static int maxProfit(int[] prices) {
        // tc => O(n^2)
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int [] nums = {7,1,5,3,6,4};
        System.out.println(maxProfit(nums));
    }
}
