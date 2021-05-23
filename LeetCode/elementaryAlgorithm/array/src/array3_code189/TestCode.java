package array3_code189; /**
 * @author Edge
 * @create 2021$-38$-17$-10:38$
 * @description:
 */

/**
 *@ClassName TestCode
 *@Description TODO
 * 给定一个数组，将数组中的元素向右移动k个位置，其中k是非负数。
 * 进阶：
 * 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
 * 你可以使用空间复杂度为O(1) 的原地算法解决这个问题吗？
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/rotate-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *@Author 15588
 *@Date 2021/3/17 10:38
 *@Version 1.0
 */
public class TestCode {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4,5,6,7};
        int k = 3;
        Solution sol = new Solution();
        sol.rotate(nums, k);
        for (int num:nums
        ) {
            System.out.println(num);
        }
    }
}

//解法一
//思路：利用额外数组，移动后的元素在新数组的 （i+k）mod n 位置上
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] temp = new int[n];
        for (int i = 0; i < n; ++i) {
            temp[(i+k)%n] = nums[i];
        }
        System.arraycopy(temp, 0, nums, 0, n);
    }
}

//解法二
//思路：翻转数组
//class Solution {
//    public void rotate(int[] nums, int k) {
//        int n = nums.length;;
//        k %= n;
//        reverse(nums, 0, n-1);
//        reverse(nums, 0, k-1);
//        reverse(nums, k, n-1);
//    }
//
//    public void reverse(int[] nums, int start, int end){
//        while (start < end) {
//            int temp = nums[start];
//            nums[start] = nums[end];
//            nums[end] = temp;
//            start++;
//            end--;
//        }
//    }
//
//}



