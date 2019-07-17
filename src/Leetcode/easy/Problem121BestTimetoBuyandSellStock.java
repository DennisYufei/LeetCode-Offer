package Leetcode.easy;

/**
 * 题意：最低价买进，最高价卖出，一次买入和卖出，求最大利润
 * 思路：1、brute force蛮力法，两个for循环不断比较
 *      2、双指针法，用一个min来保存买进的最低价，一个res来保存当天的价格减去最低价，也就是最大利润
 * @author Dennis
 * @date 2017/12/13
 *
 */
public class Problem121BestTimetoBuyandSellStock {

    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int res = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min)
                min = prices[i];
            else if ((prices[i] - min) > res)
                res = prices[i] - min;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6};
        int[] prices2 = new int[]{7, 6, 4, 3, 1};
        System.out.println(maxProfit(prices));
        System.out.println(maxProfit(prices2));

    }


}
