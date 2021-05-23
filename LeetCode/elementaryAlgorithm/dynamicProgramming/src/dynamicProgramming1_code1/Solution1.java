package dynamicProgramming1_code1;

/**
 * @ClassName Solution
 * @Description TODO
 * 动态规划算法
 * @Author 15588
 * @Date 2021/5/7 20:38
 * @Version 1.0
 */
public class Solution1 {
    public static int climbStairs(int n) {
        if (n <= 1){
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
//        for (int i = 1; i < 10; i++) {
//            int stairs = climbStairs(i);
//            System.out.println(stairs);
//        }
        int stairs = climbStairs(10);
        System.out.println(stairs);
    }
}
