package str9_code14;

/**
 * @ClassName Solution
 * @Description 最长公共前缀  https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnmav1/
 * @Author 15588
 * @Date 2021/4/5 14:51
 * @Version 1.0
 */
public class Solution {
    //test
    public static void main(String[] args) {
        String[] testStr1 = {"flower", "flow", "flight"};
        String[] testStr2 = {"dog", "racecar", "car"};

        Solution sol = new Solution();
        String s = sol.longestCommonPrefix(testStr1);
        System.out.println(s);
    }

    //思路1
//    public String longestCommonPrefix(String[] strs) {
//        if (strs == null || strs.length ==0){
//            return "";
//        }
//        if (strs.length == 1){
//            return strs[0];
//        }
//
//
//        Arrays.sort(strs, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        });
//
//        String shortStr = strs[0];
//        int count = shortStr.length();
//        for (int i = 1; i < strs.length; i++) {
//            if (strs[i].startsWith(shortStr.substring(0, count))){
//                continue;
//            }
//            while (count >= 0){
//                if (strs[i].startsWith(shortStr.substring(0, count))){
//                    break;
//                }
//                count--;
//            }
//
//        }
//
//        return shortStr.substring(0, count);
//
//    }

    //思路1的改进，不需要找最短字符串, 横向扫描
    //依次遍历字符串数组中的每个字符串，对于每个遍历到的字符串，更新最长公共前缀，当遍历完所有的字符串以后，即可得到字符串数组中的最长公共前缀。
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0){return "";}

        String publicStr = strs[0];
        for (int i = 0; i < strs.length; i++) {
            publicStr = longestCommonStr(publicStr, strs[i]);
            if (publicStr.length() == 0){
                break;
            }
        }

        return publicStr;
    }

    public String longestCommonStr(String s1, String s2){
        int idx = 0;
        int shortLength = (s1.length() < s2.length())? s1.length():s2.length();
        while (idx < shortLength && s1.charAt(idx) == s2.charAt(idx)){
            idx++;
        }
        return s1.substring(0, idx);
    }

    //思路2，纵向扫描。
    // 纵向扫描时，从前往后遍历所有字符串的每一列，比较相同列上的字符是否相同，如果相同则继续对下一列进行比较，如果不相同则当前列不再属于公共前缀，当前列之前的部分为最长公共前缀。
    //作者：LeetCode-Solution
    //链接：https://leetcode-cn.com/problems/longest-common-prefix/solution/zui-chang-gong-gong-qian-zhui-by-leetcode-solution/
    //来源：力扣（LeetCode）
    //著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
//    public String longestCommonPrefix(String[] strs) {
//        if (strs == null || strs.length == 0) {
//            return "";
//        }
//        int length = strs[0].length();
//        int count = strs.length;
//        for (int i = 0; i < length; i++) {
//            char c = strs[0].charAt(i);
//            for (int j = 1; j < count; j++) {
//                if (i == strs[j].length() || strs[j].charAt(i) != c) {
//                    return strs[0].substring(0, i);
//                }
//            }
//        }
//        return strs[0];
//    }



}


