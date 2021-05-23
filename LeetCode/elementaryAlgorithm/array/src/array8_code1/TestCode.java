package array8_code1;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @ClassName TestCode
 * @Description TODO
 * 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author 15588
 * @Date 2021/3/24 21:44
 * @Version 1.0
 */
public class TestCode {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        Solution sol = new Solution();
        int[] res = sol.twoSum(nums, target);
        System.out.println(Arrays.toString(res));
    }
}

//思路一：双层循环，保证指针不同即可
//执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
//内存消耗：38.8 MB, 在所有 Java 提交中击败了10.41%的用户
//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if (i != j && nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return null;
//    }
//}

//思路2:哈希表
// 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
// 内存消耗：38.4 MB, 在所有 Java 提交中击败了93.74%的用户
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (countMap.containsKey(target - nums[i])){
                return new int[]{i, countMap.get(target - nums[i])};
            }
            countMap.put(nums[i], i);
        }
        return null;
    }
}
