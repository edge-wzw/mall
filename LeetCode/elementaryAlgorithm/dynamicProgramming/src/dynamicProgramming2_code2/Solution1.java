package dynamicProgramming2_code2;

import java.util.Arrays;

/**
 * @ClassName Solution
 * @Description TODO
 * 在Solution的基础上优化，利用变量存储前n天的最大利润
 * @Author 15588
 * @Date 2021/5/7 20:38
 * @Version 1.0
 */
public class Solution1 {
    public static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > minPrice){
                res = (prices[i] - minPrice > res)? prices[i] - minPrice:res;
            }else {
                minPrice = prices[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int maxProfitNum = maxProfit(arr);
        System.out.println(maxProfitNum);
    }
}

//论坛类似代码
//class Solution {
//    // 使用动态规划(dp)的方法
//    public int maxProfit(int[] prices) {
//        // 这里的prices数组存放的是股票第i天的价格~
//        if(prices.length<=1) return 0; //数组中没内容 返回0
//        int max = 0;                    //设置一个理论最大值
//        int min = prices[0];            //设置理论最小值
//        for(int i = 1; i < prices.length; i++){
//            //依次更新min和max
//            min = Math.min(min,prices[i]);    //min记录"第i天"之前的最低价
//            max = Math.max(max,prices[i]-min);//每天思考 今日价格-目前的最低价min 是否是最大的
//        }
//        return max;
//    }
//}