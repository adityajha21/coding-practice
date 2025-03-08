package leetcode;

/*You are given an array prices[], where prices[i] represents the stock price on day i.
Find the maximum profit by choosing one day to buy and one later day to sell.*/

public class BuySellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,40};
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(Integer price : prices) {
            minPrice = Math.min(minPrice, price );
            maxProfit = Math.max(maxProfit, price-minPrice);
        }
        System.out.println(maxProfit);
      /*  int buyPrice = price[0];
        int maxProfit = 0;

        // First find minimum price
        for(int i=0; i<price.length; i++) {
            if(buyPrice > price[i]) {
                buyPrice = price[i];
            } else if (price[i] - buyPrice > maxProfit)  {
                maxProfit = price[i] - buyPrice;
            }
        }*/
        System.out.println("Minimum Price is " + maxProfit);

    }
}
