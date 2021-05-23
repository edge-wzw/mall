package array7_code66;

import java.util.Arrays;

/**
 * @ClassName TestCode
 * @Description TODO
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/plus-one
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author 15588
 * @Date 2021/3/24 20:36
 * @Version 1.0
 */
public class TestCode {
    public static void main(String[] args) {
        int[] digits = new int[]{9, 9, 9, 9};
        Solution sol = new Solution();
        int[] results = sol.plusOne(digits);
        System.out.println(Arrays.toString(results));
    }
}

//思路一：如果数组最后一位数不是9，则将数组最后一位数++，然后返回即可;
// 如果数组最后一位数是9，则从数组最后一位数开始开始遍历，遇到9则赋值为0，否则自加1;
//如果遍历到数组开头都是9，则生成新数组(长度为原数组+1)，将新数组第一个数字赋值为1，返回
//执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
//内存消耗：36.8 MB, 在所有 Java 提交中击败了84.44%的用户
//class Solution {
//    public int[] plusOne(int[] digits) {
//        if (digits[digits.length - 1] < 9) {
//            digits[digits.length - 1]++;
//            return digits;
//        }
//
//        for (int i = digits.length - 1; i >= 0; i--) {
//            if (i == 0 && digits[i] == 9){
//                int[] res = new int[digits.length + 1];
//                res[0] = 1;
//                return res;
//            }
//            if (digits[i] != 9){
//                digits[i] += 1;
//                break;
//            }else {
//                digits[i] = 0;
//            }
//        }
//        return digits;
//
//    }
//}

//实现二：论坛代码
class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
