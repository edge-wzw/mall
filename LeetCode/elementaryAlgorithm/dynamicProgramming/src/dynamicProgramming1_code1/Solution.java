package dynamicProgramming1_code1;

/**
 * @ClassName Solution
 * @Description TODO
 * 递归解法，可以解出结果，但是当n比较大时容易超时
 * @Author 15588
 * @Date 2021/5/7 20:38
 * @Version 1.0
 */
public class Solution {
    public static int climbStairs(int n) {

        if (n == 1){
            return 1;
        }else if (n == 2){
            return 2;
        }
        return climbStairs(n - 1) + climbStairs(n -2);
    }

    public static void main(String[] args) {
//        for (int i = 1; i < 10; i++) {
//            int stairs = climbStairs(i);
//            System.out.println(stairs);
//        }
        int stairs = climbStairs(45);
        System.out.println(stairs);
    }
}
