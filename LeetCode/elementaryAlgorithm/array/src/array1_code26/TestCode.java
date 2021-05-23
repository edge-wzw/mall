package array1_code26;
/**
 * @ClassName TestCode
 * @Description
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author 15588
 * @Date 2021/3/11 8:55
 * @Version 1.0
 */
public class TestCode {
    public static void main(String[] args) {
        int[] nums = new int []{1,1,2};

        Solution sol = new Solution();
        int num = sol.removeDuplicates(nums);
        System.out.print("[");
        for (int i = 0; i < num; i++) {
            System.out.print(nums[i] + ",");
        }
        System.out.print("]");

    }
}

//思路：
// 利用快慢双指针的方法。快指针用于遍历所有值，以找到重复项，慢指针用于更改重复项。具体操作为初始快慢指针分别为1,0.
// 快指针遍历到与慢指针不同的值时，将快指针的值赋值给慢指针的下一项，重复操作，直到遍历结束，返回慢指针的值+1，即为数组中不重复数字的长度
class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 1;j<nums.length;j++){
            if(nums[j] != nums[i]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i + 1;
    }
}