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
                int profit = prices[j] - prices[i];
                if (profit > maxPrice) {
                    maxPrice = profit;
                }
            }
        }
        return maxPrice;

    }


    public int maxP(int prices[]) {
        int minP = Integer.MIN_VALUE;
        int max = 0;
        for (int i=0;i<prices.length;i++){
            if (prices[i] <minP){
                minP=prices[i];
            }else if (prices[i]-minP >max){
                max=prices[i]-minP;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(7-Integer.MIN_VALUE);
    }

    public int maxProfit1(int[] prices) {
        if(prices.length == 0) return 0;
        int res = 0, min = prices[0];
        for(int i = 1; i < prices.length; i ++){
            min = Math.min(min, prices[i-1]);
            res = Math.max(res, prices[i] - min);
        }
        return res;

    }


}
