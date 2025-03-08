package leetcode;


/*You are given an integer array prices[], where prices[i] represents the stock price on day i.

You can buy and sell multiple times (buy 1 share, sell it later, then buy again).
You cannot hold more than one share at a time (must sell before buying again).*/

public class BuySellStock2 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i-1]) {
                maxProfit =maxProfit + (prices[i] - prices[i-1]);
            }
        }
        System.out.println(maxProfit);

        /*int j = 0;
        int profit = 0;

        for (int i = 1; i < arr.length ; i++) {
            if(arr[j] < arr[i]) {
                profit += arr[i] - arr[j];
                j++;
            } else j++;

        }*/
       // System.out.println(profit);
    }
}
