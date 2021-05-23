package str8_code38;

/**
 * @ClassName Solution
 * @Description 外观数列 https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnpvdm/
 * @Author 15588
 * @Date 2021/3/29 16:17
 * @Version 1.0
 */
public class Solution {
    public static void main(String[] args) {
        int n = 6;
        Solution sol = new Solution();
        String say = sol.countAndSay(n);

        System.out.println(say);
    }

    /*
     * @param n:
     * @return: java.lang.String
     * @author:
     * @date:
     * @description:思路1, 利用递归 + 双指针
     */
    public String countAndSay(int n) {
        //初始字符串
        if (n == 1) {
            return "1";
        }

        String frontStr = countAndSay(n - 1);
        String res = "";
        int count = 1;

        //字符串长度为1的情况
        if (frontStr.length() == 1) {
            res += (count + "" + frontStr.charAt(0));
            return res;
        }

        //字符串长度为2的情况
        if (frontStr.length() == 2) {
            if (frontStr.charAt(0) == frontStr.charAt(1)) {
                res += (++count + "" + frontStr.charAt(0));
            } else {
                res += (count + "" + frontStr.charAt(0)) + (count + "" + frontStr.charAt(1));
            }
            return res;
        }

        //字符串大于2的情况
        int j = 0;
        for (int i = 1; i < frontStr.length(); i++) {
            if (frontStr.charAt(i) != frontStr.charAt(j)){
                res += (count + "" + frontStr.charAt(j));
                j = i;
                count = 0;
            }
            count++;
            if (i == frontStr.length()- 1){
                res += count + "" + frontStr.charAt(i);
            }
        }
        return res;
    }
}
