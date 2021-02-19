package 剑指offerAll;

public class 股票的最大利润 {

    /**假设把某股票的价格按照时间先后顺序存储在数组中，请问买卖该股票一次可能获得的最大利润是多少？*/

    /**
     * 我们需要找出给定数组中两个数字之间的最大差值（即，最大利润）。此外，第二个数字（卖出价格）必须大于第一个数字（买入价格）。
     * <p>
     * 形式上，对于每组 ii 和 jj（其中 j > ij>i）我们需要找出 \max(prices[j] - prices[i])max(prices[j]−prices[i])。
     * <p>
     * 。
     */

    public int maxProfit(int prices[]) {
        int maxPrice = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit =prices[j]-prices[i];
                if (profit > maxPrice){
                    maxPrice = profit;
                }
            }
        }
        return maxPrice;

    }

}
