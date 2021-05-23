package array8_code283;

import java.util.Arrays;

/**
 * @ClassName TestCode
 * @Description TODO
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 说明:
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 * @Author 15588
 * @Date 2021/3/24 21:20
 * @Version 1.0
 */
public class TestCode {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        Solution sol = new Solution();
        sol.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}

//思路：双指针
//实现1：
//class Solution {
//    public void moveZeroes(int[] nums) {
//        int idx = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0){
//                nums[idx++] = nums[i];
//            }
//        }
//        for (int i = idx; i < nums.length; i++) {
//            nums[i] = 0;
//        }
//    }
//}

//实现2
class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;
        while (right < nums.length){
            if (nums[right] != 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
            right++;
        }

    }
}

