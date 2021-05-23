package sortAndSearch1_code;

import java.util.Arrays;

/**
 * @ClassName Solution
 * @Description 88. 合并两个有序数组 https://leetcode-cn.com/problems/merge-sorted-array/
 * 方法二：双指针
 * @Author 15588
 * @Date 2021/5/5 22:09
 * @Version 1.0
 */
public class Solution1 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0;
        int p2 = 0;
        int cur;
        int[] res = new int[m + n];
        while (p1 < m || p2 < n) {
            if (p1 == m) {
                cur = nums2[p2++];
            }else if (p2 == n){
                cur = nums1[p1++];
            }else if (nums1[p1] < nums2[p2]){
                cur = nums1[p1++];
            }
            else {
                cur = nums2[p2++];
            }
            res[p1 + p2 - 1] = cur;
        }
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = res[i];
        }

    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
    }
}
