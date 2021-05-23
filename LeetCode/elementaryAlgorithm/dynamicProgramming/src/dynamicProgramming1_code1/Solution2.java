package dynamicProgramming1_code1;

/**
 * @ClassName Solution
 * @Description TODO
 * 动态规划算法优化
 * @Author 15588
 * @Date 2021/5/7 20:38
 * @Version 1.0
 */
public class Solution2 {
    public static int climbStairs(int n) {
        if (n <= 1){
            return 1;
        }
        if (n <= 3){
            return n;
        }
        int prev = 1;
        int curr = 2;
        for (int i = 3; i <= n; i++) {
            int sum = prev + curr;
            prev = curr;
            curr = sum;
        }
        return curr;
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
