package org.example;

public class LeetBuySellStocks {
    public static void main(String[] args) {
        int[] prices = { 7,6,4,3,1 };

        int left = 0;
        int right = 1;
        int maxP = 0;
        int profit = 0;

        while(right < prices.length) {
            if(prices[left] < prices[right]) {
                profit = prices[right] - prices[left];
                maxP = Math.max(maxP, profit);
            } else {
                left = right;
            }

            right++;

        }

        System.out.println(maxP);

    }
}
