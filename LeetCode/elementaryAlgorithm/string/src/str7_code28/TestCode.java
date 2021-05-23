package str7_code28;

/**
 * @ClassName TestCode
 * @Description TODO
 * 实现 strStr() 函数。
 *
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 *
 * 示例 1:
 *
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 * 示例 2:
 *
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 * 说明:
 *
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 *
 * 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/implement-strstr
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author 15588
 * @Date 2021/3/27 22:09
 * @Version 1.0
 */
public class TestCode {
    public static void main(String[] args) {

        String haystack;
        String needle;
        //test1
        haystack = "hello";
        needle = "ll";

        //test2
        haystack = "aaaaa";
        needle = "bba";

        //test3
        haystack = "hello";
        needle = "ll";

        //test4
        haystack = "";
        needle = "";

        Solution sol = new Solution();
        int res = sol.strStr(haystack, needle);
        System.out.println(res);

    }
}

//思路一：截取长字段的部分与短字段逐一比较
//class Solution {
//    public int strStr(String haystack, String needle) {
//
//        int hl = haystack.length();
//        int nl = needle.length();
//
//        if (haystack.equalsIgnoreCase(needle) || nl == 0 ){
//            return 0;
//        }
//
//        if (hl == 0 || (hl < nl)) {
//            return -1;
//        }
//
//        int idx = 0;
//        while (idx <= haystack.length() - needle.length()) {
//            if (haystack.substring(idx, idx + nl).equalsIgnoreCase(needle)){
//                return idx;
//            }
//            idx++;
//        }
//        return - 1;
//    }
//}

//思路二：Java官方的API
class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
