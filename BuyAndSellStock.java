package leetcode;

public class BuyAndSellStock {

    public static void main(String[] args) {

        int[] arr = new int[]{7, 1, 5, 3, 6, 4};

        BuyAndSellStock b = new BuyAndSellStock();
        int res = b.maxProfit(arr);

        System.out.println(res);
    }


    public int maxProfit(int[] prices) {
        int minBuy = Integer.MAX_VALUE;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < minBuy) minBuy = prices[i];

            if (profit < prices[i] - minBuy)
            {
                profit = prices[i] - minBuy;
            }

        }

        return profit;
    }
}
