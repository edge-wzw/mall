package array4_code217;
import java.util.*;
/**
 * @ClassName TestCode
 * @Description TODO
 * 给定一个整数数组，判断是否存在重复元素。
 * 如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/contains-duplicate
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author 15588
 * @Date 2021/3/21 19:31
 * @Version 1.0
 */
public class TestCode {
    public static void main(String[] args) {
//        int[] nums = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        int[] nums = new int[]{1, 2, 3, 1};
        Solution sol = new Solution();
        boolean isRepeatNum = sol.containsDuplicate(nums);
        System.out.println(isRepeatNum);
    }
}


//方法一，利用HashMap存储key-value
//class Solution {
//    public boolean containsDuplicate(int[] nums) {
//        Map<Integer, Integer> maps = new HashMap<>();
//        for (int k:nums
//             ) {
//            if (maps.containsKey(k) == false){
//                maps.put(k,1);
//            }else {
//                return true;
//            }
//        }
//        return false;
//
//    }
//}

//利用Hash-Set
//class Solution {
//    public boolean containsDuplicate(int[] nums) {
//        Set<Integer> set = new HashSet<>();
//        for (int n : nums) {
//            if (!set.add(n)){
//                return true;
//            }
//        }
//        return false;
//    }
//}


//方法二：先排序，然后利用双指针
//class Solution {
//    public boolean containsDuplicate(int[] nums) {
//        Arrays.sort(nums);
//        int i = 1;
//        for (int j = 0; j < nums.length - 1; j++, i++) {
//            if (nums[i] == nums[j]){
//                return true;
//            }
//        }
//        return false;
//    }
//}

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1;i++) {
            if (nums[i] == nums[i + 1]){
                return true;
            }
        }
        return false;
    }
}