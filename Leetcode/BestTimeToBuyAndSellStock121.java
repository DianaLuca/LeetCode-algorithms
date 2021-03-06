package Algorithms.Leetcode;

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock),
 * design an algorithm to find the maximum profit.
 *
 * As in the problem's editorial solution:
 * If we plot the numbers of the given array on a graph, we need to find the largest peak following the smallest valley.
 * We can maintain two variables - minprice and maxprofit corresponding to the smallest valley and maximum profit
 * (maximum difference between selling price and minprice) obtained so far respectively.
 *
 * Created by dianaluca on 9/23/16.
 */

public class BestTimeToBuyAndSellStock121 {

  public static int maxProfit(int[] prices) {
    int min = (1<<30) - 1 + (1<<30); // max int
    int maxProfit = 0;

    for (int i = 0; i < prices.length; i++) {
      min = Math.min(prices[i], min);
      maxProfit = Math.max(maxProfit, prices[i] - min);
    }

    return maxProfit;
  }

  public static void main(String[] args) {
    int[] prices = {5, 10, 1};
    System.out.println(maxProfit(prices)); // should return 5
  }
}
