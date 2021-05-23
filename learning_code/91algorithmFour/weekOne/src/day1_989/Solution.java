package day1_989;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName Solution
 * @Description TODO
 * @Author 15588
 * @Date 2021/5/10 16:41
 * @Version 1.0
 */
public class Solution {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> res = new LinkedList<>();
        int carry = 0;      //进位数，1表示进位，0表示无进位
        int sum;    //求和的值
        int n = num.length - 1;     //遍历数组时的索引
        while (k != 0 || n >= 0){
            sum = carry + (k % 10);
            if (n >= 0){
                sum += num[n];
            }

            carry = (sum > 9) ? 1:0;
            res.addFirst(sum % 10);
            n--;
            k = k / 10;
        }

        if (carry == 1){res.addFirst(1);}

        return res;
    }
    public static void main(String[] args) {
        int[] arr = {9,9,9,9,9,9,9,9,9,9,9,9,9,9,9};
        int k = 56;
        List<Integer> res = addToArrayForm(arr, k);
        System.out.println(res);
    }
}
