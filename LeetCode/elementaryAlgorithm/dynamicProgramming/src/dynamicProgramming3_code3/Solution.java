package dynamicProgramming3_code3;

import java.util.Arrays;

/**
 * @ClassName Solution
 * @Description TODO
 * 最大子序和
 * 思路：定义最大子序和函数为 f(n-1)为数组前n-1个数据的最大连续和，求 f(n)的数组最大子序和本质就是对比 f(n-1), nums[n], f(n-1)+nums[n]三者的最大值
 * 参考文章:
 * https://leetcode-cn.com/problems/maximum-subarray/solution/xiang-xi-jie-du-dong-tai-gui-hua-de-shi-xian-yi-li/
 * @Author 15588
 * @Date 2021/5/7 20:38
 * @Version 1.0
 */
public class Solution {
    public static int maxSubArray(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }
        int sum = 0, maxAns = 0;
        for (int num : nums) {
            sum = Math.max(sum, num);
            maxAns = Math.max(sum, sum + num);
        }

        return maxAns;
    }

    public static void main(String[] args) {
    }
}
