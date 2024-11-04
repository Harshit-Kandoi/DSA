public class BuySellStock {
    
    public static int calculateMaxProfit(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (buyPrice < price) {  // Calculate profit if buy price is less than current price
                int profit = price - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = price;  // Update buy price to the current price
            }
        }
        
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit: " + calculateMaxProfit(prices));
    }
}
