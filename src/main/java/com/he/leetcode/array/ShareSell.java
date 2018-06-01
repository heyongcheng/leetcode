package com.he.leetcode.array;

/**
 * @author heyc
 * @date 2018/6/1 13:28
 */
public class ShareSell {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{6,5,6,4,3,4}));
    }

    public static int maxProfit(int[] prices) {
        int sum = 0;
        int in = -1;
        for (int i=0; i<prices.length -1; i++) {
            if (in < 0 && prices[i] < prices[i + 1]) {
                in = i;
            } else if (in >= 0 && prices[i] > prices[in] && prices[i] > prices[i + 1]) {
                sum += prices[i] - prices[in];
                in = -1;
            }
        }
        if (in >= 0) {
            sum += prices[prices.length-1] - prices[in];
        }
        return sum;
    }

}
