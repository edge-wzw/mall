package str5_code125;

/**
 * @ClassName TestCode
 * @Description TODO
 * @Author 15588
 * @Date 2021/3/25 10:56
 * @Version 1.0
 */
public class TestCode {
    public static void main(String[] args) {
        String s = new String("A man, a plan, a canal: Panama");
        String s1 = new String("race a car");
        Solution sol = new Solution();
        boolean b = sol.isPalindrome(s);
        System.out.println(b);
    }
}

//思路一：转换成全小写之后，利用双指针判断
//class Solution {
//    public boolean isPalindrome(String s) {
//        char[] sArray = s.toLowerCase().replaceAll("[^0-9a-z]", "").toCharArray();
//        int left = 0, right = sArray.length - 1;
//        while (left < right){
//            if (sArray[left] != sArray[right]){
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;
//    }
//}

//思路二：保留数字和字母，然后利用StringBuffer翻转并对比
//class Solution {
//    public boolean isPalindrome(String s) {
//        StringBuffer sb1 = new StringBuffer(s.replaceAll("[^0-9a-zA-Z]", ""));
//        StringBuffer sb2 = new StringBuffer(sb1).reverse();
//        if (sb1.toString().equalsIgnoreCase(sb2.toString())){
//            return true;
//        }
//        return false;
//    }
//}

//思路二：官方解法，在原字符串上直接判断
class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int left = 0, right = n - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                ++left;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                --right;
            }
            if (left < right) {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }
                ++left;
                --right;
            }
        }
        return true;
    }
}