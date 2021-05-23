package str2_code7;/**
 * @author Edge
 * @create 2021$-02$-19$-22:02$
 * @description:
 */

/**
 * @ClassName TestCode
 * @Description TODO
 * @Author 15588
 * @Date 2021/3/19 22:02
 * @Version 1.0
 */
public class TestCode {
    public static void main(String[] args) {
        int x = 1534236469;
        Solution solution = new Solution();
        int reverse = solution.reverse(x);
        System.out.println(reverse);
    }

}

//解法一，转换成字符串，翻转后再转回数字
//class Solution {
//    public int reverse(int x) {
//        StringBuffer stringBuffer = new StringBuffer(String.valueOf(Math.abs(x)));
//        stringBuffer.reverse();
//        int i;
//        try {
//            i = Integer.parseInt(String.valueOf(stringBuffer));
//            if (x < 0) {
//                return -i;
//            }else {
//                return i;
//            }
//        }catch (NumberFormatException n){
//            return 0;
//        }
//    }
//}


//官方数学解法
class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE && pop > 7 )){
                return 0;
            }
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE && pop < -8 )){
                return 0;
            }
            rev = rev * 10 + pop;
        }
        return rev;
    }
}