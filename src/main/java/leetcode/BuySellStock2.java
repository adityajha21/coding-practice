package leetcode;

public class BuySellStock2 {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int j = 0;
        int profit = 0;

        for (int i = 1; i < arr.length ; i++) {
            if(arr[j] < arr[i]) {
                profit += arr[i] - arr[j];
                j++;
            } else j++;

        }
        System.out.println(profit);
    }
}
