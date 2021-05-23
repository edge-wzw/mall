package array6_code350;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName TestCode
 * @Description TODO
 * 给定两个数组，编写一个函数来计算它们的交集。
 * 说明：
 * 输出结果中每个元素出现的次数，应与元素在两个数组中出现次数的最小值一致。
 * 我们可以不考虑输出结果的顺序。
 * 进阶：
 * 如果给定的数组已经排好序呢？你将如何优化你的算法？
 * 如果nums1的大小比nums2小很多，哪种方法更优？
 * 如果nums2的元素存储在磁盘上，内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/intersection-of-two-arrays-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author 15588
 * @Date 2021/3/24 16:42
 * @Version 1.0
 */
public class TestCode {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        Solution sol = new Solution();
        int[] results = sol.intersect(nums1, nums2);
        for (int n : results) {
            System.out.println(n);
        }
    }
}

//思路一：哈希表：
//利用哈希表，首先根据数组长度区分长数组和短数组，然后根据短数组的长度生成一个results数组（用来存储结果）。
//遍历短数组，统计数字出现频率并存入哈希表中；然后遍历长数组，当找到相同数字时，将该数字存入results数组中，并且哈希表中对应频次减一，同时idx++；
//最后从results中取出为长度为idx的数组

//实现1：
//执行用时：3 ms, 在所有 Java 提交中击败了69.70%的用户
//内存消耗：38.7 MB, 在所有 Java 提交中击败了55.85%的用户
//class Solution {
//    public int[] intersect(int[] nums1, int[] nums2) {
//        int[] minLengthArray = (nums1.length <= nums2.length) ? nums1 : nums2;
//        int[] maxLengthArray = (nums1.length <= nums2.length) ? nums2 : nums1;
//        int[] results = new int[minLengthArray.length];
//        int idx = 0;
//
//        HashMap<Integer, Integer> numCountSet = new HashMap<>();
//        for (int n : minLengthArray) {
//            if (!numCountSet.containsKey(n)) {
//                numCountSet.put(n, 1);
//            } else {
//                numCountSet.put(n, numCountSet.get(n) + 1);
//            }
//        }
//
//        for (int n : maxLengthArray) {
//            if (numCountSet.containsKey(n) && (numCountSet.get(n) > 0)) {
//                results[idx++] = n;
//                numCountSet.put(n, numCountSet.get(n) - 1);
//            }
//        }
//
//        return Arrays.copyOfRange(results, 0, idx);
//    }
//}

//实现2：类似实现1，只是采用ArrayList存储结果，然后通过流转回 int[]
//执行用时：6 ms, 在所有 Java 提交中击败了15.53%的用户
//内存消耗：38.7 MB, 在所有 Java 提交中击败了35.65%的用户
//class Solution {
//    public int[] intersect(int[] nums1, int[] nums2) {
//        int[] minLengthArray = (nums1.length <= nums2.length) ? nums1 : nums2;
//        int[] maxLengthArray = (nums1.length <= nums2.length) ? nums2 : nums1;
//        ArrayList<Integer> results = new ArrayList<>();
//
//        HashMap<Integer, Integer> numCountSet = new HashMap<>();
//        for (int n : minLengthArray) {
//            if (!numCountSet.containsKey(n)) {
//                numCountSet.put(n, 1);
//            } else {
//                numCountSet.put(n, numCountSet.get(n) + 1);
//            }
//        }
//
//        for (int n : maxLengthArray) {
//            if (numCountSet.containsKey(n) && (numCountSet.get(n) > 0)) {
//                results.add(n);
//                numCountSet.put(n, numCountSet.get(n) - 1);
//            }
//        }
//
//        return results.stream().mapToInt(Integer::valueOf).toArray();
//    }
//}

//实现3：官方哈希表解法
//执行用时：3 ms, 在所有 Java 提交中击败了69.70%的用户
//内存消耗：38.7 MB, 在所有 Java 提交中击败了48.40%的用户
//class Solution {
//    public int[] intersect(int[] nums1, int[] nums2) {
//        if (nums1.length > nums2.length) {
//            return intersect(nums2, nums1);
//        }
//        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//        for (int num : nums1) {
//            int count = map.getOrDefault(num, 0) + 1;
//            map.put(num, count);
//        }
//        int[] intersection = new int[nums1.length];
//        int index = 0;
//        for (int num : nums2) {
//            int count = map.getOrDefault(num, 0);
//            if (count > 0) {
//                intersection[index++] = num;
//                count--;
//                if (count > 0) {
//                    map.put(num, count);
//                } else {
//                    map.remove(num);
//                }
//            }
//        }
//        return Arrays.copyOfRange(intersection, 0, index);
//    }
//}

//思路2：排序+双指针
//实现1
//执行用时：2 ms, 在所有 Java 提交中击败了86.45%的用户
//内存消耗：38.8 MB, 在所有 Java 提交中击败了17.20%的用户
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        //通过递归保证nums1是短数组
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int[] results = new int[Math.min(nums1.length, nums2.length)];
        int idx = 0;
        int idx1 = 0;
        int idx2 = 0;
        while (idx1 < nums1.length && idx2 < nums2.length){
            if (nums1[idx1] > nums2[idx2]) {
                idx2++;
            }else if (nums1[idx1] < nums2[idx2]){
                idx1++;
            }else {
                results[idx] = nums1[idx1];
                idx++;
                idx1++;
                idx2++;
            }
        }

        return Arrays.copyOfRange(results, 0, idx);

    }
}


