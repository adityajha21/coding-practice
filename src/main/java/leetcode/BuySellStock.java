package leetcode;

public class BuySellStock {
    public static void main(String[] args) {
        int[] price = {7,1,5,3,6,4};
        int buyPrice = price[0];
        int maxProfit = 0;

        // First find minimum price
        for(int i=0; i<price.length; i++) {
            if(buyPrice > price[i]) {
                buyPrice = price[i];
            } else if (price[i] - buyPrice > maxProfit)  {
                maxProfit = price[i] - buyPrice;
            }
        }
        System.out.println("Minimum Price is " + maxProfit);

    }
}
