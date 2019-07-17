package Leetcode.easy;

/**
 * 题意：和121题不同的地方是可以多次买卖任意次，然后求多次买卖后最大利润
 * 思路:贪心思想，最大的收益方法就是尽可能多的低入高抛，只要明天比今天价格高，就今天买，明天卖
 * @author Dennis
 * @date 2017/12/13
 *
 */
public class Problem122BestTimetoBuyandSellStockII {

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i]> prices[i-1])
                maxProfit += prices[i]-prices[i-1];
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{7,1,4,3,6};
        System.out.println(maxProfit(prices));
    }


}
