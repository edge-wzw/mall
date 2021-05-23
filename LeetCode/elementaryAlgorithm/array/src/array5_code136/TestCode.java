package array5_code136;

/**
 * @ClassName TestCode
 * @Description TODO
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 说明：
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/single-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author 15588
 * @Date 2021/3/24 16:44
 * @Version 1.0
 */
public class TestCode {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        Solution sol = new Solution();
        int singleNumber = sol.singleNumber(nums);
        System.out.println(singleNumber);
    }
}

//解法一：利用位运算中的异或运算--如果相对应位值相同，则结果为0，否则为1.
// 0与任何数的异或运算为数本身，数与自身的异或值为0
class Solution {
    public int singleNumber(int[] nums) {
        int s = 0;
        for (int n : nums
        ) {
            s ^= n;
        }
        return s;
    }
}