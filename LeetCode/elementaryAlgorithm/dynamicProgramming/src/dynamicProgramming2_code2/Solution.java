package dynamicProgramming2_code2;

import java.util.Arrays;

/**
 * @ClassName Solution
 * @Description TODO
 * 利用数组存储前n天的最大利润值
 * @Author 15588
 * @Date 2021/5/7 20:38
 * @Version 1.0
 */
public class Solution {
    public static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int[] sum = new int[prices.length];
        sum[0] = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > minPrice){
                sum[i] = prices[i] - minPrice;
            }else {
                minPrice = prices[i];
                sum[i] = 0;
            }
        }
        Arrays.sort(sum);
        return sum[sum.length - 1];
    }

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int i = maxProfit(arr);
        System.out.println(i);
    }
}
