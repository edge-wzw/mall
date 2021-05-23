package str3_code387;

/**
 * @ClassName Solution
 * @Description
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * 示例：
 * s = "leetcode"
 * 返回 0
 * s = "loveleetcode"
 * 返回 2
 * 提示：你可以假定该字符串只包含小写字母。
 * 相关标签 哈希表 字符串
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xn5z8r/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @Author 15588
 * @Date 2021/4/8 21:42
 * @Version 1.0
 */
public class Solution {
    public static void main(String[] args) {

    }

    public int firstUniqChar(String s) {
        int [] freq = new int [26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)- 'a'] ++;
        }
        for (int i = 0; i < s.length(); i++) {
            if(freq[s.charAt(i)- 'a'] == 1){
                return i;
            }
        }
        return -1;

    }
}
