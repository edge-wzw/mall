package str6_code8;

/**
 * @ClassName TestCode
 * @Description TODO
 * @Author 15588
 * @Date 2021/3/25 22:05
 * @Version 1.0
 */
public class TestCode {
    public static void main(String[] args) {
        String s1 = new String("   -42");
        String s2 = new String("4193 with words");
        String s3 = new String("words and 987");
        String s4 = new String("-91283472332");
        String s5 = new String("42");
        String s6 = new String("2000000000000000000000");

//        Solution sol = new Solution();
//        int res = sol.myAtoi(s6);
//        System.out.println(res);
    }
}


//思路一：暴力？判断所有结果为0的情况，然后利用指针索引找到所以满足条件的数字字符，转成int后返回（注意溢出）
//class Solution {
//    public int myAtoi(String s) {
//        s = s.trim();
//        if (s.length() == 0 || (s.length()==1 && !Character.isDigit(s.charAt(0)))){
//            return 0;
//        }
//        if ((Character.isLetter(s.charAt(0)) || s.charAt(0) == '.') || (!Character.isDigit(s.charAt(0)) && !Character.isDigit(s.charAt(1)))){
//            return 0;
//        }
//
//        boolean isNegative = false;
//        String res = new String();
//        int idx = 0;
//        if (s.charAt(idx) == '-'){
//            isNegative = true;
//            idx++;
//        } else if (s.charAt(idx) == '+'){
//            idx++;
//        }
//
//        while (idx < s.length()){
//            if (Character.isDigit(s.charAt(idx))){
//                res += s.charAt(idx);
//                idx++;
//            }else {
//                break;
//            }
//        }
//
//        int resInt;
//        try {
//            resInt = Integer.parseInt(res);
//        } catch (NumberFormatException e) {
//            if (isNegative){
//                return Integer.MIN_VALUE;
//            }else {
//                return Integer.MAX_VALUE;
//            }
//        }
//
//        return isNegative? -resInt:resInt;
//
//
//    }
//}

//思路二：
//class Solution {
//    public int myAtoi(String s) {
//        s = s.trim();
//        int idx = 0;
//        int res = 0;
//
//        if (s.length() == 0){
//            return 0;
//        }
//
//        int isNegative = s.charAt(idx++)=='-'? 1:0;
//
//        while (idx < s.length()){
//            int dig = s.charAt(idx) - '0';
//            if (dig > 0 && dig < 9){
//                if ()
//                res *= 10;
//                res += dig;
//                idx++;
//            }
//        }
//
//
//
//    }
//}