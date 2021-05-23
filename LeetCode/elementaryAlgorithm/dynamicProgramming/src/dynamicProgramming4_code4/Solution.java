package dynamicProgramming4_code4;

import java.util.Arrays;

/**
 * @ClassName Solution
 * @Description TODO
 *动态规划的的四个解题步骤是：
 *
 * 定义子问题
 * 写出子问题的递推关系
 * 确定 DP 数组的计算顺序
 * 空间优化（可选）
 * @Author 15588
 * @Date 2021/5/7 20:38
 * @Version 1.0
 */
public class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int length = nums.length;
        if (length == 1) {
            return nums[0];
        }
        int first = nums[0], second = Math.max(nums[0], nums[1]);
        for (int i = 2; i < length; i++) {
            int temp = second;
            second = Math.max(first + nums[i], second);
            first = temp;
        }
        return second;
    }

    public static void main(String[] args) {

    }
}
